package com.spring.react.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.react.model.Course;
import com.spring.react.repo.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo couRepo;
	
	List<Course> list;
	{
		System.out.println("hello");
	}
	public CourseService() {
		list=new ArrayList<>();
		list.add(new Course(1, "Java", "Developer"));
		list.add(new Course(2, "Python", "Developer"));
System.out.println(list);
}
	
public List<Course> addlist() {
		// TODO Auto-generated method stub
		return list;
	}


//create
public Course createcou(Course cou) {
	 Course cour=this.couRepo.save(cou);
	 return cour;
}

//read
public List<Course> getAll() {
	return this.couRepo.findAll();
}

//readId
public Optional<Course> getById(int id) {
	return this.couRepo.findById(id);
}


//update
public Course updatecou(Course cou,int Id) {
	cou.setId(Id);
	return this.couRepo.save(cou);
}

public void deletebyId(int id) {
	// TODO Auto-generated method stub
	this.couRepo.deleteById(id);
}




}
