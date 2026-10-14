package modelo;

public class PiezaZ extends Pieza {
    public PiezaZ(int x, int y) {
        super(TipoPieza.Z, new int[][]{
            {1, 1, 0},
            {0, 1, 1}
        }, x, y);
    }
}