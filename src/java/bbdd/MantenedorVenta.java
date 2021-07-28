package bbdd;

import diseño.IConsultasVenta;
import java.sql.ResultSet;
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
        ArrayList<Venta> listaVenta = new ArrayList();
        try{
            conectar();
            ResultSet rs = state.executeQuery("SELECT * FROM venta;");
            while(rs.next()){
                Venta venta = new Venta();
                venta.setCodigo(rs.getInt(1));
                venta.setDescripcion(rs.getString(2));
                venta.setPrecio(rs.getInt(3));
                venta.setCantidad(rs.getInt(4));
                venta.setFechaHoraVenta(rs.getString(5));
                listaVenta.add(venta);
            }
        } catch(SQLException e) {
            System.err.println("ERROR: " + e);
        }
        return listaVenta;
    }
}
