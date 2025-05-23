public abstract class Produto {
    private String nome;
    private Double preco; 


    public Produto(String nome, Double preco)
    {
        this.nome=nome;
        this.preco=preco;
    }

    public Double getPreco() {
        return this.preco;
    }

    public String getNome(){
        return this.nome; 
    }

    @Override
    public String toString(){
        return "Nome: "+this.nome +"Preco: "+this.preco;
    }

}