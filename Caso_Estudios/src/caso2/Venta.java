package caso2;

public class Venta {

    private double total;

    public void calcularTotal(double precio, int cantidad) {
        total = precio * cantidad;
        System.out.println("Total a pagar: " + total);
    }
}
