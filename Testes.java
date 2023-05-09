package geometria;

import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("lado: ");
        double lado = tec.nextDouble();

        Triangulo triangulo = new Triangulo(lado);
        System.out.printf("\nárea: %.2f", triangulo.calcularArea());
        System.out.printf("\nperímetro: %.2f", triangulo.calcularPerimetro());

        Quadrado quadrado = new Quadrado(lado);
        System.out.printf("\n\nárea: %.2f", quadrado.calcularArea());
        System.out.printf("\nperímetro: %.2f", quadrado.calcularPerimetro());

        System.out.print("\n\nbase: ");
        double base = tec.nextDouble();
        System.out.print("altura: ");
        double altura = tec.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);
        System.out.printf("\nárea: %.2f", retangulo.calcularArea());
        System.out.printf("\nperímetro: %.2f", retangulo.calcularPerimetro());

        System.out.print("\n\nraio: ");
        double raio = tec.nextDouble();

        Circulo circulo = new Circulo(raio);
        System.out.printf("\nárea: %.2f", circulo.calcularArea());
        System.out.printf("\nperímetro: %.2f", circulo.calcularPerimetro());

        Hexagono hexagono = new Hexagono(lado);
        System.out.printf("\nárea: %.2f", hexagono.calcularArea());
        System.out.printf("\nperímetro: %.2f", hexagono.calcularPerimetro());
    }
}
