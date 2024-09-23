package ribeiro.silveira.vinicius.persistingDataInFiles;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App2 {
    public static void main(String[] args) {

        Title t1 = new Title("Matrix", "Robert de Niro", 1987, 4.8);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(t1);

        System.out.println(json);

    }

}
