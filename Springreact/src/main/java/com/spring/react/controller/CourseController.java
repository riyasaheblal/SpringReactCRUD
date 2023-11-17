package com.spring.react.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.react.model.Course;
import com.spring.react.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService coService;
	
	@GetMapping("/")
	public List<Course> addcourse() {
		return this.coService.addlist();
	}
	
	//create
	@PostMapping("/courses")
	public Course create(@RequestBody Course cou) {
	return this.coService.createcou(cou);
}
	
	//getall
	@GetMapping("/courses")
	public List<Course> getAll(){
		return this.coService.getAll();
	}
	
	//read by id
	@GetMapping("/courses/{Id}")
	public Optional<Course> getId(@PathVariable int Id) {
		return this.coService.getById(Id);
	}
	
	
	//update
	@PutMapping("/courses/{Id}")
	public Course update(@PathVariable int Id,@RequestBody Course cou) {
	return 	this.coService.updatecou(cou, Id);
		//return cou;
	}
	
	//delete
	@DeleteMapping("/courses/{Id}")
	public void delete(@PathVariable int Id) {
		this.coService.deletebyId(Id);
	}
}
