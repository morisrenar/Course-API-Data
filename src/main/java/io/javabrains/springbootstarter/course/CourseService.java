package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bmshamsnahid on 7/21/17.
 */
@Service
public class CourseService {

	@Autowired
	private CourseRepository CourseRepository;

	public List<Course> getAllCourses(String topicId) {
		//return topics;
		List<Course> courses = new ArrayList<>();
		for(Course tp: CourseRepository.findByTopicId(topicId)) {
			courses.add(tp);
		}
		return courses;
	}
	
	public Course getCourse(String id) {

		return CourseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
		CourseRepository.save(course);
	}
	
	public void updateCourse(Course course) {
		CourseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		CourseRepository.delete(id);
	}
}
