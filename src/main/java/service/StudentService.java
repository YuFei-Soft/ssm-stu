package service;

import entity.Student;

import java.util.List;

public interface StudentService {


    public List<Student> getAll();

    public  boolean add(Student student);
}
