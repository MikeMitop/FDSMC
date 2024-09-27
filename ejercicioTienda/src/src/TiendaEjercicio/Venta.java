package TiendaEjercicio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    private int nroConsecutivo;
    private LocalDate fechaVenta;
    private Cliente cliente;
    private String producto;
    private ArrayList<Detalle> listaDetalle;

    public Venta(int nroConsecutivo, Cliente cliente, Producto producto) {
        this.nroConsecutivo = nroConsecutivo;
        this.cliente = cliente;
        this.producto = String.valueOf(producto);
    }

    public int getNroConsecutivo() {
        return nroConsecutivo;
    }

    public void setNroConsecutivo(int nroConsecutivo) {
        this.nroConsecutivo = nroConsecutivo;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = String.valueOf(producto);
    }


    public String toString() {
        return "Venta numero de venta =" + nroConsecutivo + ", fecha de la venta =" + fechaVenta + ", cliente =" + cliente
                + ", producto =" + producto;
    }

    public void adicionarDetalle(Detalle detalle){
        listaDetalle.add(detalle);
    }


}
