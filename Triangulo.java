package geometria;

public class Triangulo {
    double lado;

    Triangulo(double lado){
        this.lado = lado;
    }

    double calcularArea(){
        double area = ((lado * lado) * (Math.sqrt(3))) / 4;
        return area;
    }

    double calcularPerimetro(){
        double perimetro = lado * 3;
        return perimetro;
    }
}