package Caso1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("crear cuenta");

        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Numero de cuenta: ");
        int numeroCuenta = sc.nextInt();

        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        Cliente cliente = new Cliente(nombre);
        Cuenta cuenta = new Cuenta(numeroCuenta, saldoInicial, cliente);

        int opcion;

        do {

            System.out.println("\nMenú");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Monto a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Monto a retirar: ");
                    double retiro = sc.nextDouble();
                    cuenta.retirar(retiro);
                    break;

                case 3:
                    cuenta.consultarSaldo();
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);
    }
}
