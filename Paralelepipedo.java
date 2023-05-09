package geometria;

public class Paralelepipedo {
    double base, altura, largura;

    public Paralelepipedo(double base, double altura, double largura) {
        this.base = base;
        this.altura = altura;
        this.largura = largura;
    }

    double calcularVolume(){
        double volume = base * altura * largura;
        return volume;
    }

    double calcularAreaSuperficial(){
        double areaSuperficial = ((base * altura) * 2) + ((base * largura) * 2) + ((largura * altura) * 2);
        return areaSuperficial;
    }
}