package webjava.servlet.basic.springmvc.step4;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import webjava.servlet.student.member.Member;
import webjava.servlet.student.member.MemberRepos;

import java.util.List;

@Controller
@RequestMapping("/springmvc/step4/members")
public class SpringStudentControllerV4 {
    MemberRepos memberRepos=new MemberRepos();

    //   /springmvc/step3/members/new-form
    @RequestMapping("/new-form")
    public String form(){
        return "new-forms";
    }

    @RequestMapping("/save")
    public String save(
            @RequestParam("username") String username, // username, age 라는 파라미터 받는다!
            @RequestParam("age") int age,
            Model model) {

        // 받은 파라미터 비지니스 로직 실행
        Member member = new Member(username, age);
        memberRepos.save(member);

        //그걸 모델에 담고!
        model.addAttribute("member", member);

        //뷰 이름 반환!
        return "save-result";
    }

    @RequestMapping
    public String list(Model model){

        List<Member> members = memberRepos.findAll();
        model.addAttribute("members", members);
        return "members";
    }
}
