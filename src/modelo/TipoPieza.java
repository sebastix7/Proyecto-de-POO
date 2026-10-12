package modelo;

public enum TipoPieza {
    I('I'), O('O'), T('T'), S('S'), Z('Z'), J('J'), L('L');

    private final char simbolo;

    TipoPieza(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }
}   