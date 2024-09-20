package ribeiro.silveira.vinicius.listsApiException.externFrameworks;

public class Publisher {
    String name;
    int booksReleased;

    public Publisher(String name, int booksReleased) {
        this.name = name;
        this.booksReleased = booksReleased;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "name='" + name + '\'' +
                ", booksReleased=" + booksReleased +
                '}';
    }
}
