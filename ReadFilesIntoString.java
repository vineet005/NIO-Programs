import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFilesIntoString {
    public static void main(String[] args) {
        Path file = Paths.get("src/main/java/renamedFile.txt");
        try {
            String content = Files.readString(file);
            System.out.println(content);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
