package co.edu.uniquindio.poo;
import java.util.LinkedList;

    public class Empleado extends Usuario {
        public LinkedList<Vehiculo> vehiculos;
        public LinkedList<Cliente> clientes;
        private LinkedList<Alquiler> historialAlquileres = new LinkedList<>();
        private LinkedList<Venta> historialVentas = new LinkedList<>();
        private Double salario;
        String verde = "\u001B[32m";
        String negrita = "\u001B[1m";
        String reset = "\u001B[0m";
        String rojo = "\u001B[31m";
        String oro = "\u001B[33m";

        public Empleado(String nombreUsuario, String contraseña, String preguntaSeguridad, String respuestaSeguridad) {
            super(nombreUsuario, contraseña, preguntaSeguridad, respuestaSeguridad);
            vehiculos = new LinkedList<>();
            clientes = new LinkedList<>();
            historialAlquileres = new LinkedList<>();
            historialVentas = new LinkedList<>();
        }

        public Double getSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }

        public LinkedList<Alquiler> getHistorialAlquileres() {
            return historialAlquileres;
        }

        public void setHistorialAlquileres(LinkedList<Alquiler> historialAlquileres) {
            this.historialAlquileres = historialAlquileres;
        }

        public LinkedList<Venta> getHistorialVentas() {
            return historialVentas;
        }

        public void setHistorialVentas(LinkedList<Venta> historialVentas) {
            this.historialVentas = historialVentas;
        }

        public LinkedList<Cliente> getClientes() {
            return clientes;
        }

        public void setClientes(LinkedList<Cliente> clientes) {
            this.clientes = clientes;
        }

        public LinkedList<Vehiculo> getVehiculos() {
            return vehiculos;
        }

        public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
            this.vehiculos = vehiculos;
        }

        @Override
        public void mostrarMenu(){
            String oro = "\u001B[33m";
            String reset = "\u001B[0m";
            String negrita = "\u001B[1m";
            System.out.println(oro+negrita+"\n--- Menú de Empleado ---"+reset);                 
            System.out.println(oro+negrita+"1."+reset+ "Registrar vehiculo");
            System.out.println(oro+negrita+"2."+reset+ "Registrar cliente");
            System.out.println(oro+negrita+"3."+reset+ "Alquilar vehiculo");
            System.out.println(oro+negrita+"4."+reset+ "Vender vehiculo");
            System.out.println(oro+negrita+"5."+reset+ "Ver vehiculos disponibles");
            System.out.println(oro+negrita+"6."+reset+ "Ver clientes registrados");
            System.out.println(oro+negrita+"7."+reset+ "Ver registro de transacciones");
            System.out.println(oro+negrita+"8."+reset+ "Salir");
        }


        public void registrarBus(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
        String automaticoOManual, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
        boolean camaraReversa, int numBolsasAire, boolean aBS, int numEjes, int salidasEmergencia) {
            vehiculos.add(new Bus(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, numBolsasAire, aBS, numEjes, salidasEmergencia));
            System.out.println(verde+negrita+"Bus registrado con exito!"+reset);
        }

        public void registrarCamion(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
        String automaticoOManual, int capacidadCarga, boolean aireAcondicionado, boolean frenosAire, int numEjes,
        boolean aBS) {
            vehiculos.add(new Camion(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, capacidadCarga, aireAcondicionado, frenosAire, numEjes,aBS));
            System.out.println(verde+negrita+"Camion registrado con exito!"+reset);
        }

        public void registrarCamioneta(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
        String automaticoOManual, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
        boolean camaraReversa, int velocidadCrucero, int numBolsasAire, boolean aBS, boolean sensorColision,
        boolean es4x4){
            vehiculos.add(new Camioneta(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, aBS, sensorColision, es4x4));
            System.out.println(verde+negrita+"Camioneta registrada con exito!"+reset);
        }

        public void registrarDeportivo(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
        String automaticoOManual, int numeroPasajeros, int numeroPuertas, int numBolsasAire, int caballosFuerza,
        int tiempoAlcanzar100km){
            vehiculos.add(new Deportivo(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, numBolsasAire, caballosFuerza, tiempoAlcanzar100km));
            System.out.println(verde+negrita+"Deportivo registrado con exito!"+reset);
        }

        public void registrarMoto(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
        String automaticoOManual, int cilindraje){
            vehiculos.add(new Moto(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, cilindraje));
            System.out.println(verde+negrita+"Moto registrada con exito!"+reset);
        }

        public void registrarPickUp(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
        String automaticoOManual, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
        boolean camaraReversa, int velocidadCrucero, int numBolsasAire, boolean aBS, boolean sensorColision,
        boolean es4x4, int capacidadCarga){
            vehiculos.add(new PickUp(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, aBS, sensorColision, es4x4, capacidadCarga));
            System.out.println(verde+negrita+"PickUp registrada con exito!"+reset);
        }

        public void registrarSedan(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
        String automaticoOManual, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
        boolean camaraReversa, int velocidadCrucero, int numBolsasAire, boolean aBS, boolean sensorColision){
            vehiculos.add(new Sedan(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, aBS, sensorColision));
            System.out.println(verde+negrita+"Sedan registrado con exito!"+reset);
        }

        public void registrarVan(String marca, String usadoONuevo, String modelo, int velocidadMaxima, String tipoCombustible,
        String automaticoOManual, int numeroPasajeros, int numeroPuertas, boolean aireAcondicionado,
        boolean camaraReversa, int velocidadCrucero, int numBolsasAire, boolean aBS){
            vehiculos.add(new Van(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, aBS));
            System.out.println(verde+negrita+"Van registrada con exito!"+reset);
        }

        public void registrarCliente(String nombre, int edad, String direccion, String telefono){
            clientes.add(new Cliente(nombre, edad, direccion, telefono));
            System.out.println(verde+negrita+"Cliente registrado con exito!"+reset);
        }

        public void alquilarVehiculo(Cliente cliente, Vehiculo vehiculo, SistemaAutenticacion sistema) {
            if (!vehiculo.isDisponible()) {
                System.out.println(rojo+negrita+"El vehículo seleccionado no está disponible."+reset);
                return;
            }
            vehiculo.setDisponible(false);
            registrarAlquiler(new Alquiler(this, cliente, vehiculo));
            System.out.println(verde+negrita+"Vehículo alquilado con éxito al cliente: " + cliente.getNombre()+reset);
        }

        public void venderVehiculo(Cliente cliente, Vehiculo vehiculo, double precio, SistemaAutenticacion sistema) {
            if (!vehiculo.isDisponible()) {
                System.out.println(rojo+negrita+"El vehículo seleccionado no está disponible para la venta."+reset);
                return;
            }
            vehiculo.setDisponible(false);
            getVehiculos().remove(vehiculo);
            registrarVenta(new Venta(this, cliente, vehiculo, precio));
            System.out.println(verde+negrita+"Vehículo vendido con éxito al cliente: " + cliente.getNombre()+reset);
        }

        public void mostrarVehiculosDisponibles() {
            System.out.println(oro+negrita+"Vehículos disponibles:"+reset);
            int index = 1;
            for (Vehiculo vehiculo : vehiculos){
                if (vehiculo.isDisponible()) {
                    System.out.println(index + ". " + vehiculo);
                }
                index++;
            }
            if(vehiculos.isEmpty()){
                System.out.println(rojo+negrita+"No hay vehiculos disponibles en el momento!"+reset);
            }
        }

        public void mostrarClientes() {
            System.out.println(oro+negrita+"Clientes registrados:"+reset);
            int index = 1;
            for (Cliente cliente : clientes){
                System.out.println(index + ". " + cliente);
                index++;
            }
            if(clientes.isEmpty()){
                System.out.println(rojo+negrita+"No hay clientes registrados!"+reset);
            }
        }

        public void registrarAlquiler(Alquiler alquiler) {
            historialAlquileres.add(alquiler);
        }
    
        public void registrarVenta(Venta venta) {
            historialVentas.add(venta);
        }

        public void mostrarTransacciones(){
            System.out.println(oro+negrita+"Ventas realizadas: \n"+reset+historialVentas);
            System.out.println(oro+negrita+"Alquileres realizados: \n"+reset+historialAlquileres);    
        }


}