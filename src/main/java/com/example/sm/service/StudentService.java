package com.example.sm.service;



import com.example.sm.entity.Student;
import com.example.sm.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudents();
    Student createStudent(Student student);
    Student getStudentById(String id);
    Student updateStudent(String id, Student student);
    void deleteStudent(String id);
}
