package org.dcs.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class School   implements Serializable  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8088622180178826024L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long schoolId;
	private String schoolName;
	
	@OneToOne
	@JoinColumn(name = "addressId", foreignKey = @ForeignKey(name = "FK_ADDRESS"))
	private Address address;
	private String schoolCode;
	
	@OneToMany(mappedBy="school")
	private Set<Student> students;
	
	@OneToMany(mappedBy="school")
	private Set<SchoolPersonnel> schoolPersonels;
	
	public Set<SchoolPersonnel> getSchoolPersonels() {
		return schoolPersonels;
	}
	public void setSchoolPersonels(Set<SchoolPersonnel> schoolPersonels) {
		this.schoolPersonels = schoolPersonels;
	}
	public long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
