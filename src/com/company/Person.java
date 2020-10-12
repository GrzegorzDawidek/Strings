package com.company;

import java.util.Scanner;

public class Person {
    private String imie;
    private String nazwisko;
    private String pesel;
    private int wiek;
    private int dataUrodzenia;
    private String plec;

    private String wczytywanieLinii() {
        return new Scanner(System.in).nextLine();
    }

    private int wczytywanieIntow() {
        return new Scanner(System.in).nextInt();
    }

    public void wczytywanieDanych() {
        System.out.println("Podaj imie: ");
        imie = wczytywanieLinii();
        System.out.println("Podaj nazwisko: ");
        nazwisko = wczytywanieLinii();
        System.out.println("Podaj pesel: ");
        pesel = wczytywanieLinii();
    }

    public String sprawdzPlec() {
        if (imie.endsWith("a") && !imie.equals("Kuba")) {
            return plec = "kobieta";
        }
        return plec = "mezczyzna";
    }

    public int sprawdzDateUrodzenia(){
        String temp;
        temp = pesel.substring(0,2);
        dataUrodzenia = Integer.valueOf(temp);
        if(dataUrodzenia > 19){
            dataUrodzenia += 1900;
        }
        else{
            dataUrodzenia += 2000;
        }

        return dataUrodzenia;
    }

    public int sprawdzWiek(){
    int rok = 2019;
    wiek = rok - dataUrodzenia;
    return wiek;
    }


}
