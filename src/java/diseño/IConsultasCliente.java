package diseño;


import java.util.ArrayList;
import negocio.Cliente;


public interface IConsultasCliente{

    public void insertarMaquinaria(Cliente cliente);
    
    public ArrayList<Cliente> listarCliente();

    public void insertarCliente(Cliente cliente);//To change body of generated methods, choose Tools | Templates.
}