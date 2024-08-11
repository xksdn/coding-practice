package InterfaceProgramming;

public class DBConnection {
    public static void main(String[] args) {
        // oracle DB 접속
        Connection driver = new OracleDriver();
        driver.getConnection("jdbc","tanwoo", "kang");

        // MySQL DB 접속
        Connection conn = new MySQLDriver();
        conn.getConnection("jdbc", "ho", "lee");
    }
}
