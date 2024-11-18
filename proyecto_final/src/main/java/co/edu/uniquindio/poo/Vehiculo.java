package co.edu.uniquindio.poo;

public class Vehiculo {
    private String marca;
    private String usadoONuevo;
    private String modelo;
    private int velocidadMaxima;
    private String tipoCombustible;
    private String automaticoOManual;
    String naranja = "\u001B[93m";
    String negrita = "\u001B[1m";
    String reset = "\u001B[0m";
    
    public Vehiculo(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
            String automaticoOManual) {
        this.marca = marca;
        this.usadoONuevo = usadoONuevo;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.automaticoOManual = automaticoOManual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUsadoONuevo() {
        return usadoONuevo;
    }

    public void setUsadoONuevo(String usadoONuevo) {
        this.usadoONuevo = usadoONuevo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getAutomaticoOManual() {
        return automaticoOManual;
    }

    public void setAutomaticoOManual(String automaticoOManual) {
        this.automaticoOManual = automaticoOManual;
    }

    @Override
    public String toString() {
        return naranja+"marca:" + marca + ", es " + usadoONuevo + ", modelo:" + modelo + ", alcanza una velocidad maxima de "
                + velocidadMaxima + ", usa combustible " + tipoCombustible + ", es " + automaticoOManual+reset;
    }

    private boolean disponible = true;

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
