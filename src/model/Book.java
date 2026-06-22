package model;

public class Book {
    private String bookID;
    private String bookTitle;
    private String bookAuthor;
    private String bookCategory;
    private boolean isAvailable;
    public Book(){

    }

    public Book(String bookID, String bookTitle, String bookAuthor, String bookCategory){
        this.bookID=bookID;
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.bookCategory=bookCategory;
        this.isAvailable=true;

    }
    public void issueBook(){

    }
    public void returnBook(){

    }


    public void setBookID(String bookID){
        this.bookID=bookID;
    }
    public String getBookID() {
        return this.bookID;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}
