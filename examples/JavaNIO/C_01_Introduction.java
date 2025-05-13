package JavaNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class C_01_Introduction {
  public static void main(String[] args) {
    checkingForFileExistence();
  }

  public static void checkingForFileExistence() {
    String currentDir = System.getProperty("user.dir");
    System.out.println("Current working directory: " + currentDir);

    Path path = Path.of("examples", "JavaNIO", "input.txt");
    System.out.println(Files.exists(path));
  }

  public static void printingFileContents() {
    Pattern pattern = Pattern.compile("");
    pattern.matcher("hello").matches();
  }

  private static void notKnown() {
    Path directoryPath = Paths.get("javanio");

    try {
      Stream<Path> stream = Files.list(directoryPath);
      stream
          .filter(Files::isRegularFile) // Ensures only files, not subdirectories
          .forEach(file -> System.out.println(file.getFileName()));
    } catch (IOException e) {
      System.err.println("Error reading directory: " + e.getMessage());
    }

  }
}
