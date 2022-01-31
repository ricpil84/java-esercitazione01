package com.tnv.es3;
/**
 * Classe Fabbrica
 */
public class Fabbrica {
    // attributi
    private static int motoriniCostruiti = 0; // contatore inizializzato
    // getter
    public static int getMotoriniCostruiti() {
        return motoriniCostruiti;
    }
    /**
     * Metodo che incrementa il numero delle istanze Motorino create
      */
    public static void incrementaMotoriniCostruiti() {
        Fabbrica.motoriniCostruiti++;
    }

    public static void main(String[] args){
        // Istanze Motorino
        Motorino sonicgp = new Motorino("Nero",45F,"sonicgp");
        Motorino scarabeo = new Motorino("Blu",32F,"scarabeo");
        Motorino booster = new Motorino("Giallo",150F,"booster");

        // Stampa numero istanze create
        System.out.println("Motorini creati: " + Fabbrica.getMotoriniCostruiti());
    }
}
