package com.zviproject.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zviproject.Entity.Student;
import com.zviproject.Service.StudentServices;

@RestController
@RequestMapping("/zvi")
public class StudentController {

	@Autowired
	private StudentServices studentServices;

	/**
	 * Get information about all students
	 * 
	 * @return
	 */
	@RequestMapping(value = "/information", method = RequestMethod.GET)
	public Collection<Student> getAllStudents() {
		return studentServices.getAllStudents();
	}

	/**
	 * Looking information about student by id
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return this.studentServices.getStudentById(id);
	}

	/**
	 * Remove information about student by id
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String removeById(@PathVariable("id") int id) {
		this.studentServices.removeById(id);
		return "id " + id + "- was deleted";
	}

	/**
	 * Update information about student
	 * 
	 * @param student
	 * @param id
	 * @return
	 */

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateStudent(@RequestBody Student student) {
		this.studentServices.updateStudent(student);
		return "Student - was changed";
	}

	/**
	 * Create information about student
	 * 
	 * @param student
	 * @param id
	 * @return
	 */

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createStudent(@RequestBody Student student) {
		this.studentServices.createStudent(student);
		return "Student - was create";
	}

}
