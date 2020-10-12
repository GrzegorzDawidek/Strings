package com.company;

public class Main {

    public static void main(String[] args) {
        PracaDomowa pd = new PracaDomowa();
        pd.show();
        pd.splicior("ala");
        Person p = new Person();
        p.wczytywanieDanych();
        System.out.println(p.sprawdzDateUrodzenia());
        System.out.println(p.sprawdzWiek());
        System.out.println(p.sprawdzPlec());
        pd.sprawdzLiterki();
    }
}
