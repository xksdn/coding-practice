package webjava.servlet.basic.cal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// 프런트 컨트롤러
// 접근 URL
@WebServlet(name = "frontController", urlPatterns = "/calc/*")
public class FrontController extends HttpServlet {

    // URL과 컨트롤러 저장
    private Map<String, Controller> jspMap = new HashMap<>();

    // URL과 컨트롤러 매핑
    public FrontController () {
        jspMap.put("/calc", new Cal_Ctrl());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // URL 가지고 옴
        String URL = req.getRequestURI();
        System.out.println("Request URL: " + URL);

        // URL에 매핑된 컨트롤러를 찾음
        Controller controller = jspMap.get(req.getServletPath());

        // 없으면 404 반환
        if (controller == null) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        // 요청 처리
        controller.process(req, resp);
    }
}
