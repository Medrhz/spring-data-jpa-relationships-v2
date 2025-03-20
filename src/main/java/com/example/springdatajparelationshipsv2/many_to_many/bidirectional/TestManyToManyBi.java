package com.example.springdatajparelationshipsv2.many_to_many.bidirectional;

import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.entity.Course;
import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.entity.Student;
import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.service.CourseService;
import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class TestManyToManyBi implements CommandLineRunner {
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;

    public static void main (String[] args) {
        SpringApplication.run(TestManyToManyBi.class);
    }

    @Override
    public void run (String... args) throws Exception {


        // 1️⃣ Créer et sauvegarder les cours
        Course course1 = new Course(null, "java", new ArrayList<>());
        Course course2 = new Course(null, "php", new ArrayList<>());
        Course course3 = new Course(null, "python", new ArrayList<>());
        Course course4 = new Course(null, "javaScript", new ArrayList<>());

        course1 = this.courseService.saveCourse(course1);
        course2 = this.courseService.saveCourse(course2);
        course3 = this.courseService.saveCourse(course3);
        course4 = this.courseService.saveCourse(course4);

        // 2️⃣ Créer les étudiants
        Student student = new Student(null, "mohamed", "rhziza", new ArrayList<>());
        student.addCourse(course1);
        student.addCourse(course2);
        student.addCourse(course3);

        Student student1 = new Student(null, "test", "test", new ArrayList<>());
        student1.addCourse(course3);
        student1.addCourse(course4);

        // 3️⃣ Sauvegarde des étudiants
        System.out.println(this.studentService.saveStudent(student));
        System.out.println(this.studentService.saveStudent(student1));


    }
}

