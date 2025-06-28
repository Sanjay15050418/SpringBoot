package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("students/{rollno}")
    public Student getStudentbyRno(@PathVariable("rollno") int rno){
        return studentService.getStudbyRno(rno);
    }
}
