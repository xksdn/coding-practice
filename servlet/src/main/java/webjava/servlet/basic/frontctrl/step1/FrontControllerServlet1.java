package webjava.servlet.basic.frontctrl.step1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webjava.servlet.basic.frontctrl.step1.controller.MemberFormCtrl1;
import webjava.servlet.basic.frontctrl.step1.controller.MemberListCtrl1;
import webjava.servlet.basic.frontctrl.step1.controller.MemberSaveCtrl1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name="frontControllerServlet1", urlPatterns = "/front-ctrl/step1/*")
public class FrontControllerServlet1 extends HttpServlet {

    private Map<String, Controller1> jspMap = new HashMap<>();
    public FrontControllerServlet1 (){
        jspMap.put("/front-ctrl/step1/students/new-form", new MemberFormCtrl1());
        jspMap.put("/front-ctrl/step1/students/save", new MemberSaveCtrl1());
        jspMap.put("/front-ctrl/step1/students", new MemberListCtrl1());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("################################");
        System.out.println("frontcontroller!!!!!!!!!!");

        String requestURI= request.getRequestURI();
        System.out.println(requestURI);

        Controller1 controller = jspMap.get(requestURI); // --> MemberFormCtrl1

        if (controller==null)
        {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        controller.process(request,response); //--> MemberFormCtrl1.process
    }
}
