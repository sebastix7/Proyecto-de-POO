package modelo;

public class PiezaI extends Pieza {
    public PiezaI(int x, int y) {
        super(TipoPieza.I, new int[][]{
            {1, 1, 1, 1}
        }, x, y);
    }
}