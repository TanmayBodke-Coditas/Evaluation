import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String email = request.getParameter("email");
        String password = request.getParameter("password");


        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/evaluation_7", "root", "Coditas@23");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from role");
            int count =0;
            while(resultSet.next()){
              //  String name = resultSet.getString(1);
                String em = resultSet.getString(1);
                String pwd = resultSet.getString(2);
                String role = resultSet.getString(3);
                if(email.equals(em) && password.equals(pwd) && role.equals("user")){
                    HttpSession session = request.getSession();
                    session.setAttribute("key", em );
                    RequestDispatcher rd = request.getRequestDispatcher("StudentServlet");
                    rd.forward(request, response);
                  //  out.println("<h1>Welcome "+ name +"</h1");
                    count++;
                    break;
                }else {
                    RequestDispatcher rd = request.getRequestDispatcher("AdminServlet");
                    rd.forward(request, response);
                }
            }
            if(count==0){
                out.println("<h1>Sorry Try  again</h1>");
            }
        }catch (Exception e){

        }
    }
}
