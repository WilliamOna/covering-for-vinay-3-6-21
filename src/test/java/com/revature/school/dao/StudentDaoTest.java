package com.revature.school.dao;

import java.util.ArrayList;

import com.revature.school.model.Student;

public class StudentDaoTest {
	private static StudentDao studentDao = new StudentDao();
	
	private static ArrayList<Student> expected;
	public static void setup_Students() {
		expected = new ArrayList<>();
		expected.add(new Student(0,"Mike","5th Grade"));
		expected.add(new Student(1,"William","6th Grade"));
		expected.add(new Student(2,"John","4th Grade"));		
	}
	public static void getStudents_returns_correct_value() {
		System.out.println(expected.equals(studentDao.getStudents()));
	}
	
	
	public static void main(String[] args) {
		setup_Students();
		getStudents_returns_correct_value();
	}
}
