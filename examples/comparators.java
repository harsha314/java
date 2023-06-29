import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public class comparators {
    public static void main(String[] args) {
//        SimpleEntry<Integer, Integer> se = new SimpleEntry<>(1, 2) ;
//        int[] arr = new int[]{100, 99, 97, 98, 96};
//        Integer[] indices = new Integer[]{0, 1, 2, 3, 4};
//        Arrays.sort(indices, (v1, v2) -> (arr[v1] < arr[v2] ? -1 : 1));
//        for(int v : indices) {
//            System.out.println(v);
//        }
//        Arrays.sort(arr) ;
        int N = 10 ;
        List<Integer> l =
                Arrays.asList(new Integer[N]);
        System.out.println(l);
        l.stream()
                .map(element -> element * 2)
                .forEach(System.out::println) ;
//        l.set(5, 3) ;


    }
}
