package Jardineria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda();
        Carrito carrito = new Carrito();
        int opcion = 0;
        
        while (opcion != 8) {
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
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 1) {
                tienda.mostrarProductos();
            } else if (opcion == 2) {
                tienda.mostrarProductos();
                System.out.print("Elige el número del producto: ");
                int productoIndex = scanner.nextInt() - 1;
                Producto producto = tienda.obtenerProducto(productoIndex);
                if (producto != null) {
                    carrito.agregarProducto(producto);
                } else {
                    System.out.println("Producto no válido.");
                }
            } else if (opcion == 3) {
                carrito.mostrarCarrito();
            } else if (opcion == 4) {
                tienda.ordenarMenorMayor();
            } else if (opcion == 5) {
                tienda.ordenarMayorMenor();
            } else if (opcion == 6) {
                System.out.print("Ingrese el nombre del producto: ");
                String nombre = scanner.nextLine();
                tienda.buscarPorNombre(nombre);
            } else if (opcion == 7) {
                System.out.print("Ingrese el origen del producto: ");
                String origen = scanner.nextLine();
                tienda.buscarPorOrigen(origen);
            } else if (opcion == 8) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida, intente de nuevo.");
            }
        }
    }
}