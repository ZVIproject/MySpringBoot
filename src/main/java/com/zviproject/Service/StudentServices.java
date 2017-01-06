package com.zviproject.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zviproject.Dao.StudentDao;
import com.zviproject.Entity.Student;

@Service

public class StudentServices {

	@Autowired
	@Qualifier("mysql")
	private StudentDao studentDao;

	public Collection<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	public void removeById(int id) {
		this.studentDao.removeById(id);
	}

	public void updateStudent(Student students) {
		studentDao.updateStudent(students);
	}

	public void createStudent(Student students) {
		studentDao.createStudent(students);
	}

}
