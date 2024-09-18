package ribeiro.silveira.vinicius.listsApiException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class coinGeckoAPI {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner entry = new Scanner(System.in);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=usd"))
                .header("accept", "application/json")
                .header("x-cg-demo-api-key", "CG-Gz3Yrf8QAx3mGMbZuTgmN72d")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());



        entry.close();


    }


}
