package org.example.service;

import model.Student;

import java.util.List;

public interface StudentServiceImpl {

    void insertStudent(Student student);

    void insertMultiple(List<Student> studentList);

    Student selectStudent(int rollNo);

    List<Student> selectMultiple(List<Integer> rollNo);

    Student updateStudent(Student student);

    List<Student> updateMultiple(List<Student> studentList);

    boolean deleteStudent(int rollNo);

}
