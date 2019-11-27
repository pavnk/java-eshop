package com.pavlis.zoopproject.items;

import com.pavlis.zoopproject.Item;

public class Procesor extends Item {

    private static int count = 0;
    private double frekvencia;
    private int pocetJadier;

    public Procesor(String nazov, double cena, double frekvencia, int pocetJadier) {
        super(nazov, cena);
        count++;
        this.frekvencia = frekvencia;
        this.pocetJadier = pocetJadier;
    }

    public int getCount() {
        return count;
    }

}
