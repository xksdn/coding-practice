package webjava.servlet.basic.frontctrl.step3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import webjava.servlet.basic.frontctrl.ModelView;

import webjava.servlet.basic.frontctrl.View;

import webjava.servlet.basic.frontctrl.step3.controller.MemberFormCtrl3;
import webjava.servlet.basic.frontctrl.step3.controller.MemberListCtrl3;
import webjava.servlet.basic.frontctrl.step3.controller.MemberSaveCtrl3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name ="frontControllerServlet3", urlPatterns = "/front-ctrl/step3/*")
public class FrontControllerServlet3 extends HttpServlet {

    private Map<String, Controller3> jspMap = new HashMap<>();

    public FrontControllerServlet3 (){
        jspMap.put("/front-ctrl/step3/students/new-form", new MemberFormCtrl3());
        jspMap.put("/front-ctrl/step3/students/save", new MemberSaveCtrl3());
        jspMap.put("/front-ctrl/step3/students", new MemberListCtrl3());
    } // URI --> controller

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("################################");
        System.out.println("frontcontroller33333333333333333!!!!!!!!!!");

        String requestURI= request.getRequestURI();
        System.out.println(requestURI);

        Controller3 controller = jspMap.get(requestURI);

        if (controller==null)
        {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        //paramMap
        Map<String, String> paramMap = new HashMap<>();

        /**
         * http request 에서 모든 ParameterName 가져오는 과정, 
         * forEachRemaining 돌리면서 key  paramName 되서 Map에다가 넣어주는 것
         */

        request.getParameterNames().asIterator().
                forEachRemaining(paramName -> paramMap.put(paramName, request.getParameter(paramName)));

        ModelView mv = controller.process(paramMap);

        String viewName = mv.getViewName();
        View view = viewResolver(viewName);

        view.render(mv.getModel(), request, response);

    }

    private View viewResolver(String viewName) {
        return new View("/WEB-INF/step1/" + viewName + ".jsp");
    }
}
