package com.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.boot.entity.Students;
import com.boot.repo.StudentsRepo;

@Service
public class StudentsService {

	@Autowired
	private StudentsRepo repo;
	
	public void addStudent(Students std) {
		repo.save(std);
	}
	
	public Optional<Students> getStudentById(int id) {
		return repo.findById(id);
	}
	
	public List<Students> getStudentsByCity(String city){
		return repo.getStudentsByCity(city);
	}
	
	public List<Students> getAllStudents() {
		return repo.findAll();
	}
	
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}
	
	public Students updateStudentById(int id, Students newStd) {
		return repo.findById(id)
		.map(
				currentStd -> {
					currentStd.setFirstName(newStd.getFirstName());
					currentStd.setLastNamee(newStd.getLastNamee());
					currentStd.setDob(newStd.getDob());
					currentStd.setCity(newStd.getCity());
					
					return repo.save(currentStd);
				})
		.orElseGet(
				() -> {
					return repo.save(newStd);
				});
	}
}
