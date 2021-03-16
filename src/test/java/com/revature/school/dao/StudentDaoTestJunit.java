package com.revature.school.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revature.school.model.Student;

public class StudentDaoTestJunit {

	private StudentDao studentDao = new StudentDao();
	private ArrayList<Student> expectedStudents;
	
	@Before
	public void setup() {
		expectedStudents = new ArrayList<>();
		expectedStudents.add(new Student(0,"Mike","5th Grade"));
		expectedStudents.add(new Student(1,"William","6th Grade"));
		expectedStudents.add(new Student(2,"John","4th Grade"));	
		System.out.println("BEFORE");	
	}
	
	@After
	public void teardown() {
		expectedStudents = null;
		System.out.println("AFTER");
	}
	
	@Test
	public void getStudents_returns_correct_value(){
		assertEquals(expectedStudents, studentDao.getStudents());
		System.out.println("TEST1");
	}
	@Test
	public void getStudentsById_returns_correct_value(){
		assertEquals(new Student(1,"William","6th Grade"), studentDao.getStudentById(1));
		System.out.println("TEST2");
	}

}
