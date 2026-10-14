import modelo.*;

public class PruebaPiezas {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE PIEZAS TETRIS");

        Pieza piezaT = new PiezaT(0, 0);
        System.out.println("Tipo de pieza: " + piezaT.getTipo());
        System.out.println("Símbolo: " + piezaT.getTipo().getSimbolo());

        System.out.println("\nForma original:");
        imprimirMatriz(piezaT.getForma());

        piezaT.rotarHorario();
        System.out.println("\nForma después de rotar a la derecha (horario):");
        imprimirMatriz(piezaT.getForma());

        piezaT.rotarAntihorario();
        System.out.println("\nForma después de regresar (antihorario):");
        imprimirMatriz(piezaT.getForma());
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor == 1 ? "█ " : ". ");
            }
            System.out.println();
        }
    }
}