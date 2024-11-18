package co.edu.uniquindio.poo;

public class Cliente {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    String naranja = "\u001B[93m";
    String negrita = "\u001B[1m";
    String reset = "\u001B[0m";
    
    public Cliente(String nombre, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return naranja+negrita+"Cliente "+reset+naranja+nombre+ ","+naranja+negrita+"edad: " +reset+naranja+edad+ "años,"+naranja+negrita+"direccion: " +reset+naranja+direccion+ ","+naranja+negrita+"telefono: " +reset+naranja+telefono+reset;
    }
}
