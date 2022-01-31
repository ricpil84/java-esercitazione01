package com.tnv.es3;

public class MotorinoImmatricolato extends Motorino{
    // attributi
    float maxVelocita;
    String targa;

    // costruttore
    public MotorinoImmatricolato(String colore, float velocita, String tipo, float maxVelocita, String targa) {
        super(colore, velocita, tipo);
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    // getter
    public float getMaxVelocita() {
        return maxVelocita;
    }
    public String getTarga() {
        return targa;
    }

    // setter
    public void setMaxVelocita(float maxVelocita) {
        this.maxVelocita = maxVelocita;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }
}
