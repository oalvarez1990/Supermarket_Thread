package com.mycompany.cobro_supermercado;

/**
 *
 * @author oalvarez
 */
public class Cajera_hilo extends Thread {

    private String nombre;

    private Cliente cliente;

    private long tiempoProcesamiento;

    public Cajera_hilo() {
    }
    
    
    public Cajera_hilo(String nombre, Cliente cliente, long tiempoProcesamiento) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    public void setTiempoProcesamiento(long tiempoProcesamiento) {
        this.tiempoProcesamiento = tiempoProcesamiento;
    }


    @Override
    public void run() {
        System.out.println("La cajera " + this.nombre + " INICIA A PROCESAR LA COMPRA DEL CLIENTE "
                + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - tiempoProcesamiento) / 1000 + "seg");
        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + " ->Tiempo: "
                    + (System.currentTimeMillis() - tiempoProcesamiento) / 1000 + "seg");
        }
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - tiempoProcesamiento) / 1000 + "seg");
    }

    public void procesarCompra(Cliente cliente, long timeStamp) {
        this.cliente = cliente;
        this.tiempoProcesamiento = timeStamp;
        this.start();
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
