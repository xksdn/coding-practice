package webjava.servlet.basic.frontctrl.step2.controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import webjava.servlet.basic.frontctrl.View;
import webjava.servlet.basic.frontctrl.step2.Controller2;
import webjava.servlet.student.member.Member;
import webjava.servlet.student.member.MemberRepos;

import java.io.IOException;

public class MemberSaveCtrl2 implements Controller2 {
    MemberRepos memberRepos=new MemberRepos();
    @Override
    public View process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);

        memberRepos.save(member);

        //Model에 데이터를 보관한다.
        request.setAttribute("member", member);

        return new View("/WEB-INF/step1/save-result.jsp"); // 컨트롤 알트 엔

    }
}
