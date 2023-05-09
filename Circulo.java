package geometria;

public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea(){
        double area = Math.PI * (raio * raio);
        return area;
    }

    double calcularPerimetro(){
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
}