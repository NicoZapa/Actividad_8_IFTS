package CarritoCompras;

import java.util.Comparator;
import java.util.Objects;

public class Producto implements Comparable {

    protected String nombre;
    protected int id;

    public Producto(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto [" +
                "nombre='" + nombre + '\'' +
                ", \nid=" + id +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Object o){
        Producto producto = (Producto) o;
        if(producto.id > this.id){
            return -1;
        }else if(producto.id < this.id){
            return 1;
        }

        return 0;
    }
}
