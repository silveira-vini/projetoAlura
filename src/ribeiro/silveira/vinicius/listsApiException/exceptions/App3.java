package ribeiro.silveira.vinicius.listsApiException.exceptions;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.println("Type de user's name:");
        String name = entry.next();

        String urlGitHub = "https://api.github.com/users/" + name;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlGitHub))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… There's a error at consult API Github");
            e.printStackTrace();
        } catch (ErrorConsultGithubException | IllegalArgumentException e) {
            System.out.println("User not found - " + e.getMessage());
        }

        entry.close();


    }

}



