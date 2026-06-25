package model;


import java.time.LocalDate;

public class Transaction {

    private String transactionID;
    private String studentID;
    private String bookID;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    public Transaction(){

    }

    public Transaction (String transactionID , String studentID , String bookID ,
                        LocalDate dueDate, LocalDate issueDate , LocalDate returnDate ){
         this.transactionID=transactionID;
         this.studentID=studentID;
         this.bookID=bookID;
         this.issueDate=issueDate;
         this.dueDate=dueDate;
         this.returnDate=returnDate;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", bookID='" + bookID + '\'' +
                ", studentID='" + studentID + '\'' +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", returnDate=" + returnDate +
                '}';
    }

    public boolean isReturned(){

       return returnDate != null ;
    }
    public boolean isOverdue(){

        return !isReturned() && LocalDate.now().isAfter(dueDate);
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}
