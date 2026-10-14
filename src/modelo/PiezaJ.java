package modelo;

public class PiezaJ extends Pieza {
    public PiezaJ(int x, int y) {
        super(TipoPieza.J, new int[][]{
            {1, 0, 0},
            {1, 1, 1}
        }, x, y);
    }
}