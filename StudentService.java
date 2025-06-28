package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"sanjay","java"),
                    new Student(2,"kumar","python")
            )
    );

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudbyRno(int rno) {
        int index=0;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRollno()==rno){
                index=i;
            }
        }
        return students.get(index);
    }
}
