package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	public List<Student> getStudent();

	public Student getStudentById(Integer id);

	public Student getStudentByName(String name);

	public Student postStudent(Student student);

	public String deleteStudentById(Integer id);

	public String updateStudentById(Integer id, Student updatingStudent);
}
