package org.formation.jsf.dao;

import java.util.List;

import org.formation.jsf.model.Student;


public class StudentDao implements IStudentDao {

	@Override
	public List<Student> getStudents() throws Exception {
		return Connector.getInstance().listOfStudent();
	}

	@Override
	public void addStudent(Student theStudent) throws Exception {
		Connector.getInstance().AddObject(theStudent);
	}

	@Override
	public Student getStudent(int studentId) throws Exception {
		return Connector.getInstance().getElementById(Student.class, studentId);
	}

	@Override
	public void updateStudent(Student theStudent) throws Exception {
		Connector.getInstance().updateObj(theStudent);

	}

	@Override
	public void deleteStudent(int studentId) throws Exception {
		Connector.getInstance().removeStudentById(studentId);

	}

}
