package com.java.SpringDataJpaLOB.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Jobseeker {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	public Jobseeker() {
		super();
		// TODO Auto-generated constructor stub
	}

	private LocalDateTime dob;
	
	@Lob
	@Column(length=100000)
	private byte[] image;
	
	@Lob
	private char[] text;

	public Jobseeker(Integer id, String name, LocalDateTime dob, byte[] image, char[] text) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.image = image;
		this.text = text;
	}

	@Override
	public String toString() {
		return "Jobseeker [id=" + id + ", name=" + name + ", dob=" + dob + ", image=" + Arrays.toString(image)
				+ ", text=" + Arrays.toString(text) + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public char[] getText() {
		return text;
	}

	public void setText(char[] text) {
		this.text = text;
	}

	
	
	
}
