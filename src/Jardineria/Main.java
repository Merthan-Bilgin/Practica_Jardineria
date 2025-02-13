package Jardineria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un escáner para leer entradas del usuario
        Tienda tienda = new Tienda(); // Crear una instancia de la tienda
        Carrito carrito = new Carrito(); // Crear una instancia del carrito de compras
        int opcion = 0; // Variable para almacenar la opción elegida por el usuario
        
        while (opcion != 8) { // Bucle que muestra el menú hasta que el usuario elige salir (opción 8)
            System.out.println("Menú:");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Ver productos");
            System.out.println("2. Añadir al carrito");
            System.out.println("3. Ver carrito");
            System.out.println("4. Ordenar por precio asscendente");
            System.out.println("5. Ordenar por precio descendente");
            System.out.println("6. Buscar producto por nombre");
            System.out.println("7. Buscar producto por origen");
            System.out.println("8. Salir");
            
            opcion = scanner.nextInt(); // Leer la opción que el usuario elige
            scanner.nextLine();
            
         // Dependiendo de la opción elegida, se ejecuta una acción
            if (opcion == 1) {
                tienda.mostrarProductos(); // Muestra los productos disponibles
            } else if (opcion == 2) {
                tienda.mostrarProductos(); // Muestra los productos para que el usuario elija uno
                System.out.print("Elige el número del producto: ");
                int productoIndex = scanner.nextInt() - 1; // El índice del producto seleccionado (restamos 1 porque los índices empiezan en 0)
                Producto producto = tienda.obtenerProducto(productoIndex);
                if (producto != null) {
                    carrito.agregarProducto(producto); // Si el producto es válido, lo agrega al carrito
                } else {
                    System.out.println("Producto no válido.");
                }
            } else if (opcion == 3) {
                carrito.mostrarCarrito(); // Muestra los productos en el carrito
            } else if (opcion == 4) {
                tienda.ordenarMenorMayor(); // Ordena los productos por precio ascendente
            } else if (opcion == 5) {
                tienda.ordenarMayorMenor(); // Ordena los productos por precio descendente
            } else if (opcion == 6) {
                System.out.print("Ingrese el nombre del producto: ");
                String nombre = scanner.nextLine(); // Lee el nombre del producto
                tienda.buscarPorNombre(nombre); 
            } else if (opcion == 7) {
                System.out.print("Ingrese el origen del producto: ");
                String origen = scanner.nextLine(); // Lee el origen del producto
                tienda.buscarPorOrigen(origen); // Busca los productos que coincidan con el origen
            } else if (opcion == 8) {
                System.out.println("Saliendo..."); // Mensaje de despedida cuando el usuario elige salir
            } else {
                System.out.println("Opción no válida, intente de nuevo."); // Mensaje de error si la opción es incorrecta
            }
        }
    }
}