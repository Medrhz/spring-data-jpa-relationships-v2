package com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.service;


import com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.entity.Student;
import com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent (Student student) {
        return this.studentRepository.save(student);
    }

    public List<Student> getAllStudents () {
        return this.studentRepository.findAll();
    }
}
