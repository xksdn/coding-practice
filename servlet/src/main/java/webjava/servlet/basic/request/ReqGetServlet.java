package webjava.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="reqGetServlet", urlPatterns = "/req-get")
public class ReqGetServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("###########전체 요청 파라미터 조회 함#############");
        request.getParameterNames().asIterator().
                forEachRemaining(paramName->System.out.println(paramName + ":" + request.getParameter(paramName)));
        System.out.println("###########전체 요청 파라미터 조회 완료#############");
        System.out.println();
        response.getWriter().write("success");

        System.out.println("###특정파라미터만 조회시작###");

        String username = request.getParameter("username");
        System.out.println("username = " + username);
        String gender = request.getParameter("gender");
        System.out.println("gender = " + gender);

        System.out.println("###특정파라미터만 끝###");


        System.out.println("###유저네임이  여러개 조회시작###");

        String[] usernames = request.getParameterValues("username");

        for (String i : usernames)
            System.out.println("username = " + i);

        System.out.println("###유저네임이  여러개  조회 끝###");



    }
}
