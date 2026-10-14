package modelo;

public class PiezaL extends Pieza {
    public PiezaL(int x, int y) {
        super(TipoPieza.L, new int[][]{
            {0, 0, 1},
            {1, 1, 1}
        }, x, y);
    }
}