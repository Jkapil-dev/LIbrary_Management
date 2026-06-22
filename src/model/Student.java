package model;

import java.util.List;

public class Student {
    private String studentName;
    private String studentID;
    private List<String> borrowedBooks;

    public boolean canBorrow(){
        return this.borrowedBooks.size() < 3;
    }
    public void issueBook(){

    }
    public void returnBook(){

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setBorrowedBooks(List<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }
}
