package co.edu.uniquindio.poo;

public class Camion extends Vehiculo{
    private int capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private int numEjes;
    private boolean ABS;
    
    String naranja = "\u001B[93m";
    String negrita = "\u001B[1m";
    String reset = "\u001B[0m";
    
    public Camion(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
            String automaticoOManual, int capacidadCarga, boolean aireAcondicionado, boolean frenosAire, int numEjes,
            boolean aBS) {
        super(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.numEjes = numEjes;
        this.ABS = aBS;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    @Override
    public String toString() {
        return naranja+negrita+"Camion con las siguientes caracteristicas: \n" +reset+naranja+super.toString()+", Capacidad de carga: " + capacidadCarga + "Kg, tiene aire acondicionado?: " + aireAcondicionado + ", tiene frenos de aire?: "
                + frenosAire + ", numero de ejes: " + numEjes + ", tiene frenos ABS?: " +ABS+reset;
    }

    
    
}
