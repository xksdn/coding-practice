package InterfaceProgramming;

//OracleDriver는 Oracle회사에서 만들어서 제공(Driver)
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String pw) {
        System.out.println("oracle 접속 시도");
    }
}
