package ribeiro.silveira.vinicius.listsApiException.externFrameworks;

public class Book {

    String title;
    String writer;
    Publisher publisher;

    public Book(String title, String writer, Publisher publisher) {
        this.title = title;
        this.writer = writer;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", publisher=" + publisher +
                '}';
    }
}
