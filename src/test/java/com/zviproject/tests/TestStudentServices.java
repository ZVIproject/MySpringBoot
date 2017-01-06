/*
 * package com.zviproject.tests;
 * 
 * import org.junit.Before; import org.junit.BeforeClass; import org.junit.Rule;
 * import org.junit.Test; import org.junit.rules.Timeout; import
 * org.junit.runner.RunWith; import
 * org.springframework.test.annotation.DirtiesContext; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 * 
 * import com.zviproject.Dao.StudentDaoImpl; import
 * com.zviproject.Entity.Student; import com.zviproject.Service.StudentServices;
 * 
 * import junit.framework.Assert;
 * 
 * @DirtiesContext
 * 
 * @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ContextConfiguration(classes = StudentServices.class) public class
 * TestStudentServices { private Student check; private StudentServices
 * studentServices; private StudentDaoImpl studentDaoImpl;
 * 
 * @Rule public Timeout time = new Timeout(1000);
 * 
 * @BeforeClass public void initial() { check = new Student(999, "Vlad",
 * "Second"); }
 * 
 * @Before public void createObject() { studentServices = new StudentServices();
 * }
 * 
 * @Test public void testGetStudentById() { studentServices.getStudentById(5);
 * // studentDaoImpl.getStudentById() Assert.assertEquals(5, 5); }
 * 
 * }
 */
