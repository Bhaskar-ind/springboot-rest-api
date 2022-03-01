package com.springboot.restapi.services;

import java.util.List;

import com.springboot.restapi.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

}
