package org.dcs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "test", name = "groups")
public class Group implements Serializable {
	@Id
	private String id;

	@Column
	private String name;

	@Column
	private String description;

	// this is where the problem is happening
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User owner;

	private static final long serialVersionUID = 1L;

	public Group() {
		super();
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getOwner() {
		return this.owner;
	}

	public void setOwner(User user) {
		this.owner = user;
	}

}