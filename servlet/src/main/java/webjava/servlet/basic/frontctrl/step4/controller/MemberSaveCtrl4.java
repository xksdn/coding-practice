package webjava.servlet.basic.frontctrl.step4.controller;

import webjava.servlet.basic.frontctrl.ModelView;
import webjava.servlet.basic.frontctrl.step4.Controller4;
import webjava.servlet.student.member.Member;
import webjava.servlet.student.member.MemberRepos;
import java.util.Map;
public class MemberSaveCtrl4 implements Controller4{

    MemberRepos memberRepos=new MemberRepos();
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {

        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepos.save(member);

        model.put("member", member);

//        ModelView mv = new ModelView("save-result");
//        mv.getModel().put("member", member);

        return "save-result";
    }
}
