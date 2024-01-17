package com.boot.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Students {

	@Id
	@GeneratedValue
	private int id;
	@Column(length=20)
	private String firstName;
	@Column(length=20)
	private String lastNamee;
	private Date dob;
	@Column(length=20)
	private String city;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int id, String firstName, String lastNamee, Date dob, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastNamee = lastNamee;
		this.dob = dob;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNamee() {
		return lastNamee;
	}
	public void setLastNamee(String lastNamee) {
		this.lastNamee = lastNamee;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", firstName=" + firstName + ", lastNamee=" + lastNamee + ", dob=" + dob
				+ ", city=" + city + "]";
	}
}
