package com.pavlis.zoopproject;

public class Item {

    private static int ID = 0;

    private int id;
    private String nazov;
    private double cena;

    public Item(String nazov, double cena) {
        this.id = Item.ID++;
        this.nazov = nazov;
        this.cena = cena;
    }
}
