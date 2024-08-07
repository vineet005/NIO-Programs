import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckFileExistence {
    public static void main(String[] args) {
        Path file = Paths.get("src/main/java/renamedFile.txt");
        boolean exist = Files.exists(file);
        if(exist)
            System.out.println("File Exist.");
        else
            System.out.println("Files Does Not Exist.");
    }
}
