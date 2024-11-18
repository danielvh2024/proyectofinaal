package co.edu.uniquindio.poo;

public class Alquiler {
        private Empleado empleado;
        private Cliente cliente;
        private Vehiculo vehiculo;
    
        public Alquiler(Empleado empleado, Cliente cliente, Vehiculo vehiculo) {
            this.empleado = empleado;
            this.cliente = cliente;
            this.vehiculo = vehiculo;
        }
    
        @Override
        public String toString() {
            String oro = "\u001B[33m";
            String reset = "\u001B[0m";
            return oro+"Alquiler realizado por " +empleado.getNombreUsuario()+
                "\nCliente: " + cliente.getNombre() +
                "\nVehículo: " + vehiculo+reset;
        }
    }

