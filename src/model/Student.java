package model;

import java.util.List;
import java.util.SplittableRandom;

public class Student {
    private String studentName;
    private String studentID;
    private List<String> borrowedBooks;
    public Student(){

    }

    public Student( String studentID , String studentName  ){
        this.studentID=studentID;
        this.studentName=studentName;
    }

    public boolean canBorrow(){
        return this.borrowedBooks.size() < 3;
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

    public void borrowBook(String bookID) {
       borrowedBooks.add(bookID);
    }
    public void returnBook(String bookID){
        borrowedBooks.remove(bookID);
    }


    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=m" + studentID + '\'' +
                ", name='" + studentName + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
