package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
            String automaticoOManual, int cilindraje) {
        super(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return negrita+naranja+"Moto con las siguientes caracteristicas:\n" +reset+naranja+super.toString()+ ", cilindraje: " + cilindraje + "cc"+reset;
    }

    
    
}
