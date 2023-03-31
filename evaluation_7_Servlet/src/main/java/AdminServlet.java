import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/AdminServlet")

public class AdminServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Admin Page</h1>");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluation_7", "root", "Coditas@23");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from student_data");

            while (resultSet.next()) {
                out.println("<h1> Name : " + resultSet.getString(1) + "</h1>");
                out.println("<h1> Email : " + resultSet.getString(2) + "</h1>");
                out.println("<h1> Password : " + resultSet.getString(3) + "</h1>");
                out.println("<h1> City : " + resultSet.getString(4) + "</h1>");
                out.println("<h1> Phone : " + resultSet.getString(5) + "</h1>");
                out.println("<br>");
                out.println("<br>");
            }

            out.println("<a href='edit.html'><button>Edit</button></a>");
            out.println("<a href='delete.html'><button>Delete</button></a>");
            out.println("<a href='Registration.html'><button>Add</button></a>");
        } catch (Exception e) {

        }

    }
}
