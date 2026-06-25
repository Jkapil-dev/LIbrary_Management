package service;

import model.Book;
import model.Student;
import repository.MemoryDatabase;

public class IssueService {
    private MemoryDatabase database;
    private BookService bookService ;
    private StudentService studentService ;
    public IssueService(MemoryDatabase database) {
        this.database = database;
        this.bookService = new BookService(database);
        this.studentService = new StudentService(database);
    }

    public void issueBook(String bookID , String studentID){

        Book book = bookService.getBook(bookID);
        Student student = studentService.getStudent(studentID);

        if(book==null){
            System.out.println("Book not found!");
            return;
        }
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        if(!book.isAvailable()){
            System.out.println("Book is not available!");
            return ;
        } else if (!student.canBorrow()){
            System.out.println("Student cannot borrow more books!");
            return;
        }

        student.borrowBook(bookID);
        book.issueBook();
        System.out.println("Book issued successfully.");
    }
    public void returnBook(String bookID , String studentID){
        Book book = bookService.getBook(bookID);
        Student student = studentService.getStudent(studentID);

        if(book==null){
            System.out.println("Book not found!");
            return;
        }
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }
        if (!student.getBorrowedBooks().contains(bookID)) {
            System.out.println("Book can't be removed as it is not borrowed!");
            return;
        }

        student.returnBook(bookID);
        book.returnBook();
        System.out.println("Book returned successfully.");
    }
}
