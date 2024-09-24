package ribeiro.silveira.vinicius.consolidatingKnowledge;

import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {

    public static void makeFile(String str) throws IOException {
        FileWriter escrita = new FileWriter("completeAddress.json");
        escrita.write(str);
        escrita.close();
    }

}
