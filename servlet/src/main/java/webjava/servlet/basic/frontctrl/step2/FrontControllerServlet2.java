package webjava.servlet.basic.frontctrl.step2;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webjava.servlet.basic.frontctrl.View;
import webjava.servlet.basic.frontctrl.step1.Controller1;
import webjava.servlet.basic.frontctrl.step1.controller.MemberFormCtrl1;
import webjava.servlet.basic.frontctrl.step1.controller.MemberListCtrl1;
import webjava.servlet.basic.frontctrl.step1.controller.MemberSaveCtrl1;
import webjava.servlet.basic.frontctrl.step2.controller.MemberFormCtrl2;
import webjava.servlet.basic.frontctrl.step2.controller.MemberListCtrl2;
import webjava.servlet.basic.frontctrl.step2.controller.MemberSaveCtrl2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name ="frontControllerServlet2", urlPatterns ="/front-ctrl/step2/*")
public class FrontControllerServlet2  extends HttpServlet{
    private Map<String, Controller2> jspMap = new HashMap<>();

    public FrontControllerServlet2 (){
        jspMap.put("/front-ctrl/step2/students/new-form", new MemberFormCtrl2());
        jspMap.put("/front-ctrl/step2/students/save", new MemberSaveCtrl2());
        jspMap.put("/front-ctrl/step2/students", new MemberListCtrl2());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("################################");
        System.out.println("frontcontroller2222222!!!!!!!!!!");

        String requestURI= request.getRequestURI();
        System.out.println(requestURI);

        Controller2 controller = jspMap.get(requestURI);

        if (controller==null)
        {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        View view = controller.process(request,response);
        view.render(request, response);
    }
}
