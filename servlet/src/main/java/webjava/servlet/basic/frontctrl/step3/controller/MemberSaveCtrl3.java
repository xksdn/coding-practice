package webjava.servlet.basic.frontctrl.step3.controller;

import webjava.servlet.basic.frontctrl.ModelView;
import webjava.servlet.basic.frontctrl.step3.Controller3;
import webjava.servlet.student.member.Member;
import webjava.servlet.student.member.MemberRepos;

import java.util.HashMap;
import java.util.Map;

public class MemberSaveCtrl3 implements Controller3 {

    MemberRepos memberRepos=new MemberRepos();

    @Override
    public ModelView process(Map<String, String> paramMap) {

        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepos.save(member);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);

        return mv;
    }
}
