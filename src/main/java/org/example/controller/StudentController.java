package org.example.controller;

import model.Student;
import org.example.service.StudentService;
import org.example.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    StudentServiceImpl service;

    @RequestMapping("/insert")
    @ResponseBody
    void insert(@RequestBody Student student){
        service.insertStudent(student);

    }

    @RequestMapping("/select")
    @ResponseBody
    Student selectStudent(@RequestParam int rollNo){
       return service.selectStudent(rollNo);
    }

//    @RequestMapping("/update")
//    @ResponseBody
//    Student updateStudent(@RequestBody Student student){
//        return;
//
//    }
//
//    @RequestMapping("/delete")
//    @ResponseBody
//    void deleteStudent(@RequestParam int rollNo){
//service.
//    }

}
