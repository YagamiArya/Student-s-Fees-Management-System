package com.Arya.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arya.Model.Student;
import com.Arya.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student addStudent(Student student) {
		Student savedStudent = studentRepo.save(student);
		return savedStudent;
	}
	
	public List<Student> findAll() {
		return studentRepo.findAll();
	}
	
	public Student findById(int id) {
		Student student = studentRepo.findById(id).get();
		return student;
	}

	public Student update(Student student) {
		Student updatedStudent = studentRepo.save(student);
		return updatedStudent;
	}

	public void delete(int id) {
		Optional<Student> student = studentRepo.findById(id);
		if(student.isPresent()) {
			studentRepo.delete(student.get());
		}
	}

}
