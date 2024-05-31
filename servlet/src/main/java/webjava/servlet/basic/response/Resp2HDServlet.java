package webjava.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="resp2HDServlet", urlPatterns = "/res2-header")
public class Resp2HDServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setStatus(HttpServletResponse.SC_OK); //HTTP response 응답코드 지정

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");


        Cookie cookie = new Cookie ("myCookie", "good");
        cookie.setMaxAge(600);
        response.addCookie(cookie);


        PrintWriter writer = response.getWriter();
        writer.println("hello");

        response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
        response.sendRedirect("/basic/post-form.html");

    }
}
