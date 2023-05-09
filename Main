package geometria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int resposta, forma;

        Cabecalho c = new Cabecalho();
        c.desenhaCabecalho();

        while (true){
            try{
                System.out.println("\n———————————————————————————————————————");
                System.out.println("\u001b[36m[1] - Geometria Plana\u001b[m");
                System.out.println("\u001b[35m[2] - Geometria Espacial\u001b[m");
                System.out.println("\u001b[31m[3] - Sair\u001b[m");
                System.out.println("———————————————————————————————————————");
                System.out.print("Digite: ");
                resposta = tec.nextInt();

                if (resposta == 1) {
                    System.out.println("\n\u001b[36m———————————————————————————————————————");
                    System.out.println("[1] - Triângulo Equilátero");
                    System.out.println("[2] - Quadrado");
                    System.out.println("[3] - Retângulo");
                    System.out.println("[4] - Círculo");
                    System.out.println("[5] - Hexágono");
                    System.out.println("[6] - Voltar");
                    System.out.println("———————————————————————————————————————\u001b[m");
                    System.out.print("Digite: ");
                    forma = tec.nextInt();

                    while (forma != 6){
                        switch (forma) {
                            case 1:
                                System.out.print("\n--->>> TRIÂNGULO EQUILÁTERO");
                                System.out.print("\nlado: ");
                                double lado = tec.nextDouble();

                                Triangulo triangulo = new Triangulo(lado);

                                System.out.printf("\nárea: %02.2f", triangulo.calcularArea());
                                System.out.printf("\nperímetro: %.2f", triangulo.calcularPerimetro());
                                break;

                            case 2:
                                System.out.print("\n--->>> QUADRADO");
                                System.out.print("\nlado: ");
                                lado = tec.nextDouble();

                                Quadrado quadrado = new Quadrado(lado);
                                System.out.printf("\nárea: %.2f", quadrado.calcularArea());
                                System.out.printf("\nperímetro: %.2f", quadrado.calcularPerimetro());
                                break;

                            case 3:
                                System.out.print("\n--->>> RETÂNGULO");
                                System.out.print("\nbase: ");
                                double base = tec.nextDouble();
                                System.out.print("altura: ");
                                double altura = tec.nextDouble();

                                if(base != altura){
                                    Retangulo retangulo = new Retangulo(base, altura);
                                    System.out.printf("\nárea: %.2f", retangulo.calcularArea());
                                    System.out.printf("\nperímetro: %.2f", retangulo.calcularPerimetro());
                                    break;
                                }

                                else{
                                    while (base == altura){
                                        System.out.println("Um retângulo precisa ter a medida \nda base e da altura diferentes!");
                                        System.out.print("\nbase: ");
                                        base = tec.nextDouble();
                                        System.out.print("altura: ");
                                        altura = tec.nextDouble();

                                        if(base != altura){
                                            Retangulo retangulo = new Retangulo(base, altura);
                                            System.out.printf("\nárea: %.2f", retangulo.calcularArea());
                                            System.out.printf("\nperímetro: %.2f", retangulo.calcularPerimetro());
                                            break;
                                        }
                                    }
                                }
                                break;

                            case 4:
                                System.out.print("\n--->>> CÍRCULO");
                                System.out.print("\nraio: ");
                                double raio = tec.nextDouble();

                                Circulo circulo = new Circulo(raio);
                                System.out.printf("\nárea: %.2f", circulo.calcularArea());
                                System.out.printf("\nperímetro: %.2f", circulo.calcularPerimetro());
                                break;

                            case 5:
                                System.out.print("\n--->>> HEXÁGONO");
                                System.out.print("\nlado: ");
                                lado = tec.nextDouble();

                                Hexagono hexagono = new Hexagono(lado);
                                System.out.printf("\nárea: %.2f", hexagono.calcularArea());
                                System.out.printf("\nperímetro: %.2f", hexagono.calcularPerimetro());
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("Opção Inválida!");
                        }

                        System.out.println("\n\u001b[36m———————————————————————————————————————");
                        System.out.println("[1] - Triângulo Equilátero");
                        System.out.println("[2] - Quadrado");
                        System.out.println("[3] - Retângulo");
                        System.out.println("[4] - Círculo");
                        System.out.println("[5] - Hexágono");
                        System.out.println("[6] - Voltar");
                        System.out.println("———————————————————————————————————————\u001b[m");
                        System.out.print("Digite: ");
                        forma = tec.nextInt();
                    }
                }

                else if (resposta == 2){
                    System.out.println("\n\u001b[35m———————————————————————————————————————");
                    System.out.println("[1] - Cubo");
                    System.out.println("[2] - Paralelepipido");
                    System.out.println("[3] - Esfera");
                    System.out.println("[4] - Piramide de Base Quadrada");
                    System.out.println("[5] - Cilindro");
                    System.out.println("[6] - Cone");
                    System.out.println("[7] - Voltar");
                    System.out.println("———————————————————————————————————————\u001b[m");
                    System.out.print("Digite: ");
                    forma = tec.nextInt();

                    while (forma != 7){
                        switch (forma) {
                            case 1:
                                System.out.print("\n--->>> CUBO");
                                System.out.print("\nlado: ");
                                double lado = tec.nextDouble();

                                Cubo cubo = new Cubo(lado);
                                System.out.printf("\nvolume: %.2f", cubo.calcularVolume());
                                System.out.printf("\nárea superficial: %5.2f", cubo.calcularAreaSuperficial());
                                break;

                            case 2:
                                System.out.print("\n--->>> PARALELPÍPEDO");
                                System.out.print("\nbase: ");
                                double base = tec.nextDouble();

                                System.out.print("altura: ");
                                double altura = tec.nextDouble();

                                System.out.print("largura: ");
                                double largura = tec.nextDouble();

                                Paralelepipedo paralelepipedo = new Paralelepipedo(base, altura, largura);
                                System.out.printf("\nvolume: %.2f", paralelepipedo.calcularVolume());
                                System.out.printf("\nárea superficial: %.2f", paralelepipedo.calcularAreaSuperficial());
                                break;

                            case 3:
                                System.out.print("\n--->>> ESFERA");
                                System.out.print("\nraio: ");
                                double raio = tec.nextDouble();

                                Esfera esfera = new Esfera(raio);
                                System.out.printf("\nvolume: %.2f", esfera.calcularVolume());
                                System.out.printf("\nárea superficial: %.2f", esfera.calcularAreaSuperficial());
                                break;

                            case 4:
                                System.out.print("\n--->>> PIRÂMIDE");
                                System.out.print("\naresta da Base: ");
                                double arestaBase = tec.nextDouble();

                                System.out.print("\naltura: ");
                                altura = tec.nextDouble();

                                Piramide piramide = new Piramide(arestaBase, altura);
                                System.out.printf("\nvolume: %6.2f", piramide.calcularVolume());
                                System.out.printf("\nárea superficial: %.2f", piramide.calcularAreaSuperficial());
                                break;

                            case 5:
                                System.out.print("\n--->>> CILINDRO");
                                System.out.print("\nraio: ");
                                raio = tec.nextDouble();

                                System.out.print("\naltura: ");
                                altura = tec.nextDouble();

                                Cilindro cilindro = new Cilindro(raio, altura);
                                System.out.printf("\nvolume: %.2f", cilindro.calcularVolume());
                                System.out.printf("\nárea superficial: %.2f", cilindro.calcularAreaSuperficial());
                                break;

                            case 6:
                                System.out.print("\n--->>> CONE");
                                System.out.print("\nraio: ");
                                raio = tec.nextDouble();

                                System.out.print("\naltura: ");
                                altura = tec.nextDouble();

                                Cone cone = new Cone(raio, altura);
                                System.out.printf("\nvolume: %.2f", cone.calcularVolume());
                                System.out.printf("\nárea superficial: %.2f", cone.calcularAreaSuperficial());
                                break;

                            case 7:
                                break;

                            default:
                                System.out.println("Opção Inválida!");
                        }

                        System.out.println("\n\u001b[35m———————————————————————————————————————");
                        System.out.println("[1] - Cubo");
                        System.out.println("[2] - Paralelepipido");
                        System.out.println("[3] - Esfera");
                        System.out.println("[4] - Piramide de Base Quadrada");
                        System.out.println("[5] - Cilindro");
                        System.out.println("[6] - Cone");
                        System.out.println("[7] - Voltar");
                        System.out.println("———————————————————————————————————————\u001b[m");
                        System.out.print("Digite: ");
                        forma = tec.nextInt();
                    }
                }
                else if(resposta == 3){
                    break;
                }

                else{
                    System.out.println("Opção Inválida!");
                }
            }
            catch (InputMismatchException e){
                System.out.println("———————————————————————————————————————");
                System.out.println("Entrada inválida! \nApenas números são aceitos");
                System.out.println("———————————————————————————————————————");
                tec.nextLine();
            }
        }
    }
}
