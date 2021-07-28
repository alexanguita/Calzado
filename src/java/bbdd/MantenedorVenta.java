/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import diseño.IConsultasVenta;
import java.util.ArrayList;
import negocio.Venta;

/**
 *
 * @author Brokeh
 */
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
