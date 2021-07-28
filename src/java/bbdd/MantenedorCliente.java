/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import diseño.IConsultasCliente;
import java.sql.*;
import java.util.ArrayList;
import negocio.Cliente;

/**
 *
 * @author Brokeh
 */
public class MantenedorCliente extends Conexion implements IConsultasCliente {
    @Override
    public void insertarMaquinaria(Cliente cliente) {      
        
         try{

         super.conectar(); 
         state.executeUpdate("INSERT INTO cliente VALUES("+null+", '"+cliente.getNombre()+"');");
         con.close();
         }
         catch(Exception ex)
         {
         ex.printStackTrace();
         }
        }

    
    @Override
    public ArrayList<Cliente> listarCliente() {     
        
        conectar();
        ArrayList <Cliente> lista_cli = new ArrayList<Cliente>();
        try{        
         ResultSet result = state.executeQuery("select * from maquinaria");
        while (result.next())
        {
            Cliente cli = new Cliente();
            cli.setNombre((String)result.getObject(2));
            lista_cli.add(cli);       
        }
      
       }catch(Exception ex)
       {
           ex.printStackTrace();
       }
          return lista_cli;
    }

    @Override
    public void insertarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
