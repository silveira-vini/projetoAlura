package ribeiro.silveira.vinicius.listsApiException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class googleBooksAPI {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner entry = new Scanner(System.in);

        System.out.println("Digite um livro: ");
        var busca = entry.next();

        var urlAPI = "https://www.googleapis.com/books/v1/volumes?q=" +
                busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlAPI))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());



    }

}
