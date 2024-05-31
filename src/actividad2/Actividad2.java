package actividad2;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear productos para el cliente 1
        List<Producto> productosCliente1 = Arrays.asList(
            new Producto("Manzanas", 2.0, 1000),
            new Producto("Pan", 1.5, 2000),
            new Producto("Leche", 3.0, 1500)
        );

        // Crear productos para el cliente 2
        List<Producto> productosCliente2 = Arrays.asList(
            new Producto("Huevos", 1.2, 1000),
            new Producto("Café", 4.5, 2500),
            new Producto("Azúcar", 1.0, 2000)
        );

        // Crear clientes
        Cliente cliente1 = new Cliente("Cliente 1", productosCliente1);
        Cliente cliente2 = new Cliente("Cliente 2", productosCliente2);

        // Obtener el tiempo inicial
        long initialTime = System.currentTimeMillis();

        // Crear cajeras
        Cajera cajera1 = new Cajera("Cajera 1", cliente1, initialTime);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2, initialTime);

        // Iniciar el procesamiento
        cajera1.start();
        cajera2.start();
    }
}

