package ribeiro.silveira.vinicius.persistingDataInFiles;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App3 {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Ford", "Mustang", "Blue", 2022);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(v1);
        System.out.println(json);

    }
}
