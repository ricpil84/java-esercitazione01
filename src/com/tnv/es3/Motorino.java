package com.tnv.es3;

public class Motorino extends Fabbrica{
    // attributi
    private String colore, tipo;
    private float velocita;
    private boolean antifurto = false;

    // costruttore
    public Motorino(String colore, float velocita, String tipo) {
        Fabbrica.incrementaMotoriniCostruiti();
        this.colore = colore;
        this.velocita = velocita;
        this.tipo = tipo;
    }

    // getter
    public String getTipo() {
        return tipo;
    }
    public float getVelocita() {
        return velocita;
    }
    public boolean isAntifurto() {
        return antifurto;
    }
    public String getColore() {
        return colore;
    }

    // setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setVelocita(float velocita) {
        this.velocita = velocita;
    }
    public void setAntifurto(boolean antifurto) {
        this.antifurto = antifurto;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }

    /**
     * Questo metodo aumenta l'attributo velocità se l'attributo antifurto è false
     * @param aumentoVelocita valore di incremento
     */
    public void accelera(float aumentoVelocita){
        if(!isAntifurto()){
            this.velocita+=aumentoVelocita;
        }
    }
    /**
     * Questo metodo imposta l'antifurto a true se è false
     */
    public void inserisciAntifurto(){
        if(!isAntifurto()){
            this.antifurto=true;
        }
    }
}
