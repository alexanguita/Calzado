package diseño;

import java.util.ArrayList;
import negocio.Venta;


public interface IConsultasVenta {
    public void insertarVenta(Venta venta);
   
    public ArrayList<Venta> listarVentas(); 
}
