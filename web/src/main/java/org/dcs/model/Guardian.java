package org.dcs.model;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "guardianId"))
public class Guardian extends Person {	

	/**
	 * 
	 */
	private static final long serialVersionUID = -3619794500075578417L;

	@OneToMany(mappedBy="guardian")
	List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
