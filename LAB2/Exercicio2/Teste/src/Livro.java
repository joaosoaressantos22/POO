public class Livro extends Produto{
    private String autor; 

    public Livro(String nome, Double preco, String autor){
        super(nome, preco);
        this.autor = autor; 
    }

    @Override
    public String toString(){
        return super.toString() + this.autor; 
    }

}