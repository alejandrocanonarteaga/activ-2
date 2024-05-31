package actividad2;

import java.util.Arrays;

public class Supermercado {
    public static void main(String[] args) {
        Producto[] productosCliente1 = {
            new Producto("Manzanas", 2.0, 1000),
            new Producto("Pan", 1.5, 2000),
            new Producto("Leche", 3.0, 1500)
        };

        Producto[] productosCliente2 = {
            new Producto("Huevos", 1.2, 1000),
            new Producto("Café", 4.5, 2500),
            new Producto("Azúcar", 1.0, 2000)
        };

        Cliente cliente1 = new Cliente("Cliente 1", Arrays.asList(productosCliente1));
        Cliente cliente2 = new Cliente("Cliente 2", Arrays.asList(productosCliente2));

        long initialTime = System.currentTimeMillis();

        Cajera cajera1 = new Cajera("Cajera 1", cliente1, initialTime);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2, initialTime);

        cajera1.start();
        cajera2.start();
    }
}
