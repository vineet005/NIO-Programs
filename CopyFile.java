import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] args) {
        Path file = Paths.get("src/main/java/file.txt");
        Path destinationFile = Paths.get("src/main/java/destinationFile.txt");

        try{
            Files.copy(file, destinationFile, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
