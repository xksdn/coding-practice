package webjava.servlet.basic.frontctrl.step4;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webjava.servlet.basic.frontctrl.ModelView;
import webjava.servlet.basic.frontctrl.View;
import webjava.servlet.basic.frontctrl.step3.Controller3;
import webjava.servlet.basic.frontctrl.step3.controller.MemberFormCtrl3;
import webjava.servlet.basic.frontctrl.step3.controller.MemberListCtrl3;
import webjava.servlet.basic.frontctrl.step3.controller.MemberSaveCtrl3;
import webjava.servlet.basic.frontctrl.step4.controller.MemberFormCtrl4;
import webjava.servlet.basic.frontctrl.step4.controller.MemberListCtrl4;
import webjava.servlet.basic.frontctrl.step4.controller.MemberSaveCtrl4;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name ="frontControllerServlet4", urlPatterns = "/front-ctrl/step4/*")
public class FrontControllerServlet4 extends HttpServlet{

    private Map<String, Controller4> jspMap = new HashMap<>();

    public FrontControllerServlet4 (){
        jspMap.put("/front-ctrl/step4/students/new-form", new MemberFormCtrl4());
        jspMap.put("/front-ctrl/step4/students/save", new MemberSaveCtrl4());
        jspMap.put("/front-ctrl/step4/students", new MemberListCtrl4());
    } // URI --> controller


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("############################");
        System.out.println("frontcontroller44444!!!!!!!!!!");

        String requestURI = request.getRequestURI();
        System.out.println(requestURI);

        Controller4 controller = jspMap.get(requestURI);

        if (controller==null)
        {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        //paramMap
        Map<String, String> paramMap = new HashMap<>();
        //model
        Map<String, Object> model = new HashMap<>(); // 모델추가해서 매개변수로 전달

        /**
         * http request 에서 모든 ParameterName 가져오는 과정,
         * forEachRemaining 돌리면서 key  paramName 되서 Map에다가 넣어주는 것
         */
        request.getParameterNames().asIterator().
                forEachRemaining(paramName -> paramMap.put(paramName, request.getParameter(paramName)));


        String viewName = controller.process(paramMap, model);
        View view = viewResolver(viewName);
        view.render(model, request, response);

    }

    private View viewResolver(String viewName) {
        return new View("/WEB-INF/step1/" + viewName + ".jsp");
    }
}
