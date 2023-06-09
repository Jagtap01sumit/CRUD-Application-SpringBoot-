package org.example.service;

import model.Student;

import java.util.List;

public interface StudentServiceImpl {

    void insertStudent(Student student);
    void insertMultiple(List<Student> studentList);
    Student selectStudent(int rollNo);
    Student updateStudent(Student student);
    boolean deleteStudent(int rollNo);
}
