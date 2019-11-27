package com.pavlis.zoopproject;

public class Skladnik extends Zamestnanec {
    final static int VYPLATA = 1000;
    private boolean pracuje;

    public Skladnik(String meno){
        super(meno);
    }

    public Skladnik(String meno, String priezvisko, int vek){
        super(meno, priezvisko, vek);
        this.pracuje = false;
    }

    public void pracuj(){
        System.out.println("Prave teraz pracujem");
        pracuje = true;
    }

    public void nepracuj(){
        System.out.println("Prave teraz nepracujem");
        pracuje = false;
    }

    public boolean getPracuje(){
        return pracuje;
    }
}
