package org.example.collections;

import java.sql.SQLOutput;
import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Two");

        hashMap.put(1, "One");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");

        System.out.println(hashMap);
        for (int i = 1; i <= 5; ++i) {

            System.out.println(hashMap.get(i));
        }
        Set<Integer> keySet = hashMap.keySet();
        System.out.println(keySet);

    }
}
