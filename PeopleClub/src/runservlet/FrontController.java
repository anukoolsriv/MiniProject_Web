package runservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.club.beans.PeopleClub;
import com.club.dbUtil.DatabaseConnection;


@WebServlet("/Front.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				PeopleClub peopleClub = new PeopleClub();
				peopleClub.setfName(request.getParameter("fname"));
				peopleClub.setlName(request.getParameter("lname"));
				peopleClub.setDateOfBirth(request.getParameter("dob"));
				peopleClub.setCity(request.getParameter("city"));
				
				DatabaseConnection db = new DatabaseConnection();
				String query = "insert into peopleclub(id,fname,lname,dob,city)" + "values(people_seq.NEXTVAL,?,?,?,?)";
				Boolean status = false;

				Connection connection = null;
				try {
					connection = db.getConnection();
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
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(status);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
