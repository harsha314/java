package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C_01_List {
    public static void main(String[] args) {
        linkedList();
    }

    public static void linkedList() {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < 5; ++i) {
            l.add((int) (Math.random() * 5));
        }
        System.out.println(l);
        l.add(0, 1);
        l.remove(1);
    }

    public static void array_list() {
        ArrayList<Integer> arr = new ArrayList<>();
    }

    public static void test_1_equals() {
        List<Integer> l0 = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>(10);
        System.out.println(l0.equals(l1));

    }

}
