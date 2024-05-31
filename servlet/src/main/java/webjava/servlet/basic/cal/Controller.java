package webjava.servlet.basic.cal;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

public interface Controller {
    void process (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException;
}
