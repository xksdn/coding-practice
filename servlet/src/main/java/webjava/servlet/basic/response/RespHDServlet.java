package webjava.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="respHDServlet", urlPatterns = "/res-header")
public class RespHDServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //상태코드 세팅
        response.setStatus(HttpServletResponse.SC_OK); //HTTP response 응답코드 지정

        //응답 header
        response.setHeader("Content-Type", "text/plain;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // cache 무효화
        //response.setHeader("Pragma", "no-cache");
        response.setHeader("my-header", "hello" );//내가 원하는 헤더 생성
        response.setHeader("Set-Cookie", "myCookie=good; Max-Age=600");

        //body
        PrintWriter writer = response.getWriter();
        writer.println("hello");

    }
}
