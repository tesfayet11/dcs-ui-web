package org.dcs.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import org.dcs.model.Student;

@Repository("studentRepository")
public class StudentRepositoryImpl implements StudentRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Student getStudentById(Long id) {
		
		return null;
	}

	@Override
	public Student save(Student student) {

		em.persist(student);
		em.flush();
		return student;
	}

}
