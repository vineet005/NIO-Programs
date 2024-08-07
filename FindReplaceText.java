import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FindReplaceText {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/main/java/file1.txt");
        String targetText = "Without hesitation, Sir Lancelot accepted the quest. He rode for days, crossing rivers, climbing mountains, and braving the elements. Finally, he reached the entrance of the Enchanted Cave. The air was thick with tension as he stepped inside.\n";
        String replacementText = "“I am Sir Lancelot, and I seek the Scroll of Wisdom,” he declared, drawing his sword. The battle was fierce, but Sir Lancelot’s skill and determination prevailed. With a final, mighty blow, he defeated the dragon.\n" +
                "\n" +
                "Exhausted but triumphant, Sir Lancelot found the Scroll of Wisdom and returned to the kingdom. The people rejoiced, and the king bestowed upon him the highest honor. From that day forward, Sir Lancelot’s legend grew, and his name was remembered for generations.\n" +
                "\n" +
                "I hope you find this text useful! If you need more or something different, just let me know.";
        Path tempFilePath = Paths.get("src/main/java/temporaryFile.txt.temp");

        try (BufferedReader reader = Files.newBufferedReader(filePath);
             BufferedWriter writer = Files.newBufferedWriter(tempFilePath, StandardOpenOption.CREATE)){
            String line;
            while ((line = reader.readLine()) != null){
                String modifiedLine = line.replace(targetText, replacementText);
                writer.write(modifiedLine);
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            Files.delete(filePath);
            Files.move(filePath, tempFilePath);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}