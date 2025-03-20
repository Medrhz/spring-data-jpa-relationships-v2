package com.example.springdatajparelationshipsv2.many_to_many.bidirectional.service;


import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.entity.Course;
import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.repository.CourseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse (Course course) {
        return this.courseRepository.save(course);
    }

    public List<Course> getAllCourses () {
        return this.courseRepository.findAll();
    }

    public Course getCourse (Long id) {
        return this.courseRepository.findById(id).get();
    }
}
