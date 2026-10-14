package modelo;

public class PiezaO extends Pieza {
    public PiezaO(int x, int y) {
        super(TipoPieza.O, new int[][]{
            {1, 1},
            {1, 1}
        }, x, y);
    }
}
