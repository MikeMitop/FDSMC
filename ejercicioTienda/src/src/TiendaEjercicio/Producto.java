package TiendaEjercicio;

public class Producto {
    private TipoProducto tipoProducto;
    private Double precioVenta;
    private int cantidad;
    private String provedor;

    public Producto(TipoProducto tipoProducto, Double precioVenta, int cantidad, Provedor provedor) {
        this.tipoProducto = tipoProducto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.provedor = String.valueOf(provedor);
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = String.valueOf(provedor);
    }


    public String toString() {
        return "Producto =" + tipoProducto + ", precio de venta =" + precioVenta + ", cantidad ="
                + cantidad + ", provedor =" + provedor;
    }

}
