package com.tnv.es1;

public class GestisciUniversita {
    public static void main(String[] args) {
        // Oggetti istanziati
        Materia java = new Materia("java", (byte) 12);
        Materia bash = new Materia("bash", (byte) 6);
        Materia database = new Materia("database", (byte) 9);
        Docente vittoria = new Docente("Vittoria", "Frau", 26, 'F', 123, java, true, 130);
        Docente federico = new Docente("Federico", "Cau", 25, 'M', 125,bash,false, 100);
        Docente dino = new Docente("Dino","Manca", 40, 'M', 126, database, true, 90);
        Studente riccardo = new Studente("Riccardo", "Pilloni", 37, 'M', 39183, "informatica", false);
        Studente fabio = new Studente("Fabio", "Sitzia", 39, 'M', 39242, "informatica", true);
        Studente davide = new Studente("Davide", "Ardu", 33, 'M', 39523, "informatica", true);
        Studente michele = new Studente("Michele", "De Paoli",69,'M',39262,"informatica",false);
        Docente [] docentiUniversita = new Docente[3];
        Studente [] studentiUniversita = new Studente[4];
        Universita universita = new Universita(docentiUniversita, studentiUniversita);

        // inserisce le istanze Docente nel vettore docentiUniversita
        docentiUniversita[0] = vittoria;
        docentiUniversita[1] = federico;
        docentiUniversita[2] = dino;

        // inserisce le istanze Studente nel vettore studentiUniversita
        studentiUniversita[0] = davide;
        studentiUniversita[1] = fabio;
        studentiUniversita[2] = riccardo;
        studentiUniversita[3] = michele;

        universita.stampaUniversita();
    }
}
