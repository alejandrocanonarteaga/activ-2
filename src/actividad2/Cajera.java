package actividad2;

public class Cajera extends Thread {
    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public Cajera(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " 
            + this.cliente.getNombre() + " EN EL TIEMPO: " 
            + (System.currentTimeMillis() - this.initialTime) / 1000 
            + "seg");

        for (Producto producto : this.cliente.getProductos()) {
            this.esperarXsegundos(producto.getTiempoProcesamiento());
            System.out.println("Procesado el producto " + producto.getNombre() 
                + " ->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 
                + "seg");
        }

        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " 
            + this.cliente.getNombre() + " EN EL TIEMPO: " 
            + (System.currentTimeMillis() - this.initialTime) / 1000 
            + "seg");
    }

    private void esperarXsegundos(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
