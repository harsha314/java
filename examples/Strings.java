import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        trail_2023_03_18();
    }
    public static void trial() {
        String s = "hello" ;
        int alphaIndex = (int)(s.charAt(0) - 'a') ;
    }
    public static void trail_2023_03_18() {

        String text = "Java is a fun programming language";

        // split string from space
        String[] result = text.split(" ");

        Arrays.stream(result).forEach(System.out::println);

        text = "hello.there.how.are.you";
        String[] res = text.split("\\.");
        Arrays.stream(res).forEach(System.out::println);

    }
}
