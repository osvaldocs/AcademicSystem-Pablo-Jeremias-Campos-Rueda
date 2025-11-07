package com.riwi.academicSystem.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "professors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends User {

    @Column(name = "employee_number", nullable = false, unique = true)
    private String employeeNumber;

    @OneToMany(mappedBy = "professor")
    private List<Course> courses;

}
