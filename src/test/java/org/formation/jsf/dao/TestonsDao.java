package org.formation.jsf.dao;


import org.formation.jsf.dao.IStudentDao;
import org.formation.jsf.dao.StudentDao;
import org.formation.jsf.model.Student;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class TestonsDao {
	Student stud1 = new Student(1, "albert", "Londres", "4f4f4");

	IStudentDao dao;
	
	
	@Test
	public void test() throws Exception {
		Connector.getInstance().connection();
		
		
	
		dao.addStudent(stud1);
		
		assertTrue(Connector.getInstance().getElementById(Student.class, 1) != null);
		
		
		Connector.getInstance().deconnection();
				
	}

}
