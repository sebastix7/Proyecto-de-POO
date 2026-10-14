package modelo;

public class PiezaT extends Pieza {
    public PiezaT(int x, int y) {
        super(TipoPieza.T, new int[][]{
            {0, 1, 0},
            {1, 1, 1}
        }, x, y);
    }
}