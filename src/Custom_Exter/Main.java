package Custom_Exter;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Producto, Integer> carrito2 = new TreeMap<>(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });

        Producto art1 = new Producto("Arroz", 130);
        Producto art2 = new Producto("Fideos", 531);
        Producto art5 = new Producto("Yerba", 24);
        Producto art3 = new Producto("Atun", 31);
        Producto art4 = new Producto("Huevo", 67);

        carrito2.put(art1, 4);
        carrito2.put(art2, 7);
        carrito2.put(art3, 13);
        carrito2.put(art4, 43);
        carrito2.put(art5, 21);

        System.out.println(carrito2);

    }
}
