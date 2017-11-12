package main.test.com.macquarie.sts.service;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.java.com.macquarie.sts.dao.TeacherDAOImpl;
import main.java.com.macquarie.sts.dao.TeacherDao;
import main.java.com.macquarie.sts.domain.Teacher;
import main.java.com.macquarie.sts.service.TeacherService;
import main.java.com.macquarie.sts.service.TeacherServiceImpl;

/**
 * 
 * Test class for {@link TeacherService}
 *
 */
public class TeacherServiceTest {

	private TeacherService teacherService;

	private TeacherDao teacherDao;

	private Teacher teacher;

	@Before
	public void populatetestData() {
		this.teacher = createTeacher();
		this.teacherDao = new TeacherDAOImpl();
		teacherService = new TeacherServiceImpl(teacherDao);

	}

	private Teacher createTeacher() {
		Teacher teacher = new Teacher();
		teacher.setTeacherID("1234");
		teacher.setPercentAllocationForAssignment(10.0);
		teacher.setPercentAllocationForExam(90.0);
		teacher.setPercentAllocationForExtraCreditAssignment(2);
		return teacher;
	}

	@Test
	public void createTeacherTest() {
		teacherService.addTeacher(teacher);
		Teacher teacherObj = teacherService.getTeacher(teacher.getTeacherID());
		Assert.assertNotNull(teacherObj);
		Assert.assertEquals(teacherObj.getTeacherID(), "1234");

	}
	
	@Test
	public void updateTeacherTest() {
		teacherService.addTeacher(teacher);
		teacher.setTeacherName("Bob");
		teacherService.updateTeacher(teacher,teacher.getTeacherID());
		Teacher teacherObj = teacherService.getTeacher(teacher.getTeacherID());
		Assert.assertEquals(teacherObj.getTeacherName(), "Bob");

	}
	
	@Test
	public void deleteTeacherTest() {
		teacherService.addTeacher(teacher);
		teacherService.deleteTeacher(teacher.getTeacherID());
		Teacher teacherObj = teacherService.getTeacher(teacher.getTeacherID());
		Assert.assertNull(teacherObj);

	}
	
	@Test
	public void updateTeacherPercentageAllocationTest() {
		teacherService.addTeacher(teacher);
		teacherService.updateAssignmentPercentage(20,teacher.getTeacherID());
		Teacher teacherObj = teacherService.getTeacher(teacher.getTeacherID());
		Assert.assertEquals(teacherObj.getPercentAllocationForAssignment(), 20.0);
		teacherService.updateExamPercentage(80,teacher.getTeacherID());
		teacherObj = teacherService.getTeacher(teacher.getTeacherID());
		Assert.assertEquals(teacherObj.getPercentAllocationForExam(), 80.0);
		teacherService.updateExtraCreditPercentage(4,teacher.getTeacherID());
		teacherObj = teacherService.getTeacher(teacher.getTeacherID());
		Assert.assertEquals(teacherObj.getPercentAllocationForExtraCreditAssignment(), 4.0);

	}

}
