package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studentService;

	@GetMapping(value = "/get")
	public List<Student> getStudent() {
		return studentService.getStudent();
	}

	// get Students By Id
	@GetMapping(value = "/getbyid/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}

	// get Students By Name
	@GetMapping(value = "/getbyname/{name}")
	public Student getStudentByName(@PathVariable String name) {
		return studentService.getStudentByName(name);
	}

	// insert a student record in DB
	@PostMapping(value = "/post")
	public Student postStudent(@RequestBody Student student) {
		return studentService.postStudent(student);
	}

	// delete Student By Id
	@DeleteMapping(value = "/delete/{id}")
	public String deleteStudentById(@PathVariable Integer id) {
		return studentService.deleteStudentById(id);
	}

	// Update Student By Id
	@PutMapping(value = "/update/{id}")
	public String updateStudentById(@PathVariable Integer id, @RequestBody Student student) {
		return studentService.updateStudentById(id, student);
	}

}
