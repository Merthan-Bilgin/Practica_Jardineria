package Jardineria;

public class Tienda {

	// Lista de productos disponibles en la tienda
	    Producto[] productos = {
	        new Producto("Maria Juana", "Mexico", 1.70),
	        new Producto("Hierba de los bosques", "Andorra", 4.20),
	        new Producto("La seta feliz", "Marruecos", 2.47),
	        new Producto("El oro verde", "Palestina", 1.33)
	    };

	// Muestra todos los productos disponibles en la tienda
	    public void mostrarProductos() {
	        System.out.println("Productos disponibles:");
	        for (int i = 0; i < productos.length; i++) {
	            System.out.println((i + 1) + ". " + productos[i].nombre + " - " + productos[i].origen + " - " + productos[i].precio + "€");
	        }
	    }

	  
	    public Producto obtenerProducto(int index) {
	        if (index >= 0 && index < productos.length) {
	            return productos[index]; // Devuelve el producto en el índice especificado
	        }
	        return null; // Si el índice no es válido, devuelve null
	    }


	 // Ordena los productos por precio de menor a mayor
	    public void ordenarMenorMayor() {
	        for (int i = 0; i < productos.length; i++) {
	            for (int j = i + 1; j < productos.length; j++) {
	                if (productos[i].precio > productos[j].precio) {
	                    Producto temp = productos[i];
	                    productos[i] = productos[j];
	                    productos[j] = temp;
	                }
	            }
	        }
	        System.out.println("Productos ordenados de menor a mayor:");
	        mostrarProductos(); // Muestra los productos ordenados
	    }

	  // Ordena los productos por precio de mayor a menor
	    public void ordenarMayorMenor() {
	        for (int i = 0; i < productos.length; i++) {
	            for (int j = i + 1; j < productos.length; j++) {
	                if (productos[i].precio < productos[j].precio) {
	                    Producto temp = productos[i];
	                    productos[i] = productos[j];
	                    productos[j] = temp;
	                }
	            }
	        }
	        System.out.println("Productos ordenados de mayor a menor:");
	        mostrarProductos(); // Muestra los productos ordenados
	    }

	 // Busca productos por su nombre
	    public void buscarPorNombre(String nombre) {
	        System.out.println("Resultados de búsqueda por nombre:");
	        for (int i = 0; i < productos.length; i++) {
	            if (productos[i].nombre.toLowerCase().contains(nombre.toLowerCase())) {
	                System.out.println(productos[i].nombre + " - " + productos[i].origen + " - " + productos[i].precio + "€"); // Si el nombre del producto contiene el texto que busca el usuario, lo muestra
	            }
	        }
	    }

	 // Busca productos por su origen
	    public void buscarPorOrigen(String origen) {
	        System.out.println("Resultados de búsqueda por origen:");
	        for (int i = 0; i < productos.length; i++) {
	            if (productos[i].origen.equalsIgnoreCase(origen)) {
	            	// Si el origen del producto coincide con el proporcionado, lo muestra
	                System.out.println(productos[i].nombre + " - " + productos[i].origen + " - " + productos[i].precio + "€");
	            }
	        }
	    }
	}
