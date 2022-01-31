package com.tnv.es1;

// classe Materia
public class Materia {
    // attributi
    private String nomeMateria;
    private byte cfu;

    // costruttore
    public Materia(String nomeMateria, byte cfu) {
        this.cfu = cfu;
        this.nomeMateria = nomeMateria;
    }

    // getter
    public String getNomeMateria() {
        return nomeMateria;
    }
    public byte getCfu() {
        return cfu;
    }
    // setter
    public void setNomeMateria(String nomeMateria) { this.nomeMateria = nomeMateria; }
    public void setCfu(byte cfu) { this.cfu = cfu; }
}
