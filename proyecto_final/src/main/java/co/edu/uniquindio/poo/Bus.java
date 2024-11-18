package co.edu.uniquindio.poo;

public class Bus extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean ABS;
    private int numEjes;
    private int salidasEmergencia;
    String naranja = "\u001B[93m";
    String negrita = "\u001B[1m";
    String reset = "\u001B[0m";
    
    public Bus(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
            String automaticoOManual, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
            boolean camaraReversa, int numBolsasAire, boolean aBS, int numEjes, int salidasEmergencia) {
        super(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.ABS = aBS;
        this.numEjes = numEjes;
        this.salidasEmergencia = salidasEmergencia;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public int getSalidasEmergencia() {
        return salidasEmergencia;
    }

    public void setSalidasEmergencia(int salidasEmergencia) {
        this.salidasEmergencia = salidasEmergencia;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    @Override
    public String toString() {
        return naranja+negrita+"Bus con las siguientes caracteristicas: \n" +reset
                +naranja+super.toString()+ ", tiene una capacidad de " + numeroPasajeros + " pasajeros, tiene " + numeroPuertas + " puertas, tiene aire acondicionado?: "
                +aireAcondicionado+ ", tiene camara de reversa?: "+camaraReversa+", tiene " + numBolsasAire + " bolsas de aire, tiene frenos ABS?: "
                + ABS +reset;
    }

    
}
