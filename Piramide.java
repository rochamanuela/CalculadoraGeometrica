package geometria;

public class Piramide {
    double arestaBase, altura;

    public Piramide(double arestaBase, double altura) {
        this.arestaBase = arestaBase;
        this.altura = altura;
    }

    double calcularVolume(){
        double volume = ((arestaBase * arestaBase) * altura) / 3;
        return volume;
    }

    double calcularAreaSuperficial(){
        double x = Math.sqrt((altura * altura) + ((arestaBase / 2) * (arestaBase / 2)));
        double areaBase = arestaBase * arestaBase;
        double areaLateral = 4 * ((arestaBase * x) / 2);
        double areaSuperficial = areaLateral + areaBase;
        return areaSuperficial;
    }
}