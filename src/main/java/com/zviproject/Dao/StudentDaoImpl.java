package com.zviproject.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zviproject.Entity.Student;

@Repository
public class StudentDaoImpl {
	private static Map<Integer, Student> student;

	/**
	 * Input information about students
	 */
	static {
		student = new HashMap<Integer, Student>() {
			{
				put(1, new Student(1, "Vlad", "Second"));
				put(2, new Student(1, "Viola", "First"));
				put(3, new Student(1, "Katya", "Second"));
			}
		};
	}

	public Collection<Student> getAllStudents() {
		return this.student.values();
	}

	/**
	 * Looking information about student by id
	 * 
	 * @param id
	 * @return
	 */
	public Student getStudentById(int id) {
		return this.student.get(id);
	}

	/**
	 * Remove information about student by id
	 * 
	 * @param id
	 * @return
	 */
	public void removeById(int id) {
		this.student.remove(id);
	}

	/**
	 * Update information about student
	 * 
	 * @param student
	 * @param id
	 * @return
	 */
	public void updateStudent(Student students) {
		/**
		 * variable for input information about student for update
		 */
		Student info = student.get(students.getId());
		info.setCourse(students.getCourse());
		info.setName(students.getName());
		student.put(students.getId(), students);
	}

	/**
	 * Create information about student
	 * 
	 * @param student
	 * @param id
	 */
	public void createStudent(Student students) {
		student.put(students.getId(), students);
	}

}
