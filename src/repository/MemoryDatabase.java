package repository;

import model.Book;
import model.Student;
import model.Transaction;

import java.util.*;

public class MemoryDatabase implements Database {
    private Map< String , Book > books = new HashMap<>();
    private Map< String , Student > students = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();

//books
    public Book getBook(String bookID){
        if(books.containsKey(bookID)){
            return books.get(bookID);
        }else System.out.println("Book not found !");
        return null;
    }

    public void addBook(Book book){
        books.put(book.getBookID(), book);
    }

    public void removeBook(String bookID){
        if(books.containsKey(bookID)){
            books.remove(bookID);
        }else System.out.println("Library don't have book :"+bookID);
    }
    public Collection<Book> getAllBooks(){
        return books.values();
    }


//students
public Student getStudent(String studentID){
    if(students.containsKey(studentID)){
        return students.get(studentID);
    }else System.out.println("Student not found !");
    return null;
}

    public void addStudent(Student student){
        students.put(student.getStudentID(), student);
    }

    public void removeStudent(String studentID){
        if(students.containsKey(studentID)){
            students.remove(studentID);
        }else System.out.println("Library don't have book :"+studentID);
    }
    public Collection<Student> getAllStudent(){
        return students.values();
    }

}
