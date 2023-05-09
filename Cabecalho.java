package geometria;

public class Cabecalho {
    void desenhaCabecalho(){
        System.out.println();

        for (int i = 0; i < 13; i++){
            System.out.print("\u001b[36m█");
            System.out.print("\u001b[35m█");
            System.out.print("\u001b[31m█");
        }

        System.out.print("\n\n\t\t\u001b[mCALCULADORA GEOMÉTRICA\n\n");

        for (int i = 0; i < 13; i++){
            System.out.print("\u001b[36m█");
            System.out.print("\u001b[35m█");
            System.out.print("\u001b[31m█");
        }

        System.out.print("\u001b[m");
    }
}
