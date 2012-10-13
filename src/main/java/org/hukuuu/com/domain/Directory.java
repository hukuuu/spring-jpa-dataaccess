package org.hukuuu.com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "directory")
public class Directory {
	
	
	private Long id;
	private String name;
	private String email;
	private String address;
	private int fav;
	private String picture;
	private String information;

	public Directory() {
		super();
	}

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "fav")
	public int getFav() {
		return fav;
	}

	public void setFav(int fav) {
		this.fav = fav;
	}
	
	@Column(name = "picture")
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Column(name = "information")
	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	
}
