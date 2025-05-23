public class Jogo extends Produto{
    private int idade; 

    public Jogo(String nome, Double preco, int idade){
        super(nome, preco);
        this.idade = idade; 
    }

    @Override
    public String toString(){
        return super.toString() + this.idade; 
    }

}