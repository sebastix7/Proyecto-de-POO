package modelo;

import interfaces.Rotable;

public abstract class Pieza implements Rotable {
    protected TipoPieza tipo;
    protected int[][] forma;
    protected int x;
    protected int y;

    public Pieza(TipoPieza tipo, int[][] forma, int x, int y) {
        this.tipo = tipo;
        this.forma = forma;
        this.x = x;
        this.y = y;
    }

    public TipoPieza getTipo() {
        return tipo;
    }

    public int[][] getForma() {
        return forma;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void rotarHorario() {
        int n = forma.length;
        int m = forma[0].length;
        int[][] nuevaForma = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nuevaForma[j][n - 1 - i] = forma[i][j];
            }
        }
        this.forma = nuevaForma;
    }

    @Override
    public void rotarAntihorario() {
        int n = forma.length;
        int m = forma[0].length;
        int[][] nuevaForma = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nuevaForma[m - 1 - j][i] = forma[i][j];
            }
        }
        this.forma = nuevaForma;
    }
} 