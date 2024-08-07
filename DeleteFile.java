import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args){
        Path file = Paths.get("src/main/java/destinationFile.txt");
        try{
            Files.delete(file);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
