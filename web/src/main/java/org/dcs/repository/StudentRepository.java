package org.dcs.repository;

import org.dcs.model.Student;

public interface StudentRepository {
	
	Student getStudentById(Long id);
	
	Student save(Student student);

}
