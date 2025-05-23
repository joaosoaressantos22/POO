import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        HashSet<Produto> produtos = new HashSet<Produto>();
        produtos.add(new Livro("Harry Potter e a Pedra Filosofal", 99.99, "JK ROWLING"));
        produtos.add(new Jogo("Coup", 99.99, 10));
        produtos.add(new Livro("Deuses Americanos", 99.99, "Neil Gaiman"));
        produtos.add(new Jogo("Minecraft", 10000.00, 99));
        produtos.add(new Livro("Harry Potter e a ordem da fênix", 9.99, "JK ROWLING"));
        for (Produto p: produtos) System.out.println(p.toString()); 
    }
}
