package com.tnv.es1;

public class Docente extends Persona{
    // attributi
    private int codiceDocente;
    private Materia materia;
    private boolean ordinario;
    private double stipendio;
    private static final byte STIPENDIO_MINIMO = 100;

    // costruttore
    public Docente(String nome, String cognome, int eta, char genere, int codiceDocente, Materia materia,
                   boolean ordinario, double stipendio) {
        super(nome, cognome, eta, genere);
        this.codiceDocente=codiceDocente;
        this.materia = materia;
        this.ordinario=ordinario;
        if(stipendio>STIPENDIO_MINIMO){ // se lo stipendio passato è inferiore a STIPENDIO_MINIMO
            this.stipendio=stipendio;   // assegna STIPENDIO_MINIMO alla variabile stipendio
        } else {
            this.stipendio = STIPENDIO_MINIMO;
        }
    }
    // getter
    public int getCodiceDocente() {
        return codiceDocente;
    }
    public String getMateria() {
        return ("\nNome materia: " + this.materia.getNomeMateria() +
                "\nCFU: " + this.materia.getCfu());
    }
    public boolean isOrdinario() {
        return ordinario;
    }
    public double getStipendio() {
        return stipendio;
    }
    // setter
    public void setCodiceDocente(int codiceDocente) { this.codiceDocente = codiceDocente; }
    public void setMateria(Materia materia) { this.materia = materia; }
    public void setOrdinario(boolean ordinario) { this.ordinario = ordinario; }
    public void setStipendio(double stipendio) { this.stipendio = stipendio; }

    /**
     * Metodo per creare una stringa con i valori degli attributi dell'istanza Docente
     * @return Stringa ordinata con gli attributi di istanza valorizzati
     */
    public String toString(){
        return ("\nNome: " + super.getNome() +
                "\nCognome: " + super.getCognome() +
                "\nEtà: " + super.getEta() +
                "\nGenere: " + super.getGenere() +
                "\nCodice docente: " + getCodiceDocente() +
                getMateria() +
                "\nOrdinario: " + (ordinario ? "SI" : "NO" ));
    }
}
