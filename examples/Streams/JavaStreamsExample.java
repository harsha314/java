package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavaStreamsExample {

    int count;

    public static void main(String[] args) {
        int n = 4 ;
        int[] arr = {1, 2, 10, 9, 7, 3, 8, 6} ;
        Optional<Integer> result = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(n - 1).findFirst() ;
        System.out.println(result.orElse(-1));
    }

}
