package com.pavlis.zoopproject.items;

import com.pavlis.zoopproject.Item;

public class Zdroj extends Item {
    private static int count = 0;
    private int vykon;

    public Zdroj(String nazov, double cena, int vykon) {
        super(nazov, cena);
        count++;
        this.vykon = vykon;
    }
}
