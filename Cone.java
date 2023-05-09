package geometria;

public class Cone {
    double raio, altura;

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    double calcularVolume(){
        double volume = (1.0/3.0) * Math.PI * (raio * raio) * altura;
        return volume;
    }

    double calcularAreaSuperficial(){
        double geratriz = Math.sqrt((raio * raio) + (altura * altura));
        double areaSuperficial = Math.PI * raio * (geratriz + raio);
        return areaSuperficial;
    }
}