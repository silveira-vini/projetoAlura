package ribeiro.silveira.vinicius.consolidatingKnowledge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Buscador {
    public static void main(String[] args) throws Exception {

        Scanner entry = new Scanner(System.in);

        int repeat = 1;
        String urlViaCEP;

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        while (repeat == 1) {
            System.out.println("====== BUSCA DE ENDEREÇO / CEP ======");
            System.out.println("""
                    Menu (digite a opção desejada)
                    1-Busca por CEP
                    2-Busca por endereço""");
            int option = entry.nextInt();

            if (option == 1) {
                System.out.println("Digite o CEP:");
                String cep = entry.next();
                cep = NormalizerStr.formatCEP(cep);

                if (!validatorCEP.validarCEP(cep)) {
                    System.out.println("CEP inválido. Digite 8 números, sem ponto ou espaços");
                    break;
                }

                urlViaCEP = "https://viacep.com.br/ws/" + cep + "/json/";

                try {
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(urlViaCEP))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    Address a1 = gson.fromJson(json, Address.class);
                    FileMaker.makeFile(json);

                    System.out.println(a1.toString());

                } catch (Exception e) {
                    throw new RuntimeException("Não consegui obter endereço a partir dessa requisição");
                }

            } else if (option == 2) {

                System.out.println("Digite a UF:");
                String uf = entry.next().trim();
                entry.nextLine();

                System.out.println("Digite a cidade:");
                String cidade = entry.nextLine();
                cidade = NormalizerStr.formatString(cidade);

                System.out.println("Digite o logradouro");
                String logradouro = entry.nextLine();
                logradouro = NormalizerStr.formatString(logradouro);

                String urlViaEndereco = "https://viacep.com.br/ws/"
                        + uf + "/"
                        + cidade + "/"
                        + logradouro + "/json/";

                try {
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(urlViaEndereco))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    System.out.println("Endereços localizados:");
                    System.out.println(json);

                } catch (Exception e) {
                    throw new RuntimeException("Não consegui obter endereço a partir dessa requisição");
                }
                System.out.println("");

            } else {
                System.out.println("Opção inválida");
            }

            System.out.println("Deseja fazer mais uma busca? 1-SIM  2-NÃO");
            repeat = entry.nextInt();

            if (repeat != 1 && repeat != 2) {
                System.out.println("Dígito inválido");
                break;
            }
        }

        System.out.println("Fim do programa");
        entry.close();
    }
}
