package com.pavlis.zoopproject.items;

import com.pavlis.zoopproject.Item;

public class ZakladnaDoska extends Item {
    private static int count = 0;
    private String socket;

    public ZakladnaDoska(String nazov, double cena, String socket) {
        super(nazov, cena);
        count++;
        this.socket = socket;
    }
}
