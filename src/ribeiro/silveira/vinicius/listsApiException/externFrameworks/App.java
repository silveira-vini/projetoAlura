package ribeiro.silveira.vinicius.listsApiException.externFrameworks;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.swing.text.html.ListView;

public class App {
    public static void main(String[] args) {
        String json1 = """
                  {
                    "name" : "João",
                    "year" : "35",
                    "city" : "Brasilia"
                  }
                """;

        Gson gson1 = new Gson();
        Person p1 = gson1.fromJson(json1, Person.class);
        System.out.println(p1.toString());

        Publisher pub1 = new Publisher("Polaris", 58);
        Book b1 = new Book("O vento levou", "Vinicius", pub1);
        System.out.println(b1);


        String json2 = """
                  {
                    "title" : "Memórias",
                    "writer" : "Fábio Junior",
                    "publisher" : {
                    "name" : "Gavião Editora",
                    "booksReleased" : "85"
                    }
                  }
                """;
        Gson gson2 = new Gson();
        Book b2 = gson2.fromJson(json2, Book.class);
        System.out.println(b2);


    }

}
