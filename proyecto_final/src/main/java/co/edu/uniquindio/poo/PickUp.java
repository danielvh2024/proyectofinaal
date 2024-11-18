package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int velocidadCrucero;
    private int numBolsasAire;
    private boolean ABS; 
    private boolean sensorColision; 
    private boolean es4x4;
    private int capacidadCarga;
    
    public PickUp(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
            String automaticoOManual, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
            boolean camaraReversa, int velocidadCrucero, int numBolsasAire, boolean aBS, boolean sensorColision,
            boolean es4x4, int capacidadCarga) {
        super(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.numBolsasAire = numBolsasAire;
        this.ABS = aBS;
        this.sensorColision = sensorColision;
        this.es4x4 = es4x4;
        this.capacidadCarga = capacidadCarga;
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

    public int getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(int velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
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

    public boolean isSensorColision() {
        return sensorColision;
    }

    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }

    public boolean isEs4x4() {
        return es4x4;
    }

    public void setEs4x4(boolean es4x4) {
        this.es4x4 = es4x4;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return negrita+naranja+"PickUp con las siguientes caracteristicas: \n" +reset+naranja+super.toString()+ ", numero de pasajeros: " + numeroPasajeros + ", numero de puertas: " + numeroPuertas
                + ", tiene aire acondicionado?: " + aireAcondicionado + ", tiene camara de reversa?: " + camaraReversa
                + ", velocidad de crucero: " + velocidadCrucero + "km/h, numero de bolsas de aire: " + numBolsasAire + ", tiene frenos ABS?: " + ABS
                + ", tiene sensor de colision?: " + sensorColision + ", es 4x4?: " + es4x4 + ", capacidad de carga" + capacidadCarga
                + "kg"+reset;
    }

    
}
