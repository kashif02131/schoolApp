package com.kashif.school.restControllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kashif.school.models.Student;
import com.kashif.school.repos.StudentRepo;

@RestController
@RequestMapping("/studentapi")
public class StudentRestController {

	@Autowired
	private StudentRepo repo;

	@GetMapping(path = "/student")
	public List<Student> getStudentlist() {
		return repo.findAll();
	}

	@GetMapping(path = "/student/{id}")
	public Student getStudent(@PathVariable Long id) {
			return repo.findById(id).get();
	}

	@PostMapping(path = "/student")
	public Student createStudent(@RequestBody Student student) {
			return repo.saveAndFlush(student);	
	}

	@DeleteMapping(path = "/student/{id}")
	public void deleteStudent(@PathVariable Long id) {
		repo.deleteById(id);

	}

	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable Long id) {
		Student existingStudent = repo.getOne(id);
		BeanUtils.copyProperties(student, existingStudent, "student_mobile");
		return repo.saveAndFlush(existingStudent);
	}
}
