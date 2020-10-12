package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracaDomowa {

    private String name;
    private String surname;
    private int fieldWidth;
    private String profession;
    private String stringOfCharacters;
    private int stringCutStart;
    private int stringCutEnd;


    private String lineReader() {
        return new Scanner(System.in).nextLine();
    }


    private int intReader() {
        return new Scanner(System.in).nextInt();
    }


    public void show() {
        dataReader();
        System.out.println(checkFieldWidth());
        System.out.println(prefixCounter("ol", "ola", "halyna", "Ola", "Ewa"));
        System.out.println(prefixSufixCounter("a", false, "ola", "halyna", "Ola", "Ewa"));
        cut();
        System.out.println("Czy podane imie jest zenskie: " + check());

    }


    public void dataReader() {
        System.out.println("Podaj imie: ");
        name = lineReader();
        System.out.println("Podaj nazwisko: ");
        surname = lineReader();
        System.out.println("Podaj zwod: ");
        profession = lineReader();
        System.out.println("Podaj maksymalny rozmiar pola: ");
        fieldWidth = intReader();
    }


    public boolean checkFieldWidth() {
        if (fieldWidth < name.length() || fieldWidth < surname.length() || fieldWidth < profession.length()) {
            return false;
        } else {
            return true;
        }
    }


    public static int prefixCounter(String prefix, String... tab) {
        int result = 0;
        for (String e : tab) {
            if (e.startsWith(prefix)) {
                result++;
            }
        }
        return result;

    }


    public int prefixSufixCounter(String prefixSufix, boolean isPrefix, String... tab) {
        int result = 0;
        if (isPrefix) {
            for (String e : tab) {
                if (e.startsWith(prefixSufix)) {
                    result++;
                }
            }
        } else {
            for (String e : tab) {
                if (e.endsWith(prefixSufix)) {
                    result++;
                }
            }
        }
        return result;
    }


    public void cut() {
        System.out.println("Podaj ciag znakow: ");
        stringOfCharacters = lineReader();
        System.out.println("Podaj poczatkowy indeks wyciecia znaku: ");
        stringCutStart = intReader();
        System.out.println("Podaj koncowy indeks wycinania znaku: ");
        stringCutEnd = intReader();

        String result = stringOfCharacters.substring(stringCutStart, stringCutEnd);

        System.out.println(stringOfCharacters);
        System.out.println("Zakres wycinania: " + stringCutStart + "-" + stringCutEnd);
        System.out.println("Wynik wycinania: " + result);
        System.out.println("Dlugosc wycietego ciagu: " + result.length());
    }


    public boolean check() {
        if (name.endsWith("a") && !name.equals("Kuba")) {
            return true;
        }
        return false;
    }

    public void splicior(String z) {
        int c;
        for (int i = 0; i < z.length(); i++) {
            char s = z.charAt(i);
            c = s;
            System.out.println(s + " = " + c);
        }
    }

    public void sprawdzLiterki() {
        System.out.println("Podaj ciag: ");
        String wyraz = lineReader();
        Map<Character, Integer> mapa = new HashMap<Character, Integer>();
        for (int i = 0; i < wyraz.length(); i++) {
            char znak = wyraz.charAt(i);
            if (!mapa.containsKey(znak)) {
                mapa.put(znak, 0);
            }
            mapa.put(znak,mapa.get(znak)+1);
        }
        for(Map.Entry<Character, Integer> wejscie : mapa.entrySet()){
            System.out.println(wejscie.getKey() + " : " + wejscie.getValue());
        }
    }


}
