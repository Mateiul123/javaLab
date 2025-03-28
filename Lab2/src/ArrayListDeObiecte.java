import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}

public class ArrayListDeObiecte {
    public static void main(String[] args) {
        // Declarație și inițializare
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        // Parcurgere și afișare
        System.out.println("Parcurgere și afișare a ArrayList-ului de obiecte Book:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}