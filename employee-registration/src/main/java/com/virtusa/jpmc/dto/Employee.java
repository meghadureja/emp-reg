/**
 * 
 */
package com.virtusa.jpmc.dto;

/**
 * @author sarita
 *
 */
public class Employee {
	private Long id;
	private String name;
	private char gender;
	private String address;
	private String designation;
	
	public Employee(Long id, String name, char gender, String address, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.designation = designation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}

