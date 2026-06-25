import model.Book;
import model.Student;
import repository.MemoryDatabase;
import service.BookService;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        MemoryDatabase db = new MemoryDatabase();
        BookService bookService = new BookService(db);
        StudentService studentService = new StudentService(db);

        Book book1 =
                new Book("B101",
                "Clean Code",
                "Robert Martin",
                "Programming");

        Book book2 =
                new Book("B102",
                        "Effective Java",
                        "Joshua Bloch",
                        "Programming");

        Book book3 =
                new Book("B103",
                "Design Patterns",
                "Erich Gamma",
                "Software Engineering");

        Student student1 =
                new Student("S100","Alex Morgan");
        Student student2 =
                new Student("S101", "Emma Watson");
        Student student3 =
                new Student("S102", "James Anderson");

        studentService.addStudent(student1);
        studentService.addStudent(student2);
        bookService.addBook(book1);
        bookService.addBook(book2);
        System.out.println( " Book by id : "+ bookService.getBook(book1.getBookID()));
        System.out.println( " Student by id : "+ studentService.getStudent(student1.getStudentID()));
        System.out.println("All Books : " + bookService.getAllBooks());
        System.out.println("All Students : " + studentService.getAllStudent());




    }
}
