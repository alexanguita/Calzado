package bbdd;

import diseño.IConsultasCliente;
import java.sql.*;
import java.util.ArrayList;
import negocio.Cliente;

public class MantenedorCliente extends Conexion implements IConsultasCliente {

    @Override
    public ArrayList<Cliente> listarCliente() {

        conectar();
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        try {
            ResultSet result = state.executeQuery("SELECT * FROM cliente;");
            while (result.next()) {
                Cliente cli = new Cliente();
                cli.setNombre(result.getString(2));
                cli.setTelefono(result.getString(3));
                listaClientes.add(cli);
            }
        con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listaClientes;
    }

    @Override
    public void insertarClientes(Cliente cliente) {
        try {
            conectar();
            state.executeUpdate("INSERT INTO cliente VALUES(NULL, '" + cliente.getNombre() + "', '"+cliente.getTelefono()+"');");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
