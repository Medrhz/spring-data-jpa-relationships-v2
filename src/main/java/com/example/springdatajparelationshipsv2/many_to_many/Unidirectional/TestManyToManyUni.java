//package com.example.springdatajparelationshipsv2.many_to_many.Unidirectional;
//
//
//import com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.service.CourseService;
//import com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class TestManyToManyUni implements CommandLineRunner {
//    @Autowired
//    private StudentService studentService;
//    @Autowired
//    private CourseService courseService;
//
//    public static void main (String[] args) {
//        SpringApplication.run(TestManyToManyUni.class);
//    }
//
//    @Override
//    public void run (String... args) throws Exception {

//        Course course = new Course(null, "java");
//        Course course2 = new Course(null, "php");
//        Course course3 = new Course(null, "python");
//        Course course4 = new Course(null, "javaScript");
//
//        Student student = new Student(null, "mohamed", "rhziza", Arrays.asList(course, course2, course3, course4));
//        System.out.println(this.studentService.saveStudent(student));


//        this.studentService.getAllStudents().forEach(student -> {
//            System.out.println(student.getFirstName());
//            System.out.println(student.getLastName());
//            System.out.println(student.getCourses());
//        });

//        this.courseService.getAllCourses().forEach(course -> {
//            System.out.println(course);
//        });

//
//    }
//}
