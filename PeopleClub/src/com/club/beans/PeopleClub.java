package com.club.beans;

public class PeopleClub {
	private int id;
	private String fName;
	private String lName;
	private String dateOfBirth;
	private String city;

	public PeopleClub() {
		super();
	}

	public PeopleClub(int id, String fName, String lName, String dateOfBirth, String city) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "PeopleClub [id=" + id + ", fName=" + fName + ", lName=" + lName + ", dateOfBirth=" + dateOfBirth
				+ ", city=" + city + "]";
	}
}
