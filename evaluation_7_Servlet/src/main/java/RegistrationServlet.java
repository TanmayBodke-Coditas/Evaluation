import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String email = "", password = "", name = "";
		name = request.getParameter("name");
		email = request.getParameter("email");
		password = request.getParameter("password");
		String city = request.getParameter("city");
		String phone = request.getParameter("phone");
	//	String role = request.getParameter("Role");
		String role = "user";

		int count = 0;


		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluation_7", "root", "Coditas@23");
			PreparedStatement ps = connection.prepareStatement("insert into student_data values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, city);
			ps.setString(5, phone);
		//	ps.setString(6, role);

			ps.executeUpdate();

			PreparedStatement ps1 = connection.prepareStatement("insert into role values(?,?,?)");
			ps1.setString(1, email);
			ps1.setString(2, password);
			ps1.setString(3, role);
			ps1.executeUpdate();

			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.forward(request, response);








			//(name varchar(25), email varchar(50), password varchar(10), city varchar(10), phone varchar(10), role varchar(10)
			//resultSet = statement.executeQuery("insert into student_data values(");
			/*while(resultSet.next()){
				String em = resultSet.getString(2);
				String pwd = resultSet.getString(3);
				if(email.equals(em) && password.equals(pwd)){
					RequestDispatcher rd = request.getRequestDispatcher("LoginServlet");
					rd.forward(request, response);
					out.println("<h1>Welcome "+ name +"</h1");
					count++;
					break;
				}
			}
			if(count==0){
				out.println("<h1>Sorry Try  again</h1>");
			}*/
		}catch (Exception e){

		}

	}

}
