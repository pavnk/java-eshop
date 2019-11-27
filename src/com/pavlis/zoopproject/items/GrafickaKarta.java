package com.pavlis.zoopproject.items;

import com.pavlis.zoopproject.Item;

public class GrafickaKarta extends Item {
    private static int count = 0;
    private double frekvencia;

    public GrafickaKarta(String nazov, double cena, double frekvencia) {
        super(nazov, cena);
        count++;
        this.frekvencia = frekvencia;
    }
}
