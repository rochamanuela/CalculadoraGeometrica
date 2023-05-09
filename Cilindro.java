package geometria;

public class Cilindro {
    double raio, altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    double calcularVolume(){
        double volume = Math.PI * (raio * raio) * altura;
        return volume;
    }

    double calcularAreaSuperficial(){
        double areaSuperficial = ((Math.PI * (raio * raio)) * 2) + ((2 * Math.PI * raio) * altura);
        return areaSuperficial;
    }
}