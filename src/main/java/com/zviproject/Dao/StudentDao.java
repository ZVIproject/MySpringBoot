package com.zviproject.Dao;

import java.util.Collection;

import com.zviproject.Entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	/**
	 * Looking information about student by id
	 * 
	 * @param id
	 * @return
	 */
	Student getStudentById(int id);

	/**
	 * Remove information about student by id
	 * 
	 * @param id
	 * @return
	 */
	void removeById(int id);

	/**
	 * Update information about student
	 * 
	 * @param student
	 * @param id
	 * @return
	 */
	void updateStudent(Student students);

	/**
	 * Create information about student
	 * 
	 * @param student
	 * @param id
	 */
	void createStudent(Student students);

}