package bbdd;

import java.sql.*;

public class Conexion {

    protected Statement state;
    protected Connection con;

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo_calza", "root", null);
            state = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
