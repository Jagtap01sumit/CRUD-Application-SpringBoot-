package org.example.Repo;

import model.Student;

public interface StudentRepoImpl {
    void insertStudent(Student student);
    Student selectStudent(int rollNo);
}
