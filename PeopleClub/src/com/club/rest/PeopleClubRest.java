package com.club.rest;

import java.sql.SQLException;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import com.club.beans.PeopleClub;
import com.club.controllerImpl.PeopleControllerImpl;

@ApplicationPath("/pc")
public class PeopleClubRest extends Application{
		@GET
		@Path("/hello")
		public String hello() {
			return "Hello from JAX-RS";
		}
	}

//	@GET
//	@Path("/insert")
////	public String insertRecords(@QueryParam("fname") String fName, @QueryParam("lname") String lName, @QueryParam("dob") String dob, @QueryParam("city") String city) throws SQLException{
//public String insertRecords() throws SQLException{
//		System.out.println("haleluyah");
////		PeopleClub peopleClub = new PeopleClub();
////		peopleClub.setfName(fName);
////		peopleClub.setlName(lName);
////		peopleClub.setCity(city);
//		
//		PeopleClub peopleClub1 = new PeopleClub();
//		peopleClub1.setfName("Ross");
//		peopleClub1.setlName("Geller");
//		peopleClub1.setDateOfBirth("04-05-1975");
//		peopleClub1.setCity("New York");
//		
//		return new PeopleControllerImpl().insertRecord(peopleClub1);
//	}

