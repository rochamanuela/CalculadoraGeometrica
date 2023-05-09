package geometria;

public class Quadrado {
    double lado;

    Quadrado(double lado){
        this.lado = lado;
    }

    double calcularArea(){
        double area = lado * lado;
        return area;
    }

    double calcularPerimetro(){
        double perimetro = lado * 4;
        return perimetro;
    }
}