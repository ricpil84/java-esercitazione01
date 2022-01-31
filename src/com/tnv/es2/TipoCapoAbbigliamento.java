package com.tnv.es2;

public class TipoCapoAbbigliamento {
    // attributi
    private String marca, modello;
    private double costo;

    // costruttore
    public TipoCapoAbbigliamento(String marca, String modello, double costo) {
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }

    // getter
    public String getMarca() {
        return this.marca;
    }
    public double getValCosto() {
        return this.costo;
    }
    public String getModello() {
        return this.modello;
    }

    /**
     * Metodo per stampare il costo dell'oggetto TipoCapoAbbigliamento
     */
    public void getCosto() {
        System.out.println("Costo: " + this.costo);
    }

    /**
     * Metodo per calcolare lo sconto su un oggetto TipoCapoAbbigliamento
     * @param sconto sconto percentuale da applicare all'oggetto
     * @return valore dell'attributo costo meno lo sconto applicato
     */
    public double applicaSconto(float sconto){
        return this.costo*=1-(sconto/100);
    }
    /**
     * Metodo per modificare il costo di un oggetto TipoCapoAbbigliamento
     * @param nuovoCosto nuovo valore assegnato all'attributo costo
     */
    public void modificaCosto(double nuovoCosto){
        this.costo=nuovoCosto;
    }
}
