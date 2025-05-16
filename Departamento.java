import java.util.HashSet;

public class Departamento {

    private String nome; 
    private HashSet<Pessoa> pessoas = new HashSet<Pessoa>();

    Departamento(String nome){
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome; 
    }

    public void adicionarDepartamento(Pessoa pessoa){
        this.pessoas.add(pessoa); 
    }

    public void removePessoa(Pessoa pessoa){
        this.pessoas.remove(pessoa);
    }

    // public int getIdadeTotal(){

    //     int idadePessoas = 0;

    //     for (Pessoa pessoa : pessoas){

    //         idadePessoas += pessoa.getIdadePessoa();
            
    //     }

    //     return idadePessoas; 
    // }

    public int getSizePessoas(){
        return pessoas.size(); 
    }

    public HashSet <Pessoa> getFuncionarios(){
        return this.pessoas; 
    }
}