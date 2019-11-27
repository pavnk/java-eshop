package com.pavlis.zoopproject;

public class Zakaznik {
    private static int count = 0;
    private String meno;
    private String nakup;

    Zakaznik(String meno) {
        this.meno = meno;
    }

    public static int getCount(){
        return count;
    }

    public static void setCount(int newCount) {
        count = newCount;
    }

    public String getMeno(){
        return meno;
    }
    public void setNakup(String nakup){
        this.nakup = nakup;
    }

}