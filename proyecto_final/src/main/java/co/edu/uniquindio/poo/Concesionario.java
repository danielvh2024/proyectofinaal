package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Concesionario {
    String azul = "\u001B[34m";
    String reset = "\u001B[0m";
    String negrita = "\u001B[1m";
    String rojo = "\u001B[31m";
    String verde = "\u001B[32m";

    private String nombre;
    private LinkedList<Vehiculo> vehiculos;
    public Concesionario(String nombre) {
        this.nombre = nombre;
        vehiculos = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculo(){}

    public String mostrarMenu(){
        return verde+negrita+"---Consesionario " +getNombre()+
                "---\n\n1."+reset+" Registrar usuario\n"+verde+negrita+"2."+reset+" Iniciar sesión\n"+verde+negrita+"3"+reset+". Recuperar contraseña\n"+verde+negrita+"4"+reset+". Salir";                   
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
