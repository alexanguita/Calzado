
package negocio;

public class Venta {
    private int codigo;
    private String descripcion;
    private int precio;
    private int cantidad;
    private String fechaHoraVenta;
    private boolean descuento; 

    public Venta() {
    }

    public Venta(int codigo, String descripcion, int precio, int cantidad, String fechaHoraVenta, boolean descuento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fechaHoraVenta = fechaHoraVenta;
        this.descuento = descuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(String fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }
    
    
}
