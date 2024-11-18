package co.edu.uniquindio.poo;

public class Venta {
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double precio;

    public Venta(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio) {
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        String oro = "\u001B[33m";
        String reset = "\u001B[0m";
        return oro+"Venta realizada por " + empleado.getNombreUsuario() +
        "\nCliente: " + cliente.getNombre() +
        "\nVehículo: " + vehiculo +
        "\nLiquidada a "+precio+"COP"+reset;
    }


    
}