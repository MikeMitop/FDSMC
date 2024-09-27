package TiendaEjercicio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Provedor provedor = new Provedor("Proovedor", 32346234, "Set ur name here");
        System.out.println(provedor);

        Cliente cliente = new Cliente(32674365, "Set ur name here");
        System.out.println(cliente);

        TipoProducto tipoProducto = new TipoProducto(14565486, "Tipo del producto", 0.19);
        System.out.println(tipoProducto);

        Producto producto = new Producto(tipoProducto, 10.10, 100, provedor);
        System.out.println(producto);

        Venta venta = new Venta(147573, cliente, producto);
        LocalDate fechaVenta = LocalDate.now();
        venta.setFechaVenta(fechaVenta);
        System.out.println(venta);
    }
}
