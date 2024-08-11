package part3;

public class EmployeeTest {
    public static void main(String[] args) {
        rempVO vo = new rempVO();

        vo.name = "강탄우";
        vo.age = 24;
        vo.phone = "010-4917-8380";
        vo.dept = "서버관리";
        vo.empDate = "22-11-11";
        vo.marriage = true;

        System.out.println(vo.toString());
    }
}
