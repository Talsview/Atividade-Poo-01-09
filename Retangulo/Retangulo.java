    //aqui e a classe
public class Retangulo{
    double altura;
    double largura;
    //esse e o contrutor
    public Retangulo (double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    //esses sao os metodos
    public double calcularArea(){
        return altura * largura;
    }
    public double calcularPerimetro(){
        return 2 * (altura + largura);
    }
    //aqui e o metodo que vai exibir
    public void exibirArea(){
        System.out.println("Exibir Area: " + calcularArea());
    }
    public void exibirPerimetro(){
        System.out.println("Exibir Perimetro: "+ calcularPerimetro());
    }
    
}