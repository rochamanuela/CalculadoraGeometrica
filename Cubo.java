package geometria;

public class Cubo {
    double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    double calcularVolume(){
        double volume = lado * lado * lado;
        return volume;
    }

    double calcularAreaSuperficial(){
        double areaSuperficial = (lado * lado) * 6;
        return areaSuperficial;
    }
}