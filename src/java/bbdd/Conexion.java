/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.sql.*;

/**
 *
 * @author Brokeh
 */
public class Conexion {
    protected Statement state;
    protected Connection con;
    
    public void conectar()
    {
       try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zapateria","root",null);
                state = con.createStatement();
            }catch(Exception ex)
            {
            ex.printStackTrace();
 }
    }
    
}
