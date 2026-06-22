import model.Book;
import repository.MemoryDatabase;

public class Main {
    public static void main(String[] args) {
        MemoryDatabase db = new MemoryDatabase();
        Book book1 = new Book("B101", "Clean Code", "Robert Martin", "Programming");
        db.addBook(book1);
        System.out.println(db.getBook("B101"));
        db.removeBook("B101");
        System.out.println(db.getBook("B101"));


    }
}
