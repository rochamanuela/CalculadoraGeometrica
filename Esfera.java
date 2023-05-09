package geometria;

public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    double calcularVolume(){
        double volume = (4/3) * Math.PI * Math.pow(raio, 3);
        return volume;
    }

    double calcularAreaSuperficial(){
        double areaSuperficial = 4 * Math.PI * Math.pow(raio, 2);
        return areaSuperficial;
    }
}