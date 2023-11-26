package com.mycompany.cobro_supermercado;

/**
 *
 * @author oalvarez
 */
public class Cobro_supermercado {

    public static void main(String[] args) {
        System.out.println("Bienvenido Supermercado el lider");
        Cliente cliente1 = new Cliente("Facundo Cabrales", 1, new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("Caperucita Rojas", 2, new int[]{1, 3, 5, 1, 1});
        Cajera cajera1 = new Cajera("Cajera 1", 1, 1);
        Cajera cajera2 = new Cajera("Cajera 2", 2, 2);
        long timeStamp = System.currentTimeMillis();
        cajera1.procesarCompra(cliente1, timeStamp);
        cajera2.procesarCompra(cliente2, timeStamp);
        //System.out.println(cajera1.getTotal());

    }
}
