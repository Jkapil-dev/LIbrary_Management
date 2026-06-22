package service;

import model.Book;
import repository.MemoryDatabase;

import java.util.Collection;

public class BookService {
    MemoryDatabase database;
    public BookService(MemoryDatabase database){
        this.database=database;
    }

    public Book getBook(String bookID){
        return  database.getBook(bookID);
    }


    public void addBook(Book book){
        database.addBook(book);
    }

    public void removeBook(String bookID){
       database.removeBook(bookID);
    }

    public Collection<Book> getAllBooks(){
        return database.getAllBooks();
    }

}
