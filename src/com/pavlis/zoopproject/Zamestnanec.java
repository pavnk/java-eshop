package com.pavlis.zoopproject;

public class Zamestnanec {
    private String meno;
    private String priezvisko;
    private int vek;

    public Zamestnanec(String meno){
        this.meno = meno;
    }

    public Zamestnanec(String meno, String priezvisko, int vek){
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public void pracuj(){
        System.out.println("Prave teraz pracujem");
    }

    public void nepracuj(){
        System.out.println("Prave teraz nepracujem");
    }
}
