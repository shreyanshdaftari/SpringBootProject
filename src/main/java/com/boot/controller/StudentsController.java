package com.boot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.Students;
import com.boot.repo.StudentsRepo;
import com.boot.service.StudentsService;

@RestController
public class StudentsController {

	@Autowired
	private StudentsService ser;
	
	@PostMapping("/Students")
	public void addStudent(@RequestBody Students std) {
		ser.addStudent(std);
	}
	
	@GetMapping("/Student/{id}")
	public Optional<Students> getStudentById(@PathVariable int id) {
		return ser.getStudentById(id);
	}
	
	@GetMapping("/Students/{city}")
	public List<Students> getStudentsByCity(@PathVariable String city){
		return ser.getStudentsByCity(city);
	}
	
	@GetMapping("/Students")
	public List<Students> getAllStudents() {
		return ser.getAllStudents();
	}
	
	@DeleteMapping("/Students/{id}")
	public void deleteStudent(@PathVariable int id) {
		ser.deleteStudent(id);
	}
	
	@PutMapping("/Students/{id}")
	public Students updateStudentById(@PathVariable int id, @RequestBody Students newStd) {
		return ser.updateStudentById(id, newStd);
	}
}
