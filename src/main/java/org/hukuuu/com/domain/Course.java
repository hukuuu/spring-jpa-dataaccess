package org.hukuuu.com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course{

	private Long id;
	private String name;
	private String abbreviature;
	private String description;
	private String type;
	private String schedule;
	private String lector;
	
	public Course(){
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

	@Column(name = "abbreviature")
	public String getAbbreviature() {
		return abbreviature;
	}

	public void setAbbreviature(String abbreviature) {
		this.abbreviature = abbreviature;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "schedule")
	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Column(name = "lector")
	public String getLector() {
		return lector;
	}

	public void setLector(String lector) {
		this.lector = lector;
	}
	
	
	

}
