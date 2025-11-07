package com.riwi.academicSystem.infrastructure;

import com.riwi.academicSystem.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByEnrollmentNumber(String enrollNumber);
}
