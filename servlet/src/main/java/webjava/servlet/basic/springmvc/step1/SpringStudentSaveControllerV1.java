package webjava.servlet.basic.springmvc.step1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import webjava.servlet.student.member.Member;
import webjava.servlet.student.member.MemberRepos;

@Controller
public class SpringStudentSaveControllerV1 {
    MemberRepos memberRepos=new MemberRepos();


    @RequestMapping("/springmvc/step1/members/save")
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepos.save(member);

        ModelAndView mv = new ModelAndView("save-result");

        mv.addObject("member", member);

        return mv;
    }
}
