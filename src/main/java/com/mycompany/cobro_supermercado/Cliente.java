package com.mycompany.cobro_supermercado;

/**
 *
 * @author oalvarez
 */
public class Cliente {
    private String nombre;
    private int id;
    private int[] carroCompra;

    public Cliente(String nombre, int id, int[] carroCompra) {
        this.nombre = nombre;
        this.id = id;
        this.carroCompra = carroCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
    
}
