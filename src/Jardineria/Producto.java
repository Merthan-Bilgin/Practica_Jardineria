package Jardineria;

public class Producto {

    String nombre; // Nombre del producto
    String origen; // Origen del producto
    double precio; // Precio del producto

   // Constructor para inicializar el producto con nombre, origen y precio
    public Producto(String nombre, String origen, double precio) {
        this.nombre = nombre;
        this.origen = origen;
        this.precio = precio;
    }
}
