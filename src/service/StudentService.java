package service;

import model.Student;
import repository.MemoryDatabase;

import java.util.Collection;

public class StudentService {
    MemoryDatabase database;
    public StudentService(MemoryDatabase database){
        this.database=database;
    }
    public Student getStudent(String studentID){
      return database.getStudent(studentID);
    }

    public void addStudent(Student student){
        database.addStudent(student);
    }

    public void removeStudent(String studentID){
       database.removeStudent(studentID);
    }
    public Collection<Student> getAllStudent(){
        return database.getAllStudent();
    }

}
