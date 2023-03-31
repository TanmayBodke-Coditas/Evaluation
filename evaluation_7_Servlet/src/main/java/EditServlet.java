import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/EditServlet")

public class EditServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String email = "", password = "", name = "";
        name = request.getParameter("name");

        String city = request.getParameter("city");

        //	String role = request.getParameter("Role");
        //UPDATE customers
        //SET last_name = 'Doe', email = 'johndoe@example.com'
        //WHERE id = 1;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluation_7", "root", "Coditas@23");
            PreparedStatement ps = connection.prepareStatement("update student_data set city='"+city+"' where name='"+name+"'");


            ps.executeUpdate();


            RequestDispatcher rd = request.getRequestDispatcher("AdminServlet");
            rd.forward(request, response);


        } catch (Exception e) {

        }

    }
}
