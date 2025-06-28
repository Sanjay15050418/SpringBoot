package com.example.StudentCRUD.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class Student {
    private int rollno;
    private String name;
    private String dept;
}
