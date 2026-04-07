package Caso1;

public class Cuenta {

    private int numeroCuenta;
    private double saldo;
    private Cliente cliente;

    public Cuenta(int numeroCuenta, double saldo, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Deposito realizado correctamente.");
    }

    public void retirar(double monto) {

        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado correctamente.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }
}