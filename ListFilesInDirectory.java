import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        Path directory = Paths.get("src/main/java");
        try(Stream<Path> streamOfFiles = Files.list(directory)){
            streamOfFiles.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
