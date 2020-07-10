package com.kashif.school.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kashif.school.models.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{

}
