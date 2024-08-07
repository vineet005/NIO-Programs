import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/main/java/file.txt");
        try{
            Files.write(filePath, "\nLine1\nLine2\nLine3".getBytes(), StandardOpenOption.APPEND);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
