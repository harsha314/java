package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;

public class Basics {
    public static void main(String[] args) {
        fileReaderExample();
    }

    public static void fileReaderExample() {
        try (FileReader fr = new FileReader("./examples/JavaIO/input.txt");
                FileWriter fw = new FileWriter("./examples/JavaIO/output.txt")) {
            int data = fr.read();
            while (data != -1) {
                fw.write(data);
                System.out.print((char) data);
                data = fr.read();
            }
        } catch (Exception e) {
            System.out.println("Excpetion Occured: " + e.getLocalizedMessage());
        }
    }

}