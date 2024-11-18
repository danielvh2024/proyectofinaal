package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private int numBolsasAire;
    private int caballosFuerza;
    private int tiempoAlcanzar100km;
    
    public Deportivo(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
            String automaticoOManual, int numeroPasajeros, int numeroPuertas, int numBolsasAire, int caballosFuerza,
            int tiempoAlcanzar100km) {
        super(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.numBolsasAire = numBolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoAlcanzar100km = tiempoAlcanzar100km;
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
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    public int getCaballosFuerza() {
        return caballosFuerza;
    }
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    public int getTiempoAlcanzar100km() {
        return tiempoAlcanzar100km;
    }
    public void setTiempoAlcanzar100km(int tiempoAlcanzar100km) {
        this.tiempoAlcanzar100km = tiempoAlcanzar100km;
    }

    @Override
    public String toString() {
        return negrita+naranja+"Deportivo con las siguientes caracteristicas:\n"+reset+naranja+super.toString()+ ", numero de pasajeros: " + numeroPasajeros + ", numero de puertas:" + numeroPuertas + ", numero de bolsas de aire: "
                + numBolsasAire + ", caballos de fuerza: " + caballosFuerza + ", tiempo para alcanzar los 100km/h" + tiempoAlcanzar100km
                + " segundos"+reset;
    }

    
}
