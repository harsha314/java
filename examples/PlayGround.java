import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Map.* ;
import java.util.AbstractMap.* ;

public class PlayGround {
    public static void main(String[] args) {
        temp_2023_06_25();
    }

    public static void temp_2023_06_25() {

//        HashMap<Integer, Integer> hm = new HashMap<>() ;
//
//        hm.put(2, 0) ;
//        hm.put(5, 3) ;
//
//        for(Entry<Integer, Integer> entry : hm.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//        HashSet<Integer> hashSet = new HashSet<>() ;

//        SortedSet<Integer> sortedSet = new TreeSet<>();
//
//        sortedSet.add(1) ;
//        sortedSet.add(3) ;
//        sortedSet.add(5) ;
//
//        NavigableSet<Integer> navigableSet = new TreeSet<>() ;
//
//        navigableSet.add(1) ;
//        navigableSet.add(3) ;
//        navigableSet.add(5) ;
//
//
//        TreeSet<Integer> treeSet = new TreeSet<>() ;
//
//        treeSet.add(1) ;
//        treeSet.add(1) ;
//        treeSet.add(3) ;
//        treeSet.add(4) ;
//        treeSet.add(10) ;
//
//        System.out.println(treeSet.lower(1));
//        System.out.println(treeSet.higher(11));
//
//        for(Integer num : treeSet) {
//            System.out.println(num);
//        }
//
//
//        TreeMap<Integer, Integer> treeMap = new TreeMap<>() ;
//
//        treeMap.put(1, 2) ;
////        treeMap.put(2, 4) ;
//        treeMap.put(3, 6) ;
//        treeMap.put(5, 10) ;
//
//        System.out.println(treeMap.lowerKey(4));
//
//        Optional<Integer> optionalInteger = Optional.ofNullable(null) ;
//
//        optionalInteger.or(() -> Optional.of(0)) ;
//        Integer val = optionalInteger.orElse(0) ;
//
//        LocalDate localDate = LocalDate.now() ;
////        LocalDateTime localDateTime = LocalDateTime.now(). ;


    }

    public static void temp_2023_05_31() {
        System.out.println(Long.parseLong("1000000000000"));

        System.out.println(String.valueOf(5));

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

        System.out.println(Collections.binarySearch(list, 0));
        System.out.println(Collections.binarySearch(list, 1));
        System.out.println(Collections.binarySearch(list, 2));
        System.out.println(Collections.binarySearch(list, 3));
        System.out.println(Collections.binarySearch(list, 4));
        System.out.println(Collections.binarySearch(list, 10));

    }

    public static void temp_2023_05_30() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(9);
        list.add(5);

        System.out.println(list.indexOf(0));

    }

    public static void temp() {
        Double d = 1.0D;
        int l = (int) 1e9;
        System.out.println(l);
        int[] arr = { 0, 1, 3, 2, 5, 4 };
        Arrays.sort(arr);

    }

    public static void temp_2023_04_02() {
        int[] arr = { 0, 1, 2, 3, 4, 4, 4, 4, 5, 5 };
        // System.out.println(lower_bound(arr, 0));
        // System.out.println(Arrays.binarySearch(arr, 1));
        // System.out.println(Arrays.binarySearch(arr, 2));
        // System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 10));
        List<Integer> l = new ArrayList<>(Arrays.asList(4, 4, 4, 4, 5, 5));
        System.out.println(Collections.binarySearch(l, 4));
    }

    public static void temp_2023_04_07() {
        // int[] arr = {0, 1, 2, 3, 4, 5, 6};
        // List<Integer> A = new ArrayList<>(Arrays.asList(arr));
        int[] arr = { 1, 2, 3, 4, 5 };
        List<Integer> a1 = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        Set<Integer> s = new HashSet<>();
        s.add(0);
        s.add(1);
        System.out.println(s.contains(1));
    }

    public static void temp_2023_04_10() {
        Stack<Character> stack = new Stack<>();
        stack.add('(');
        stack.pop();
        // stack.peek();
        String s = "hello";
        s.substring(0, 1);
    }

    public static void temp_2023_04_25() {
        Set<Integer> st = new HashSet<>();
        st.add(5);
        ;
        System.out.println(st.contains(5));
        st.remove(5);
        System.out.println(st.contains(5));
    }

    public static void temp_2023_04_29() {
        int[][] arr = new int[][] { {}, {} };
        Arrays.sort(arr, Comparator.comparingInt(a -> a[2]));
        Set<int[]> st = new HashSet<>();
        st.add(new int[] { 1, 2, 3 });
    }

    public static void temp_2023_05_17() {

    }

}
