package com.riwi.academicSystem.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "students")
public class Student extends User {
    @Column(name = "enrollment_number", nullable = false, unique = true)
    private String enrollmentNumber;


    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
