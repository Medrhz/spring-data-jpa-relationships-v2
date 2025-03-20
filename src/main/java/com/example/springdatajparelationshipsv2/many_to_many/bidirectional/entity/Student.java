package com.example.springdatajparelationshipsv2.many_to_many.bidirectional.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "studnets_bi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(joinColumns = @JoinColumn(name = "bi_studnet_id"), inverseJoinColumns = @JoinColumn(name = "bi_course_id"))
    private List<Course> courses;


    public void addCourse (Course course) {
        if (!this.courses.contains(course)) {
            this.courses.add(course);
            if (!course.getStudents().contains(this)) { // Évite boucle infinie
                course.getStudents().add(this);
            }
        }
    }

    private String CourseName () {
        String showFirstlast = "";
        for (Course course : this.getCourses()) {
            showFirstlast += "first name : " + course.getName();
        }
        return showFirstlast;
    }


    @Override
    public String toString () {
        return "Student{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + ", courses=\n\t" + this.CourseName() + '}';
    }
}
