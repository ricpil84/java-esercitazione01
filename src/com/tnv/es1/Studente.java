package com.tnv.es1;

public class Studente extends Persona{
    // attributi
    private int matricola;
    private String corsoDiLaurea;
    private boolean inCorso;

    // costruttore
    public Studente(String nome, String cognome, int eta, char genere, int matricola, String corsoDiLaurea,
                    boolean inCorso) {
        super(nome, cognome, eta, genere);
        this.matricola=matricola;
        this.corsoDiLaurea=corsoDiLaurea;
        this.inCorso = inCorso;
    }

    // getter
    public int getMatricola() {
        return matricola;
    }
    public String getCorsoDiLaurea() {
        return corsoDiLaurea;
    }
    public boolean isInCorso() { return inCorso; }
    // setter
    public void setCorsoDiLaurea(String corsoDiLaurea) { this.corsoDiLaurea = corsoDiLaurea; }
    public void setMatricola(int matricola) { this.matricola = matricola; }
    public void setInCorso(boolean inCorso) { this.inCorso = inCorso; }

    /**
     * Metodo per creare una stringa con i valori degli attributi dell'istanza Studente
     * @return Stringa ordinata con gli attributi di istanza valorizzati
     */
    public String toString(){
        return ("\nNome: " + super.getNome() +
                "\nCognome: " + super.getCognome() +
                "\nEtà: " + super.getEta() +
                "\nGenere: " + super.getGenere() +
                "\nMatricola: " + getMatricola() +
                "\nCorso di laurea: " + getCorsoDiLaurea() +
                (inCorso ? "\nIn corso" : "\nFuoricorso" ));
    }
}
