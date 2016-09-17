package org.dcs.model;

import java.io.Serializable;
import java.sql.Date;

public class Immunaization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -793249251249131464L;

	private Long immunizationId;
	private Student student;
	//private String immunizationName;
	private Date immunizationDate;
	private String immunizationCode;
	private Date expirationDate;
	
	
}
