import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadLines {
    public static void main(String[] args) {
        Path filepath = Paths.get("src/main/java/file.txt");
        try(Stream<String> lines = Files.lines(filepath)){
            lines.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
