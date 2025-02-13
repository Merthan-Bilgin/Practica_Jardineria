package Jardineria;

public class Carrito {
	
	    Producto[] productos = new Producto[10]; // Máximo 10 productos en el carrito
	    int count = 0;

	    public void agregarProducto(Producto producto) {
	        if (count < productos.length) {
	            productos[count] = producto;
	            count++;
	            System.out.println("🛒 Producto agregado al carrito: " + producto.nombre);
	        } else {
	            System.out.println("❌ El carrito está lleno, bro.");
	        }
	    }

	    public void mostrarCarrito() {
	        System.out.println("📦 Carrito de compras:");
	        double total = 0;
	        if (count == 0) {
	            System.out.println("Carrito vacío, mete algo loco. 🤨");
	        } else {
	            for (int i = 0; i < count; i++) {
	                System.out.println((i + 1) + ". " + productos[i].nombre + " - " + productos[i].precio + "€");
	                total += productos[i].precio;
	            }
	            System.out.println("💰 Total a pagar: " + total + "€");
	        }
	  }
}
