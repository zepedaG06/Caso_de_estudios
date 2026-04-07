package caso2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Producto producto = new Producto(1, "Laptop", 800, 10);
        Venta venta = new Venta();

        int opcion;

        do {

            System.out.println("\nMenú");
            System.out.println("1. Mostrar producto");
            System.out.println("2. Vender producto");
            System.out.println("3. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    producto.mostrarProducto();
                    break;

                case 2:

                    System.out.print("Cantidad a comprar: ");
                    int cantidad = sc.nextInt();

                    if (producto.vender(cantidad)) {
                        venta.calcularTotal(producto.getPrecio(), cantidad);
                    } else {
                        System.out.println("No hay suficiente stock.");
                    }

                    break;

                case 3:
                    System.out.println("Gracias por comprar.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);
    }
}
