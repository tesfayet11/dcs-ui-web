package org.dcs.model;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "personelId"))
public class SchoolPersonnel extends Person   implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8029421904108881110L;

	@ManyToOne
	@JoinColumn(name = "schoolId", foreignKey = @ForeignKey(name = "FK_SCHOOL"))
	private School school;
	
	private String positionCode;
	
	public School getSchoolId() {
		return school;
	}
	public void setSchoolId(School school) {
		this.school = school;
	}
	public String getPositionCode() {
		return positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}	
	
}
