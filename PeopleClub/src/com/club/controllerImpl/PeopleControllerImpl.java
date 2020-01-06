package com.club.controllerImpl;

import java.sql.SQLException;
import java.util.List;

import com.club.beans.PeopleClub;
import com.club.controller.PeopleController;
import com.club.dao.PeopleClubDao;

public class PeopleControllerImpl implements PeopleController {

	@Override
	public String insertRecord(PeopleClub peopleClub) throws SQLException, ClassNotFoundException {
		PeopleClubDao peopleClubDao = new PeopleClubDao();
		 Boolean status = peopleClubDao.insertRecords(peopleClub);
		 String successfulInput;
		 if(status == true){
			successfulInput = "Record inserted successfully";
		 }
		 else{
			 successfulInput = "Record could not be inserted";
		 }

		return successfulInput;
	}

	@Override
	public List<PeopleClub> getAllRecords() {
		//PeopleClubDao peopleClubDao=new PeopleClubDao();
		
		
		return null;
	}

	@Override
	public String DeletePeopleRecord(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
