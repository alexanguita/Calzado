package bbdd;

import diseño.IConsultasVenta;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Venta;

public class MantenedorVenta extends Conexion implements IConsultasVenta{
    
    @Override
    public void insertarVenta(Venta venta) {
        try {
            conectar();
            state.executeUpdate("INSERT INTO venta VALUES(NULL,'"+venta.getDescripcion()+"',"+venta.getPrecio()+","+venta.getCantidad()+","+venta.getFechaHoraVenta()+");");
        } catch (SQLException e){
            System.err.println("ERROR: " + e);
        }
           
    }

    @Override
    public ArrayList<Venta> listarVentas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
