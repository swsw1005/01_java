package swsw.ch03;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    // doPost()를 재정의
    public void service(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // read form fields
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // get response writer
        PrintWriter writer = response.getWriter();

        /* 여기서 -> DB 접근 등 Business Logic 부분을 처리 */

        // build HTML code (view 생성 부분)
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Your username is: " + username + "<br/>";
        htmlResponse += "Your password is: " + password + "</h2>";
        htmlResponse += "</html>";

        // return response
        writer.println(htmlResponse);
    }
}
