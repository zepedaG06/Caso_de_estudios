package caso2;

public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("-------------------");
    }

    public boolean vender(int cantidad) {

        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    public double getPrecio() {
        return precio;
    }
}
