package com.revature.school.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.school.model.Student;

public class StudentDao {
	// fake DB
	private List<Student> students = new ArrayList<>();
	
	//populate fake DB
	public StudentDao() {
		students.add(new Student(0,"Mike","5th Grade"));
		students.add(new Student(1,"William","6th Grade"));
		students.add(new Student(2,"John","4th Grade"));
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public Student getStudentById(int id) {
		// we should loop through the data and match for the one with the indicated id...
		return students.get(id);
	}
	
}
