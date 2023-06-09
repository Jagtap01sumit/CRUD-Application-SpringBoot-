package org.example.service;

import model.Student;
import org.example.Repo.StudentRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceImpl {
    @Autowired
    StudentRepoImpl repo;

    @Override
    public void insertStudent(Student student) {
        repo.insertStudent(student);
    }

    @Override
    public void insertMultiple(List<Student> studentList) {
       for(int i=0;i<studentList.size();i++){
           repo.insertStudent(studentList.get(i));
       }
    }


    @Override
    public Student selectStudent(int rollNo) {
        return repo.selectStudent(rollNo);
    }

    @Override
    public Student updateStudent(Student student) {
        return repo.updateStudent(student);

    }

    public boolean deleteStudent(int rollNo) {
        return repo.deleteStudent(rollNo);

    }
}
