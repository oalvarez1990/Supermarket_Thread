
package com.mycompany.cobro_supermercado;

/**
 *
 * @author oalvarez
 */
public class Cajera {
    private String nombre;
    private int id;
    private int tiempoProcesamiento;

    public Cajera(String nombre, int id, int tiempoProcesamiento) {
        this.nombre = nombre;
        this.id = id;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTiempoProcesamiento(int tiempoProcesamiento) {
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    public void procesarCompra(Cliente cliente, long timeStamp) {
        System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + " ->Tiempo: "
                    + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
        }
        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
