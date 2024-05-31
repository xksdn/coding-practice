package webjava.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webjava.servlet.basic.HelloData;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="respHtmlServlet", urlPatterns = "/res-html")
public class RespHtmlServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //content-type 지정! text/html; charset=utf-8;

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        // username getParameter로 가져오기.
        String username = request.getParameter("username");

        // 사용자 이름이 "안해리"인 경우와 그 외의 경우에 따라 다른 인사메시지 출력
        String msg;

        // 사용자 이름이 null이거나 비어있는 경우 "테스트" 출력
        if (username == null || username.isEmpty()) {
            msg = "테스트";
        } else if ("안해리".equals(username)) {
            // 사용자 이름이 "안해리"인 경우
            msg = username + "님, 안녕하세요";
        } else {
            // 그 외의 경우
            msg = username + ", 안녕?!";
        }

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<div>" + msg + "</div>");
        writer.println("</body>");
        writer.println("</html>");



    }
}
