public class Triangulo{
   
    private Ponto[] pontos = new Ponto[3]; 

    public Triangulo(Ponto[] ponto){
        this.pontos = ponto; 
    }

    double calculaPerimetro(){
        double perimetro = 0; 
        perimetro += pontos[0].calculaDistancia(pontos[1]); 
        perimetro += pontos[0].calculaDistancia(pontos[2]); 
        perimetro += pontos[1].calculaDistancia(pontos[2]); 
        return perimetro; 
    }
}