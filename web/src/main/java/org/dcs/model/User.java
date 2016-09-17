package org.dcs.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "test", name = "users")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private String userId;

	@Column
	private String email;

	@Column
	private String passwd;

	@OneToMany(mappedBy = "owner", cascade=CascadeType.REMOVE)
	private Set<Group> ownedGroups;

	@ManyToMany
	@JoinTable(name = "UserGroups", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "userId"), inverseJoinColumns = @JoinColumn(name = "groupId", referencedColumnName = "groupId"))
	private Set<Group> belongsToGroups;

	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}

	public String getId() {
		return this.userId;
	}

	public void setId(String id) {
		this.userId = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Set<Group> getOwnedGroups() {
		return this.ownedGroups;
	}

	public void setOwnedGroups(Set<Group> groups) {
		this.ownedGroups = groups;
	}

	public void setBelongsToGroups(Set<Group> belongToGroups) {
		this.belongsToGroups = belongToGroups;
	}

	public Set<Group> getBelongsToGroups() {
		return belongsToGroups;
	}
}
