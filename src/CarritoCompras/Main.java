package CarritoCompras;

import java.util.*;

public class Main{
    public static void main(String[] args) {

        //** CARRITO 1 **
        Map<Producto, Integer> carrito = new HashMap<Producto, Integer>();

        Producto coca_cola = new Producto("Coca Cola", 321);
        Producto pan_blanco = new Producto("Bimbo", 241);
        Producto galletas = new Producto("Pepitos", 121);

        carrito.put(coca_cola, 3);
        carrito.put(pan_blanco, 1);
        carrito.put(galletas, 5);
        carrito.put(coca_cola, 7);

        System.out.println(carrito);

        //** CARRITO 2 **
        Map<Producto, Integer> carrito2 = new TreeMap<>();

        carrito2.put(coca_cola, 3);
        carrito2.put(pan_blanco, 1);
        carrito2.put(galletas, 5);

        System.out.println(carrito2);
    }
}
