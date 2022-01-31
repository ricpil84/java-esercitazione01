package com.tnv.es2;

public class CapoAbbigliamento extends TipoCapoAbbigliamento {
    // attributi
    private int taglia, qtAcquistati, qtDisponibili;

    // costruttore
    public CapoAbbigliamento(String marca, String modello, double costo, int taglia, int qtAcquistati,
                             int qtDisponibili) {
        super(marca, modello, costo);
        this.taglia=taglia;
        this.qtAcquistati=qtAcquistati;
        this.qtDisponibili=qtDisponibili;
    }

    /**
     * Metodo per aggiornare l'attributo qtDisponibili
     * @param capiVenduti valore dei capi venduti
     */
    public void venduto(int capiVenduti){
        if(this.qtDisponibili>(this.qtDisponibili-capiVenduti)){ // vera se i capi venduti sono inferiori
                                                                 // alla quantità disponibile
            this.qtDisponibili-=capiVenduti; // aggiorna la quantità di capi disponibile
            this.qtAcquistati+=capiVenduti; // aggiorna la quantità di capi acquistati
        }
    }

    /**
     * Metodo per stampare tutti gli attributi della classe
     */
    public void getDettagli(){
        System.out.println("\nMarca: " + super.getMarca() +
                           "\nModello: " + super.getModello() +
                           "\nCosto: " + super.getValCosto() + "€" +
                           "\nTaglia: " + this.taglia +
                           "\nQuantità acquistata: " + this.qtAcquistati + " pezzi" +
                           "\nQuantità disponibile: " + this.qtDisponibili + " pezzi");
    }
}