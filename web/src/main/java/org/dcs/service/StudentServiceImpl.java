package org.dcs.service;

import org.dcs.model.Student;
import org.dcs.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Transactional
	@Override
	public Student save(Student student) {
		studentRepository.save(student);
		return null;
	}

}
