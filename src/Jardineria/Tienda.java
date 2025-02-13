package Jardineria;

public class Tienda {

	    Producto[] productos = {
	        new Producto("Maria Juana", "Mexico", 1.70),
	        new Producto("Hierba de los bosques", "Andorra", 4.20),
	        new Producto("La seta feliz", "Marruecos", 2.47),
	        new Producto("El oro verde", "Palestina", 1.33)
	    };

	    public void mostrarProductos() {
	        System.out.println("Productos disponibles:");
	        for (int i = 0; i < productos.length; i++) {
	            System.out.println((i + 1) + ". " + productos[i].nombre + " - " + productos[i].origen + " - " + productos[i].precio + "€");
	        }
	    }

	    public Producto obtenerProducto(int index) {
	        if (index >= 0 && index < productos.length) {
	            return productos[index];
	        }
	        return null;
	    }

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
	        mostrarProductos();
	    }

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
	        mostrarProductos();
	    }

	    public void buscarPorNombre(String nombre) {
	        System.out.println("Resultados de búsqueda por nombre:");
	        for (int i = 0; i < productos.length; i++) {
	            if (productos[i].nombre.toLowerCase().contains(nombre.toLowerCase())) {
	                System.out.println(productos[i].nombre + " - " + productos[i].origen + " - " + productos[i].precio + "€");
	            }
	        }
	    }

	    public void buscarPorOrigen(String origen) {
	        System.out.println("Resultados de búsqueda por origen:");
	        for (int i = 0; i < productos.length; i++) {
	            if (productos[i].origen.equalsIgnoreCase(origen)) {
	                System.out.println(productos[i].nombre + " - " + productos[i].origen + " - " + productos[i].precio + "€");
	            }
	        }
	    }
	}
