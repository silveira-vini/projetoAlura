package ribeiro.silveira.vinicius.listsApiException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class mealdbAPI {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite o prato: ");
        String busca = entry.next();

        String urlAPI = "https://www.themealdb.com/api/json/v1/1/search.php?s=" +
                busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlAPI))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        entry.close();

    }

}
