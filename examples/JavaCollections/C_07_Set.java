package JavaCollections;

import java.util.*;

public class C_07_Set {
    public static void main(String[] args) {
        temp_2023_06_13();
    }

    public static void temp_2023_06_13() {
        Set<Integer> st = new TreeSet<>(Collections.reverseOrder()) ;
        TreeMap<Integer, Integer> mp = new TreeMap<>() ;

        mp.put(1, 2) ;
        mp.put(2, 3);
        mp.put(3, 4);
        mp.put(1, 3);
        mp.remove(1, 3);


        for(var v : mp.entrySet()) {
            System.out.println(v.getKey() + " " + v.getValue());
        }


    }
}
