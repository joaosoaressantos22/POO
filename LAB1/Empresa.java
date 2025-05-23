import java.util.HashSet;

public class Empresa {

    private String nome; 

    private HashSet<Departamento> departamentos = new HashSet<Departamento>();

    Empresa(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome; 
    }

    public void adicionarDepartamento(Departamento departamento){
        this.departamentos.add(departamento); 
    }

    public void removeDepartamento(Departamento departamento){
        this.departamentos.remove(departamento); 
    }

    public float getIdadeMediaEmpresa(){

        int idadeTotal= 0;

        HashSet<Pessoa> pessoas = new HashSet<>();

        for (Departamento departamento : this.departamentos){
            pessoas.addAll(departamento.getFuncionarios()); 

            // for(Pessoa pessoa : departamento.getFuncionarios()){

            //     pessoas.add(pessoa);
            //     idadeTotal += pessoa.getIdadePessoa();

            // }

        }

        return (pessoas.size()); 

    }

    public HashSet<Departamento> getDepartamentos(){
        return this.departamentos; 
    }

}