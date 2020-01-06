package runservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.club.beans.PeopleClub;
import com.club.dbUtil.DatabaseConnection;

@WebServlet("/display.do")
public class displayController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public displayController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<PeopleClub> listOfPeople = null;

		DatabaseConnection db = new DatabaseConnection();
		String query = "Select * from peopleclub";
		Connection connection;
		try {
			listOfPeople = new ArrayList<>();
			connection = db.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				PeopleClub peopleClub = new PeopleClub();
				peopleClub.setId(rs.getInt(1));
				peopleClub.setfName(rs.getString(2));
				peopleClub.setlName(rs.getString(3));
				peopleClub.setDateOfBirth(rs.getString(4));
				peopleClub.setCity(rs.getString(5));

				listOfPeople.add(peopleClub);
			}
			db.closeConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("list", listOfPeople);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request,response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
