package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsExample {

    int count;

    public static void main(String[] args) {
        // int n = 4;
        // int[] arr = { 1, 2, 10, 9, 7, 3, 8, 6 };
        // Optional<Integer> result =
        // Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(n -
        // 1).findFirst();
        // System.out.println(result.orElse(-1));
        getCharacterFrequencyFromString();
    }

    private static void flatMapUsage() {

        // flatMap accepts a functional interface which returns a stream
        List<List<String>> list = Arrays.asList(
                Arrays.asList("a", "c"),
                Arrays.asList("b", "d"));
        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

    private static void getCharacterFrequencyFromString() {
        String input = "streamsample";

        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                        c -> c, // key mapper: the character
                        c -> 1L, // value mapper: initial count is 1
                        (a, b) -> a + b // merge function: increment count if duplicate key
                ));

        frequencyMap.forEach((ch, count) -> System.out.println("'" + ch + "' -> " + count));
    }
}
