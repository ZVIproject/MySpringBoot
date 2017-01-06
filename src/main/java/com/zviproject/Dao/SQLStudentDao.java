package com.zviproject.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zviproject.Entity.Student;

@Repository("mysql")
public class SQLStudentDao implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static class StudentRowMapper implements RowMapper<Student> {

		@Override
		public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Student student = new Student();
			student.setId(resultSet.getInt(1));
			student.setName(resultSet.getString(2));
			student.setCourse(resultSet.getString(3));
			return student;
		}

	}

	/**
	 * @see com.zviproject.Dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents() {
		final String sql = "SELECT * from Student";
		List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper());
		return students;
	}

	/**
	 * @see com.zviproject.Dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		final String sql = "select * from Student where idStudent=?";
		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		return student;
	}

	/**
	 * @see com.zviproject.Dao.StudentDao#removeById(int)
	 */
	@Override
	public void removeById(int id) {
		final String sql = "delete from Student where idStudent=?";
		jdbcTemplate.update(sql, id);
	}

	/**
	 * @see com.zviproject.Dao.StudentDao#updateStudent(com.zviproject.Entity.Student)
	 */
	@Override
	public void updateStudent(Student students) {
		final String sql = "update Student set Name=?, Course=? where idStudent=?";
		final int id = students.getId();
		final String name = students.getName();
		final String course = students.getCourse();

		jdbcTemplate.update(sql, new Object[] { name, course, id });

	}

	/**
	 * @see com.zviproject.Dao.StudentDao#createStudent(com.zviproject.Entity.Student)
	 */
	@Override
	public void createStudent(Student students) {
		final String sql = "insert into Student (Name , Course ) value (? , ?)";
		final String name = students.getName();
		final String course = students.getCourse();

		jdbcTemplate.update(sql, new Object[] { name, course });

	}

}
