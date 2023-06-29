package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C_02_ArrayList {
    public static void main(String[] args) {
//        methods();
        java_util_arrays();
//        copying_Arrays();

    }

    public static void methods() {

        List<Integer> A = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));

        // int size()
        System.out.println(A.size());

        // void add(T value)
        A.add(1);

        // void add(int index, T value)
        A.add(0, 1);

        // T get(int index)
        A.get(0);

        // T remove(int index)
        A.remove(0) ;

    }

    public static void java_util_arrays() {

        List<Integer> A;

        // Arrays.asList returns ArrayList with type List
        A = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));

        A.sort(Comparator.naturalOrder()) ;
        System.out.println(A);

        A.sort(Comparator.reverseOrder());
        System.out.println(A);

        // custom comparator
        A.sort((a, b) -> {
            if(a < b)
                return -1 ;
            else if(a == b)
                return 0 ;
            else
                return 1 ;
        });
        System.out.println(A);

    }

    public static void copying_Arrays() {
        List<Integer> A = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));

        // Initialising ArrayList
        List<Integer> B = new ArrayList<>(A) ;
        // Deep copy
        // data is copied to new address

        List<Integer> C = A ;
        // Shallow copy
        // C has the address of A

        A.add(10, 55) ;

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);

    }
}
