package com.example.springdatajparelationshipsv2.many_to_many.bidirectional.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Table(name = "courses_bi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "courses", cascade = CascadeType.MERGE)
    private List<Student> students;

    public void addStudent (Student student) {
        if (!this.students.contains(student)) {
            this.students.add(student);
            student.addCourse(this);  // Ajoute le cours à l'étudiant aussi
        }
    }

    private String StudentFirstLastName () {
        String showFirstlast = "";
        for (Student student : this.getStudents()) {
            showFirstlast += "first name : " + student.getFirstName() + "\nlast name : " + student.getLastName();
        }
        return showFirstlast;
    }

    @Override
    public String toString () {
        return "Course{" + "id=" + this.id + ", name='" + this.name + '\'' + ", students=\n\t" + this.StudentFirstLastName() + '}';
    }
}
