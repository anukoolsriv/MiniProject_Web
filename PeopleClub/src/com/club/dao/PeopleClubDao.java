package com.club.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.club.beans.PeopleClub;
import com.club.dbUtil.DatabaseConnection;

public class PeopleClubDao {
	public Boolean insertRecords(PeopleClub peopleClub) throws SQLException, ClassNotFoundException {
		DatabaseConnection db = new DatabaseConnection();
		String query = "insert into peopleclub(id,fname,lname,dob,city)" + "values(people_seq.NEXTVAL,?,?,?,?)";
		Boolean status = false;

		Connection connection = db.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, peopleClub.getfName());
		preparedStatement.setString(2, peopleClub.getlName());
		preparedStatement.setString(3, peopleClub.getDateOfBirth());
		preparedStatement.setString(4, peopleClub.getCity());
		ResultSet rs = preparedStatement.executeQuery();

		if (rs.next()) {
			status = true;
		}
		db.closeConnection();
		
		return status;

	}
	public Boolean displayRecords(PeopleClub peopleclub) throws ClassNotFoundException, SQLException{
		DatabaseConnection db = new DatabaseConnection();
		String query="Select * from peopleclub where id=?";
		Boolean status = false;
		Connection connection=db.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, peopleclub.getId());
		ResultSet rs = preparedStatement.executeQuery();
		
		if(rs.next()){
			status= true;
		}
		db.closeConnection();
		return status;
	}
}
