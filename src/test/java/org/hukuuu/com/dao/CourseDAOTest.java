package org.hukuuu.com.dao;

import org.hukuuu.com.domain.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context-dao.xml")
public class CourseDAOTest{
	
	@Autowired
	CourseDao courseDAO;
	
	@Test
	public void test(){
		System.out.println(courseDAO.count());
		Iterable<Course> findAll = courseDAO.findAll();
		for (Course course : findAll) {
			System.out.println(course.getName());
		}
		
	}

}
