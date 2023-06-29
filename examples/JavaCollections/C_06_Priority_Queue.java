package JavaCollections;

import java.util.*;

public class C_06_Priority_Queue {



    public static void main(String[] args) {
//        defaultPriorityQueue();
//        PriorityQueue_with_custom_comparator();
        temp_2023_06_12();
    }

    public static void defaultPriorityQueue() {
        // min-heap is default behaviour
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(2);
        pq.add(1);
        while (!pq.isEmpty()) {
            System.out.printf("%d\n", pq.poll());
        }
    }

    public static void PriorityQueue_with_custom_comparator() {
        Comparator<Integer> cmp = (v1, v2) -> {
            if (v1 > v2) {
                return -1;
            } else if (v1 == v2) {
                return 0;
            } else {
                return 1;
            }
        };
        Comparator<Integer> cmp1 = Collections.reverseOrder();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(cmp) ;
        PriorityQueue<Integer> pq = new PriorityQueue<>(cmp1);
        pq.add(3);
        pq.add(2);
        pq.add(1);
        while (!pq.isEmpty()) {
            System.out.printf("%d\n", pq.poll());
        }
    }

    public static void temp_2023_06_12() {
        int[][] grid = new int[][]{{0, 1, 2}} ;
        solve_2023_06_12(grid);
    }

    public static void solve_2023_06_12(int[][] grid) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> grid[a[0]][a[1]])) ;
        pq.add(new Integer[]{1, 2});

        PriorityQueue<? super Integer[]> p1 = new PriorityQueue<>() ;


    }

}

interface i1 {}
interface i2 {}
interface i3 {}
//interface i3 implements i1, i2 {}
//abstract class c1 implements i1, i2, i3 {}