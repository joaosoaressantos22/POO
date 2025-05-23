public class App {
    public static void main(String[] args) throws Exception {
        Ponto p1 = new Ponto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        Ponto p2 = new Ponto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        Ponto p3 = new Ponto(Double.parseDouble(args[4]), Double.parseDouble(args[5])); 
        Ponto [] pontos = new Ponto[3];
        pontos[0] = p1;
        pontos[1] = p2;
        pontos[2] = p3; 
        Triangulo triangulo = new Triangulo(pontos); 
        System.err.println(triangulo.calculaPerimetro());
    }
}
