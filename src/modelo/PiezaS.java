package modelo;

public class PiezaS extends Pieza {
    public PiezaS(int x, int y) {
        super(TipoPieza.S, new int[][]{
            {0, 1, 1},
            {1, 1, 0}
        }, x, y);
    }
}