package geometria;

public class Hexagono {
    double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    double calcularArea(){
        double area = (((lado * lado) * (Math.sqrt(3))) / 4) * 6;
        return area;
    }

    double calcularPerimetro(){
        double perimetro = lado * 6;
        return perimetro;
    }
}