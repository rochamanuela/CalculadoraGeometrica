package geometria;

public class Retangulo {
    double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea(){
        double area = base * altura;
        return area;
    }

    double calcularPerimetro(){
        double perimetro = (base * 2) + (altura * 2);
        return perimetro;
    }
}