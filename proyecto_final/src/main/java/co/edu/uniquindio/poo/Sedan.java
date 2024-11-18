package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int velocidadCrucero;
    private int numBolsasAire;
    private boolean ABS;
    private boolean sensorColision;
    
    public Sedan(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
            String automaticoOManual, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
            boolean camaraReversa, int velocidadCrucero, int numBolsasAire, boolean aBS, boolean sensorColision) {
        super(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.velocidadCrucero = velocidadCrucero;
        this.numBolsasAire = numBolsasAire;
        this.ABS = aBS;
        this.sensorColision = sensorColision;
    }

    public boolean isABS() {
        return ABS;
    }

    public void setABS(boolean aBS) {
        ABS = aBS;
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

    public boolean getSensorColision() {
        return sensorColision;
    }

    public void setSensorColision(boolean sensorColision) {
        this.sensorColision = sensorColision;
    }

    @Override
    public String toString() {
        return naranja+negrita+"Sedan con las siguientes caracteristicas:\n " +reset+naranja+super.toString() + ", numero de pasajeros: " + numeroPasajeros + ", numerode puertas=" + numeroPuertas + ", tiene aire acondicionado?: "
                + aireAcondicionado + ", tiene camara de reversa?: " + camaraReversa + ", velocidad de crucero: " + velocidadCrucero
                + "km/h, numero de bolsas de aire: " + numBolsasAire + ", tiene frenos ABS?: " + ABS + ", tiene sensor de colision?: " + sensorColision+reset;
    }

    

}
