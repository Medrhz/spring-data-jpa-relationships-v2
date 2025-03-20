package com.example.springdatajparelationshipsv2.many_to_many.bidirectional.service;


import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.entity.Student;
import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
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
