package Jardineria;

public class Carrito {
	
	    Producto[] productos = new Producto[10]; // Máximo 10 productos en el carrito
	    int count = 0; // Contador de productos en el carrito

   // Agrega un producto al carrito
	    public void agregarProducto(Producto producto) {
	        if (count < productos.length) {
	            productos[count] = producto; // Añade el producto al carrito
	            count++; // Incrementa el contador de productos
	            System.out.println("Producto agregado al carrito: " + producto.nombre);
	        } else {
	            System.out.println("El carrito está lleno bro.");
	        }
	    }

   // Muestra todos los productos en el carrito
	    public void mostrarCarrito() {
	        System.out.println("Carrito:");
	        double total = 0; // Variable para calcular el total
	        if (count == 0) {
	            System.out.println("Carrito vacío, compra algo bro.");
	        } else {
	            for (int i = 0; i < count; i++) {
	                System.out.println((i + 1) + ". " + productos[i].nombre + " - " + productos[i].precio + "€"); // Muestra cada producto en el carrito
	                total += productos[i].precio; // Suma el precio de cada producto al total
	            }
	            System.out.println("Total a pagar: " + total + "€");
	        }
	  }
}
