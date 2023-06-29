package JavaCollections;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C_05_Map {
    public static void main(String[] args) {
        methods();
    }

    public static void methods() {
        Map<Integer, Integer> mp = new HashMap<>();

        // put(K k, V v) => insert Key-Value Pair
        System.out.println("\n******* REPLACE *******");
        mp.put(0, 1);
        mp.put(1, 3);
        mp.put(2, 5);
        mp.put(3, 7);
        System.out.println("***********************\n");

        // getOrDefault(key, defaultValue) => return defaultValue if key is not present
        // or value of key if present
        System.out.println("\n******* getOrDefault *******");
        int k = 5;
        System.out.println(mp.getOrDefault(k, -1));
        System.out.println("****************************\n");

        //
        k = 3;
        System.out.println("\n******* replace *******");
        System.out.println(mp.replace(3, 6));
        System.out.println(mp.getOrDefault(3, -1));
        System.out.println(mp.replace(3, 5, 7));
        System.out.println(mp.getOrDefault(3, -1));
        System.out.println("***********************\n");

    }

}
