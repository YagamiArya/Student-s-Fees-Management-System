package com.Arya.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arya.Model.Student;
import com.Arya.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService = new StudentService();
	
	@RequestMapping("Home")
	public String showHomePage() {
		return "HomePage";
	}
	
	@RequestMapping("add")
	public String AddStudentPage() {
		return "addStudentPage";
	}
	
	@RequestMapping("addStudent")
	public String AddStudent(@ModelAttribute("student") Student student, ModelMap modelMap) {
//		System.out.println(student);
		studentService.addStudent(student);
		SimpleDateFormat dnt = new SimpleDateFormat("dd/MM/yy :: HH:mm:ss");
        Date date = new Date();
        System.out.println("Today Date & Time at Now :"+dnt.format(date)); 
		student.setPayment_date(date);
		String msg = student.getName()+" is added as a new Student";
		modelMap.addAttribute("msg", msg);
		return "addStudentPage";
	}
	
	@RequestMapping("viewStudents")
	public String ViewStudents(@ModelAttribute("student") Student student, ModelMap modelMap) {
		List<Student> students = studentService.findAll();
		modelMap.addAttribute("students", students);
		return "viewAllPage";
	}
	
	@RequestMapping("editStudent")
	public String editUser(@RequestParam("id") int id, ModelMap modelMap) {
		Student student = studentService.findById(id);
		modelMap.addAttribute("student", student);
		return "editStudentPage";
	}
	
	@RequestMapping("updateStudent")
	public String updateUser(@ModelAttribute("student") Student student, ModelMap modelMap) {
		System.out.println(student);
		Student updatedStudent = studentService.addStudent(student);
		String msg = "Student updated successfully with id:"+updatedStudent.getId();
		modelMap.addAttribute("msg", msg);
		return "editStudentPage";
	}
	
	@RequestMapping("deleteStudent")
	public String deleteUser(@RequestParam("id") int id, ModelMap modelMap) {
		studentService.delete(id);
		String msg = "Student deleted successfully.";
		List<Student> students = studentService.findAll();
		modelMap.addAttribute("students", students);
		modelMap.addAttribute("msg", msg);
		return "viewAllPage";
	}
	

	
	
	
	
	
	
	
}
