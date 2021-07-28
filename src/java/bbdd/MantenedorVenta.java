package bbdd;

import diseño.IConsultasVenta;
import java.util.ArrayList;
import negocio.Venta;

public class MantenedorVenta extends Conexion implements IConsultasVenta{
    
    @Override
    public void insertarVenta(Venta venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Venta> listarVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
