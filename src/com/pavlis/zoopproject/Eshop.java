package com.pavlis.zoopproject;


public class Eshop {
    private static Eshop jedna_instancia = null;
    private int pocetP1;
    private int pocetP2;
    private int pocetZd1;
    private int pocetZ1;
    private int pocetR1;
    private int pocetR2;
    private int pocetG1;

    private Eshop(){
        this.pocetP1 = 0;
        this.pocetP2 = 0;
        this.pocetZd1 = 0;
        this.pocetZ1 = 0;
        this.pocetR1 = 0;
        this.pocetR2 = 0;
        this.pocetG1 = 0;
    }

    public static Eshop getInstance(){
        if(jedna_instancia == null)
            jedna_instancia = new Eshop();
        return jedna_instancia;
    }

    public int getPocetP1(){
        return pocetP1;
    }
    public int getPocetP2(){
        return pocetP2;
    }
    public int getPocetZd1(){
        return pocetZd1;
    }
    public int getPocetZ1(){
        return pocetZ1;
    }
    public int getPocetR1(){
        return pocetR1;
    }
    public int getPocetR2(){
        return pocetR2;
    }
    public int getPocetG1(){
        return pocetG1;
    }

    public void znizPocetP1(){
        pocetP1--;
    }
    public void znizPocetP2(){
        pocetP2--;
    }
    public void znizPocetZd1(){
        pocetZd1--;
    }
    public void znizPocetZ1(){
        pocetZ1--;
    }
    public void znizPocetR1(){
        pocetR1--;
    }
    public void znizPocetR2(){
        pocetR2--;
    }
    public void znizPocetG1(){
        pocetG1--;
    }

    public void zvysPocetP1(){
        pocetP1++;
    }
    public void zvysPocetP2(){
        pocetP2++;
    }
    public void zvysPocetZd1(){
        pocetZd1++;
    }
    public void zvysPocetZ1(){
        pocetZ1++;
    }
    public void zvysPocetR1(){
        pocetR1++;
    }
    public void zvysPocetR2(){
        pocetR2++;
    }
    public void zvysPocetG1(){
        pocetG1++;
    }
}
