package InterfaceProgramming;

public class MySQLDriver implements Connection{
    @Override
    public void getConnection(String url, String username, String pw) {
        System.out.println("MySQL db 접속 시도");
    }
}
