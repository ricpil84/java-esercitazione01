package com.tnv.es2;

public class Negozio {
    public static void main(String[] args) {
        // Oggetti istanziati
        TipoCapoAbbigliamento giaccaColmar = new TipoCapoAbbigliamento("Colmar","Giacca E45",350.5D);
        CapoAbbigliamento jeansLevis = new CapoAbbigliamento("Levi's","Jeans 570S",79.8D,40,30,30);

        giaccaColmar.getCosto();
        System.out.printf("Costo scontato: %.2f\n", giaccaColmar.applicaSconto(30));
        jeansLevis.venduto(2);
        jeansLevis.getDettagli();
    }
}
