import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryTreeCreator {
    static void createDirectoryTree(Path path){
        try {
            Files.createDirectories(path);
            System.out.println("Directory Tree Created: "+path);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Path baseDirectory = Paths.get("src/main/java/");
        String[] subDirs = {"subdir1", "subdir1/subdir2", "subdir1/subdir2/subdir3"};

        for (String subDir: subDirs)
            createDirectoryTree(baseDirectory.resolve(subDir));
    }
}
