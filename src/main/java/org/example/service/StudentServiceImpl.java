package org.example.service;

import model.Student;

public interface StudentServiceImpl {

    void insertStudent(Student student);
    Student selectStudent(int rollNo);
}
