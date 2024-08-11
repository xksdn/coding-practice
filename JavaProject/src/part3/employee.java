package part3;

public class employee {
    protected int age;
    protected String name;
    protected String phone;
    protected String empDate;
    protected String dept;
    protected boolean marriage;
//    public employee() {
//        super();
//    }


    @Override
    public String toString() {
        return "employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
