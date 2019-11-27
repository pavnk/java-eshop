package com.pavlis.zoopproject.items;

import com.pavlis.zoopproject.Item;

public class Ram extends Item {
    private static int count = 0;
    private double frekvencia;
    private int velkost;

    public Ram(String nazov, double cena, double frekvencia, int velkost) {
        super(nazov, cena);
        count++;
        this.frekvencia = frekvencia;
        this.velkost = velkost;
    }
}
