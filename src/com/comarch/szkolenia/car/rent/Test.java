package com.comarch.szkolenia.car.rent;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int y = 5;
        int x = y == 5 ? 0 : 1;
        System.out.println(x);

        ArrayList<String> lista = new ArrayList<>();

        System.out.println(lista.size());

        lista.add("Janusz");

        System.out.println(lista.size());
        System.out.println(lista.get(0));
        lista.remove(0);
        System.out.println(lista.size());

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(10, "Janusz");
        System.out.println(mapa.get(10));

        lista.add("Karol");
        lista.add("Zbyszek");
        lista.add("Bogdan");
        lista.add("Wiesiek");
        System.out.println(lista);
    }
}
