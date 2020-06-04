package com.example.demo.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Student {

	@NotNull(message = "email should not be empty")
	private String name;
	@NotNull(message = "email should not be empty")
	private int roll;
	@NotNull(message = "email should not be empty")
	private String email;

	public Student() {
	}

	public Student(String name, int roll, String email) {
		this.name = name;
		this.roll = roll;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", email=" + email + "]";
	}

}
