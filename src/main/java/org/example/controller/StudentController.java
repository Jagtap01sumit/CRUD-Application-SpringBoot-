package org.example.controller;

import model.Student;
import org.example.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentServiceImpl service;

    @RequestMapping("/insert")
    @ResponseBody
    void insert(@RequestBody Student student) {
        service.insertStudent(student);

    }

    @RequestMapping("/insertMultiple")
    @ResponseBody
    void insertMultiple(@RequestBody List<Student> studentList) {
        service.insertMultiple(studentList);

    }

    @RequestMapping("/select")
    @ResponseBody
    Student selectStudent(@RequestParam int rollNo) {
        return service.selectStudent(rollNo);
    }

    @RequestMapping("/selectMultiple")
    @ResponseBody
    List<Student> selectMultiple(@RequestParam List<Integer> rollNo) {
        return service.selectMultiple(rollNo);
    }

    @RequestMapping("/update")
    @ResponseBody
    Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);

    }

    @RequestMapping("/updateMultiple")
    @ResponseBody
    List<Student> updateMultiple(@RequestBody List<Student> studentList) {
        return service.updateMultiple(studentList);

    }

    @RequestMapping("/delete")
    @ResponseBody
    boolean deleteStudent(@RequestParam int rollNo) {
        return service.deleteStudent(rollNo);
    }
//
//    @RequestMapping("/deleteMultiple")
//    @ResponseBody
//    boolean deleteMultiple(@RequestParam List<Integer> rollNo) {
//        return service.deleteMultiple(rollNo);
//    }
}
