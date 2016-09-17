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
	private static final long serialVersionUID = 1L;

	@Id
	private String groupId;

	@Column
	private String name;

	@Column
	private String description;

	// this is where the problem is happening
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private User owner;

	public Group() {
		super();
	}

	public String getDescription() {
		return this.description;
	}

	public String getGroupId() {
		return groupId;
	}

	

	public String getName() {
		return this.name;
	}

	public User getOwner() {
		return this.owner;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(User user) {
		this.owner = user;
	}

}