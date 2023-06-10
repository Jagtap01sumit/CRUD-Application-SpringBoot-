package org.example.service;

import model.Student;
import org.example.Repo.StudentRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        for (int i = 0; i < studentList.size(); i++) {
            repo.insertStudent(studentList.get(i));
        }
    }


    @Override
    public Student selectStudent(int rollNo) {
        return repo.selectStudent(rollNo);
    }


    @Override
    public List<Student> selectMultiple(List<Integer> rollNo) {

        List<Student> studentList = new ArrayList<>();//empty list
        for (int i = 0; i < rollNo.size(); i++) {
            studentList.add(repo.selectStudent(rollNo.get(i)));
        }
        return studentList;
    }


    @Override
    public Student updateStudent(Student student) {
        return repo.updateStudent(student);

    }

    @Override
    public List<Student> updateMultiple(List<Student> studentList) {
        List<Student> studentList1 = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            studentList1.add(repo.updateStudent(studentList.get(i)));
        }
        return studentList1;
    }

    public boolean deleteStudent(int rollNo) {
        return repo.deleteStudent(rollNo);

    }


}

