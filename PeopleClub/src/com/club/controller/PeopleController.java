package com.club.controller;

import java.sql.SQLException;
import java.util.List;

import com.club.beans.PeopleClub;

public interface PeopleController {
	public String insertRecord(PeopleClub peopleClub) throws SQLException, ClassNotFoundException;
	public List<PeopleClub> getAllRecords();
	public String DeletePeopleRecord(int id);

}
