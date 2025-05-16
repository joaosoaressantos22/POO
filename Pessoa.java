import java.time.LocalDate; 

public class Pessoa {

    private String nome;
    private LocalDate dataNasc; 

    Pessoa(String nome, int ano, int mes, int dia){

        this.nome = nome;

        this.dataNasc = LocalDate.of(ano, mes, dia); 
        
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public int getIdadePessoa(){

        LocalDate dataAtual = LocalDate.now(); 

        int idadeAtual = (dataAtual.getYear() - this.dataNasc.getYear());

        if (dataAtual.getMonthValue() < this.dataNasc.getMonthValue()) idadeAtual--; 

        else if (dataAtual.getMonthValue() == this.dataNasc.getMonthValue()){

            if (dataAtual.getDayOfMonth() < this.dataNasc.getDayOfMonth()) idadeAtual--; 

        }
        return idadeAtual; 

    }

}