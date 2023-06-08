package org.example.service;

import model.Student;
import org.example.Repo.StudentRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceImpl {
    @Autowired
    StudentRepoImpl repo;

    @Override
    public void insertStudent(Student student) {
        insertStudent(student);
    }

    @Override
    public Student selectStudent(int rollNo) {
        return repo.selectStudent(rollNo);
    }
}
