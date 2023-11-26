
package com.mycompany.cobro_supermercado;

/**
 *
 * @author oalvarez
 */
public class MainThread {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente Marcela Perez", 0, new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente Pepito Perez", 1, new int[] { 1, 3, 5, 1, 1 });

        // Tiempo inicial de referencia
        long tiempoProcesamiento = System.currentTimeMillis();
        Cajera_hilo cajera1 = new Cajera_hilo("Cajera 1: Matilde O.", cliente1, tiempoProcesamiento);
        Cajera_hilo cajera2 = new Cajera_hilo("Cajera 2 : Isnardo M.", cliente2, tiempoProcesamiento);

        cajera1.start();
        cajera2.start();
    }

}
