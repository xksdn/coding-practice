package webjava.servlet.basic.cal;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Cal_Ctrl implements Controller {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 숫자와 연산자 입력
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String op = request.getParameter("op");

        try {
            // 숫자로 변환
            double num1 = Double.parseDouble(num1Str.trim());
            double num2 = Double.parseDouble(num2Str.trim());

            double result = switch (op) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "/" -> num1 / num2;
                case "*" -> num1 * num2;
                default -> 0;
            };

            // 결과값 result에 저장
            request.setAttribute("result", result);
        } catch (Exception ignored) {
            // 예외 발생시 무시
        }


        // 보여줄 jsp 경로 지정
        String viewPath = "/WEB-INF/cal/calculator.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
}
