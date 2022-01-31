package com.tnv.es1;

public class Persona {
    // attributi
    private String nome, cognome;
    private int eta;
    private char genere;

    // costruttore
    public Persona(String nome, String cognome, int eta, char genere){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.genere = genere;
    }

    // getter
    public String getNome() {
        return this.nome;
    }
    public String getCognome() {
        return this.cognome;
    }
    public int getEta() {
        return this.eta;
    }
    public char getGenere() {
        return this.genere;
    }
    // setter
    public void setNome(String nome) { this.nome = nome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public void setEta(int eta) { this.eta = eta; }
    public void setGenere(char genere) { this.genere = genere; }
}
