package org.dcs.repository;

import org.dcs.ui.model.domain.Student;

public interface StudentRepository {
	
	Student getStudentById(Long id);
	
	Student save(Student student);

}
