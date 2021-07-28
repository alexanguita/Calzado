package diseño;


import java.util.ArrayList;
import negocio.Cliente;


public interface IConsultasCliente{

    public ArrayList<Cliente> listarCliente();

    public void insertarClientes(Cliente cliente);
}