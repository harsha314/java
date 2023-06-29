package JavaCollections;

import java.util.*;

public class C_07_Set {
    public static void main(String[] args) {

    }

    public void temp_2023_06_13() {
        Set<Integer> st = new TreeSet<>(Collections.reverseOrder()) ;
        TreeMap<Integer, Integer[][]> mp = new TreeMap<>() ;

        for(var v : mp.entrySet()) {
            int k = v.getKey() ;
            Integer[][] arr = v.getValue() ;
        }
    }
}
