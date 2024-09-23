package ribeiro.silveira.vinicius.persistingDataInFiles;

import java.io.FileWriter;
import java.io.IOException;

public class App1 {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("content recorded in file");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
