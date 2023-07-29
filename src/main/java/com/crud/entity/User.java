package com.crud.entity;

import java.util.Arrays;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;


@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String firstName;
	private String lastName;
	
	
	@NonNull
	private byte[] photo;
	private String gender;
	private String email;
	private String mobile;
	

	private String dob;
	private String city;
	
	
	private String professionalSkills;

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProfessionalSkills() {
		return professionalSkills;
	}

	public void setProfessionalSkills(String professionalSkills) {
		this.professionalSkills = professionalSkills;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", photo="
				+ Arrays.toString(photo) + ", gender=" + gender + ", email=" + email + ", mobile=" + mobile + ", dob="
				+ dob + ", city=" + city + ", professionalSkills=" + professionalSkills + "]";
	}

	public User(int id, String firstName, String lastName, byte[] photo, String gender, String email, String mobile,
			String dob, String city, String professionalSkills) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.photo = photo;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.dob = dob;
		this.city = city;
		this.professionalSkills = professionalSkills;
	}

	public User() {
		super();

	}

}
