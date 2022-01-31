package com.tnv.es1;

public class Universita {
    // attributi
    private Docente [] docenti;
    private Studente [] studenti;

    // costruttore
    public Universita (Docente [] docenti, Studente [] studenti){
        this.docenti=docenti;
        this.studenti=studenti;
    }

    /**
     * Metodo per stampare gli attributi dell'istanza Universita
     */
    public void stampaUniversita(){
        for(Docente doc: docenti) {
            System.out.println(doc.toString());
        }
        for(Studente stu: studenti) {
            System.out.println(stu.toString());
        }
    }
}
