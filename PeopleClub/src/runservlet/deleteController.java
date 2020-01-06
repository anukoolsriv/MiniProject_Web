package runservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.parser.RecoveredField;

import com.club.beans.PeopleClub;
import com.club.dbUtil.DatabaseConnection;


@WebServlet("/delete.do")
public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public deleteController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DatabaseConnection db = new DatabaseConnection();
		String query = "Delete from peopleclub where id=?";
		int id = Integer.parseInt(request.getParameter("id"));
		String recordsDeleted = "";
		Connection connection;
		try {
			
			connection = db.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1,id);
			int rs = preparedStatement.executeUpdate();

			 if(rs>0){
				 recordsDeleted += "Record Deleted";
			 }
			
			db.closeConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("deleted", recordsDeleted);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
