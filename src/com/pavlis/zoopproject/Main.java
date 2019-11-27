package com.pavlis.zoopproject;

import com.pavlis.zoopproject.items.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Eshop eshop = Eshop.getInstance();
        Zakaznik[] arr = new Zakaznik[10];

        Skladnik sk1 = new Skladnik("Peter", "Novy", 30);
        Skladnik sk2 = new Skladnik("Vlasto", "Burin", 27);

        Procesor p1 = new Procesor("Intel i7", 300, 4, 4);
        Procesor p2 = new Procesor("Intel i5", 200, 3.5, 4);
        ZakladnaDoska zd1 = new ZakladnaDoska("Asus 450", 150, "1151");
        Zdroj z1 = new Zdroj("Corsair 700", 160, 700);
        Ram r1 = new Ram("Corsair 16", 144.99, 3200, 16);
        Ram r2 = new Ram("Corsair 8", 144.99, 3200, 8);
        GrafickaKarta g1 = new GrafickaKarta("Asus 2080", 900, 15500);

        boolean pracuje = sk1.getPracuje();

        Scanner sc = new Scanner(System.in);
        boolean i = true;
        while(i) {

            char input = sc.next().charAt(0);
            if (input == 'n') //nakup
            {
                System.out.println("Meno zakaznika"); //zadaj meno ako pri pridavani
                String menoZakaznika = sc.next();
                int pocetZakaznikov = Zakaznik.getCount();
                for (int j=0; j<pocetZakaznikov; j++)
                {
                    String meno = arr[j].getMeno();

                    if(menoZakaznika.equals(meno)){
                        System.out.println("Zadaj co chces nakupit");
                        String nakup = sc.next();
                        switch (nakup) {
                            case "p1":
                                int pocetP1 = eshop.getPocetP1();
                                if(pocetP1>0){
                                    eshop.znizPocetP1();
                                    arr[j].setNakup("Procesor");
                                }
                                break;
                            case "p2":
                                int pocetP2 = eshop.getPocetP2();
                                if(pocetP2>0){
                                    eshop.znizPocetP2();
                                    arr[j].setNakup("Procesor");
                                }
                                break;
                            case "zd1":
                                int pocetZd1 = eshop.getPocetZd1();
                                if(pocetZd1>0){
                                    eshop.znizPocetZd1();
                                    arr[j].setNakup("Zakladna doska");
                                }
                                break;
                            case "z1":
                                int pocetZ1 = eshop.getPocetZ1();
                                if(pocetZ1>0){
                                    eshop.znizPocetZ1();
                                    arr[j].setNakup("Zdroj");
                                }
                                break;
                            case "r1":
                                int pocetR1 = eshop.getPocetR1();
                                if(pocetR1>0){
                                    eshop.znizPocetR1();
                                    arr[j].setNakup("RAM");
                                }
                                break;
                            case "r2":
                                int pocetR2 = eshop.getPocetR2();
                                if(pocetR2>0){
                                    eshop.znizPocetR2();
                                    arr[j].setNakup("RAM");
                                }
                                break;
                            case "g1":
                                int pocetG1 = eshop.getPocetG1();
                                if(pocetG1>0){
                                    eshop.znizPocetG1();
                                    arr[j].setNakup("Graficka karta");
                                }
                                break;
                            default:
                                System.out.println("Skus znovu");
                                break;
                        }
                    }
                    else
                    {
                        System.out.println("Pridajte zakaznika");
                    }
                }

            } else if(input == 'p'){
                int pocetZakaznikov = Zakaznik.getCount();
                String meno = sc.next();
                arr[pocetZakaznikov] = new Zakaznik(meno);

                pocetZakaznikov++;
                Zakaznik.setCount(pocetZakaznikov);

            } else if (input == 's') //vypis poloziek na sklade
            {
                int pocetP1 = eshop.getPocetP1();
                System.out.println("Pocet procesorov Intel i7 = " + pocetP1);
                int pocetP2 = eshop.getPocetP2();
                System.out.println("Pocet procesorov Intel i5 = " + pocetP2);
                int pocetZd1 = eshop.getPocetP1();
                System.out.println("Pocet zakladnych dosiek Asus = " + pocetZd1);
                int pocetZ1 = eshop.getPocetZ1();
                System.out.println("Pocet zdrojov Corsair = " + pocetZ1);
                int pocetR1 = eshop.getPocetR1();
                System.out.println("Pocet 16Gb RAM = " + pocetR1);
                int pocetR2 = eshop.getPocetR2();
                System.out.println("Pocet 8Gb RAM = " + pocetR2);
                int pocetG1 = eshop.getPocetG1();
                System.out.println("Pocet grafickych kariet Asus = " + pocetG1);


            } else if (input == 'o') //nakup poloziek do skladu
            {
                System.out.println("Zadaj co chces nakupit do skladu");
                String orderStorage = sc.next();
                switch (orderStorage) {
                    case "p1":
                        eshop.zvysPocetP1();
                        break;
                    case "p2":
                        eshop.zvysPocetP2();
                        break;
                    case "zd1":
                        eshop.zvysPocetZd1();
                        break;
                    case "z1":
                        eshop.zvysPocetZ1();
                        break;
                    case "r1":
                        eshop.zvysPocetR1();
                        break;
                    case "r2":
                        eshop.zvysPocetR2();
                        break;
                    case "g1":
                        eshop.zvysPocetG1();
                        break;
                    default:
                        System.out.println("Skus znovu");
                        break;
                }
            }
            else if (input == 'k') //koniec programu
            {
                i = false;
                break;
            }

        }

    }

 }
