package com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.service;


import com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.entity.Course;
import com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse (Course course) {
        return this.courseRepository.save(course);
    }

    public List<Course> getAllCourses () {
        return this.courseRepository.findAll();
    }
}
