import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveOrRenameFile {
    public static void main(String[] args) {
        Path file = Paths.get("src/main/java/file.txt");
        Path renamedFile = Paths.get("src/main/java/renamedFile.txt");
        try{
            Files.move(file, renamedFile, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
