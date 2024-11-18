package co.edu.uniquindio.poo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ///Instancias necesarias///
        Concesionario concesionario = new Concesionario("TuCarroUQ");
        Empleado empleado = new Empleado("", "", "", "");
        Administrador administrador = new Administrador("", "", "", "");
        SistemaAutenticacion sistemaAutenticacion = new SistemaAutenticacion();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        boolean salirMenuUser = false;

        ///Codigos para los colores
        String azul = "\u001B[34m";
        String reset = "\u001B[0m";
        String negrita = "\u001B[1m";
        String rojo = "\u001B[31m";
        String verde = "\u001B[92m";
        String oro = "\u001B[33m";
        String morado = "\u001B[35m";



        ///Menu del programa///
        while (!salir) {
            Concesionario.mostrarMensaje(concesionario.mostrarMenu());
            //1. Registrar usuario
            //2. Iniciar sesión
            //3. Recuperar contraseña
            //4. Salir
                //Seleccione una opción: 
            int opcionMenuPrincipal = leerEnteroValido(scanner, azul+negrita+"Seleccione una opcion: "+reset);

            switch (opcionMenuPrincipal){
                case 1:
                    System.out.println(azul+negrita+"Has seleccionado registrar un usuario!"+reset);
                    String nombreUsuario = leerTextoValido(scanner, azul+negrita+"Ingrese el nombre del usuario: "+reset);
                    String contraseña = leerTextoValido(scanner, azul+negrita+"Ingrese la contraseña del usuario: "+reset);
                    String preguntaSeguridad = leerTextoValido(scanner, azul+negrita+"Ingrese una pregunta de seguridad: "+reset);
                    String respuestaSeguridad = leerTextoValido(scanner, azul+negrita+"Ingrese una respuesta a la pregunta de seguridad: "+reset);
                    boolean tipoUsuarioValido = false;
                    String tipoUsuario = "";
                    while(!tipoUsuarioValido){
                        tipoUsuario = leerTextoValido(scanner, azul+negrita+"Ingrese el tipo de usuario(Administrador/Empleado): "+reset);
                        if(tipoUsuario.equalsIgnoreCase("Administrador") || tipoUsuario.equalsIgnoreCase("Empleado")){
                            tipoUsuarioValido = true;
                            break;
                        } else{
                            System.out.println(rojo+negrita+"Tipo de empleado invalido, ponga administrador o empleado!"+reset);
                        }
                    }
                    sistemaAutenticacion.registrarUsuario(nombreUsuario, contraseña, preguntaSeguridad, respuestaSeguridad, tipoUsuario);
                    break;
                case 2:
                System.out.println(azul+negrita+"Has seleccionado inciar sesion!"+reset);
                    String usuario = leerTextoValido(scanner, azul+negrita+"Nombre de usuario: "+reset);
                    String pass = leerTextoValido(scanner, azul+negrita+"Contraseña: "+reset);
                    Usuario user = sistemaAutenticacion.iniciarSesion(usuario, pass);
                    if (user != null && user instanceof Empleado) {
                        while(!salirMenuUser){
                            user.mostrarMenu();
                            //1. Registrar vehiculo
                            //2. Registrar cliente
                            //3. Alquilar vehiculo
                            //4. Vender vehiculo
                            //5. Ver vehiculos disponibles
                            //6. Ver clientes registrados
                            //7. Ver registro de transacciones
                            //8. Salir
                                //Seleccione una opción:
                            int opcionMenuEmpleado = leerEnteroValido(scanner, oro+negrita+"Ingrese una opcion: "+reset);
                            switch(opcionMenuEmpleado){
                                case 1:
                                System.out.println(oro+negrita+"\nTipos de vehiculos disponibles para registrar:\n"+reset);
                                System.out.println(oro+negrita+"-"+reset+"Bus\n"+oro+negrita+"-"+reset+"Camion\n"+oro+negrita+"-"+reset+"Camioneta\n" +oro+negrita+"-"+reset+"Deportivo\n"+oro+negrita+"-"+reset+"Moto\n" +oro+negrita+"-"+reset+ "PickUp\n" +oro+negrita+"-"+reset+"Sedan");
                                String tipoVehiculo = leerTextoValido(scanner, oro+negrita+"Seleccione una opcion(Escriba el tipo de vehiculo, ej: moto, bus, etc): "+reset);
                                if(tipoVehiculo.equalsIgnoreCase("Camion")){
                                    System.out.println(oro+negrita+"\tHas seleccionado registrar un "+tipoVehiculo+"!"+reset);
                                    String marca = leerTextoValido(scanner, oro+negrita+"Marca:"+reset);
                                    String usadoONuevo = leerTextoValido(scanner, oro+negrita+"Usado o nuevo?: "+reset);
                                    String modelo = leerTextoValido(scanner, oro+negrita+"Modelo: "+reset);
                                    int velocidadMaxima = leerEnteroValido(scanner, oro+negrita+"Velocidad maxima(km/h): "+reset);
                                    String tipoCombustible = leerTextoValido(scanner, oro+negrita+"Tipo de combustible: "+reset);
                                    String automaticoOManual = leerTextoValido(scanner, oro+negrita+"Automatico o manual?: ")+reset;
                                    int capacidadCarga = leerEnteroValido(scanner, oro+negrita+"Capacidad de carga(Kg): "+reset);
                                    boolean aireAcondicionado = leerBooleanValido(scanner, oro+negrita+"Tiene aire acondicionado?"+reset);
                                    boolean frenosAire = leerBooleanValido(scanner, oro+negrita+"Tiene frenos de aire?"+reset);
                                    int numEjes = leerEnteroValido(scanner, oro+negrita+"Numero de ejes: "+reset);
                                    boolean aBS = leerBooleanValido(scanner, oro+negrita+"Tiene frenos ABS?"+reset);
                                    empleado.registrarCamion(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, capacidadCarga, aireAcondicionado, frenosAire, numEjes, aBS);
                                } else if(tipoVehiculo.equalsIgnoreCase("Sedan")){
                                    System.out.println(oro+negrita+"Has seleccionado registrar un "+tipoVehiculo+"!"+reset);
                                    String marca = leerTextoValido(scanner, oro+negrita+"Marca:"+reset);
                                    String usadoONuevo = leerTextoValido(scanner, oro+negrita+"Usado o nuevo?: "+reset);
                                    String modelo = leerTextoValido(scanner, oro+negrita+"Modelo: "+reset);
                                    int velocidadMaxima = leerEnteroValido(scanner, oro+negrita+"Velocidad maxima(km/h): "+reset);
                                    String tipoCombustible = leerTextoValido(scanner, oro+negrita+"Tipo de combustible: "+reset);
                                    String automaticoOManual = leerTextoValido(scanner, oro+negrita+"Automatico o manual?: "+reset);
                                    int numeroPasajeros = leerEnteroValido(scanner, oro+negrita+"Numero de pasajeros: "+reset);
                                    int numeroPuertas = leerEnteroValido(scanner, oro+negrita+"Numero de puertas: "+reset);
                                    boolean aireAcondicionado = leerBooleanValido(scanner, oro+negrita+"Tiene aire acondicionado?"+reset);
                                    boolean camaraReversa = leerBooleanValido(scanner, oro+negrita+"Tiene camara de reversa?"+reset);
                                    int velocidadCrucero = leerEnteroValido(scanner, oro+negrita+"Velocidad de crucero(km/h): "+reset);
                                    boolean aBS = leerBooleanValido(scanner, oro+negrita+"Tiene frenos ABS?"+reset);
                                    int numBolsasAire = leerEnteroValido(scanner, oro+negrita+"Numero de bolsas de aire: "+reset);
                                    boolean sensorColision = leerBooleanValido(scanner, oro+negrita+"Tiene sensor de colision?"+reset);
                                    empleado.registrarSedan(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, aBS, sensorColision);
                                } else if(tipoVehiculo.equalsIgnoreCase("Van")){
                                    System.out.println(oro+negrita+"Has seleccionado registrar un "+tipoVehiculo+"!"+reset);
                                    String marca = leerTextoValido(scanner, oro+negrita+"Marca:"+reset);
                                    String usadoONuevo = leerTextoValido(scanner, oro+negrita+"Usado o nuevo?: "+reset);
                                    String modelo = leerTextoValido(scanner, oro+negrita+"Modelo: "+reset);
                                    int velocidadMaxima = leerEnteroValido(scanner, oro+negrita+"Velocidad maxima(km/h): "+reset);
                                    String tipoCombustible = leerTextoValido(scanner, oro+negrita+"Tipo de combustible: "+reset);
                                    String automaticoOManual = leerTextoValido(scanner, oro+negrita+"Automatico o manual?: "+reset);
                                    int numeroPasajeros = leerEnteroValido(scanner, oro+negrita+"Numero de pasajeros: "+reset);
                                    int numeroPuertas = leerEnteroValido(scanner, oro+negrita+"Numero de puertas: "+reset);
                                    boolean aireAcondicionado = leerBooleanValido(scanner, oro+negrita+"Tiene aire acondicionado?"+reset);
                                    boolean camaraReversa = leerBooleanValido(scanner, oro+negrita+"Tiene camara de reversa?"+reset);
                                    boolean aBS = leerBooleanValido(scanner, oro+negrita+"Tiene frenos ABS?"+reset);
                                    int numBolsasAire = leerEnteroValido(scanner, oro+negrita+"Numero de bolsas de aire: "+reset);
                                    empleado.registrarVan(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, velocidadMaxima, numBolsasAire, aBS);
                                } else if(tipoVehiculo.equalsIgnoreCase("Bus")){
                                    System.out.println(oro+negrita+"\tHas seleccionado registrar un "+tipoVehiculo+"!"+reset);
                                    String marca = leerTextoValido(scanner, oro+negrita+"Marca:"+reset);
                                    String usadoONuevo = leerTextoValido(scanner, oro+negrita+"Usado o nuevo?: "+reset);
                                    String modelo = leerTextoValido(scanner, oro+negrita+"Modelo: "+reset);
                                    int velocidadMaxima = leerEnteroValido(scanner, oro+negrita+"Velocidad maxima(km/h): "+reset);
                                    String tipoCombustible = leerTextoValido(scanner, oro+negrita+"Tipo de combustible: "+reset);
                                    String automaticoOManual = leerTextoValido(scanner, oro+negrita+"Automatico o manual?: "+reset);
                                    int numeroPasajeros = leerEnteroValido(scanner, oro+negrita+"Numero de pasajeros: "+reset);
                                    int numeroPuertas = leerEnteroValido(scanner, oro+negrita+"Numero de puertas: "+reset);
                                    boolean aireAcondicionado = leerBooleanValido(scanner, oro+negrita+"Tiene aire acondicionado?"+reset);
                                    boolean camaraReversa = leerBooleanValido(scanner, oro+negrita+"Tiene camara de reversa?"+reset);
                                    boolean aBS = leerBooleanValido(scanner, oro+negrita+"Tiene frenos ABS?"+reset);
                                    int numBolsasAire = leerEnteroValido(scanner, oro+negrita+"Numero de bolsas de aire: "+reset);
                                    int numEjes = leerEnteroValido(scanner, oro+negrita+"Numero de ejes: "+reset);
                                    int salidasEmergencia = leerEnteroValido(scanner, oro+negrita+"Numero de salidas de emergencia: "+reset);

                                    empleado.registrarBus(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, numBolsasAire, aBS, numEjes, salidasEmergencia);
                                } else if(tipoVehiculo.equalsIgnoreCase("Camioneta")){
                                    System.out.println(oro+negrita+"Has seleccionado registrar un "+tipoVehiculo+"!"+reset);
                                    String marca = leerTextoValido(scanner, oro+negrita+"Marca:"+reset);
                                    String usadoONuevo = leerTextoValido(scanner, oro+negrita+"Usado o nuevo?: "+reset);
                                    String modelo = leerTextoValido(scanner, oro+negrita+"Modelo: "+reset);
                                    int velocidadMaxima = leerEnteroValido(scanner, oro+negrita+"Velocidad maxima(km/h): "+reset);
                                    String tipoCombustible = leerTextoValido(scanner, oro+negrita+"Tipo de combustible: "+reset);
                                    String automaticoOManual = leerTextoValido(scanner, oro+negrita+"Automatico o manual?: "+reset);
                                    int numeroPasajeros = leerEnteroValido(scanner, oro+negrita+"Numero de pasajeros: "+reset);
                                    int numeroPuertas = leerEnteroValido(scanner, oro+negrita+"Numero de puertas: "+reset);
                                    boolean aireAcondicionado = leerBooleanValido(scanner, oro+negrita+"Tiene aire acondicionado?"+reset);
                                    boolean camaraReversa = leerBooleanValido(scanner, oro+negrita+"Tiene camara de reversa?"+reset);
                                    int velocidadCrucero = leerEnteroValido(scanner, oro+negrita+"Velocidad de crucero(km/h): "+reset);
                                    boolean aBS = leerBooleanValido(scanner, oro+negrita+"Tiene frenos ABS?"+reset);
                                    int numBolsasAire = leerEnteroValido(scanner, oro+negrita+"Numero de bolsas de aire: "+reset);
                                    boolean sensorColision = leerBooleanValido(scanner, oro+negrita+"Tiene sensor de colision?"+reset);
                                    boolean es4x4 = leerBooleanValido(scanner, oro+negrita+"Es 4x4?"+reset);
                                    empleado.registrarCamioneta(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, aBS, sensorColision, es4x4);
                                } else if(tipoVehiculo.equalsIgnoreCase("Deportivo")){
                                    System.out.println(oro+negrita+"Has seleccionado registrar un "+tipoVehiculo+"!"+reset);
                                    String marca = leerTextoValido(scanner, oro+negrita+"Marca:"+reset);
                                    String usadoONuevo = leerTextoValido(scanner, oro+negrita+"Usado o nuevo?: "+reset);
                                    String modelo = leerTextoValido(scanner, oro+negrita+"Modelo: "+reset);
                                    int velocidadMaxima = leerEnteroValido(scanner, oro+negrita+"Velocidad maxima(km/h): "+reset);
                                    String tipoCombustible = leerTextoValido(scanner, oro+negrita+"Tipo de combustible: "+reset);
                                    String automaticoOManual = leerTextoValido(scanner, oro+negrita+"Automatico o manual?: "+reset);
                                    int numeroPasajeros = leerEnteroValido(scanner, oro+negrita+"Numero de pasajeros: "+reset);
                                    int numeroPuertas = leerEnteroValido(scanner, oro+negrita+"Numero de puertas: "+reset);
                                    int caballosFuerza = leerEnteroValido(scanner, oro+negrita+"Caballos de fuerza: "+reset);
                                    int tiempoAlcanzar100km = leerEnteroValido(scanner, oro+negrita+"Tiempo (s) para alcanzar 100km/h: "+reset);
                                    empleado.registrarDeportivo(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, numeroPuertas, caballosFuerza, tiempoAlcanzar100km);
                                } else if(tipoVehiculo.equalsIgnoreCase("Moto")){
                                    String marca = leerTextoValido(scanner, oro+negrita+"Marca:"+reset);
                                    String usadoONuevo = leerTextoValido(scanner, oro+negrita+"Usado o nuevo?: "+reset);
                                    String modelo = leerTextoValido(scanner, oro+negrita+"Modelo: "+reset);
                                    int velocidadMaxima = leerEnteroValido(scanner, oro+negrita+"Velocidad maxima(km/h): "+reset);
                                    String tipoCombustible = leerTextoValido(scanner, oro+negrita+"Tipo de combustible: "+reset);
                                    String automaticoOManual = leerTextoValido(scanner, oro+negrita+"Automatico o manual?: "+reset);
                                    int cilindraje = leerEnteroValido(scanner, oro+negrita+"Cilindraje: "+reset);
                                    empleado.registrarMoto(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, cilindraje);
                                } else if(tipoVehiculo.equalsIgnoreCase("PickUp") || tipoVehiculo.equalsIgnoreCase("Pick Up")){
                                    System.out.println(oro+negrita+"Has seleccionado registrar un "+tipoVehiculo+"!"+reset);
                                    String marca = leerTextoValido(scanner, oro+negrita+"Marca:"+reset);
                                    String usadoONuevo = leerTextoValido(scanner, oro+negrita+"Usado o nuevo?: "+reset);
                                    String modelo = leerTextoValido(scanner, oro+negrita+"Modelo: "+reset);
                                    int velocidadMaxima = leerEnteroValido(scanner, oro+negrita+"Velocidad maxima(km/h): "+reset);
                                    String tipoCombustible = leerTextoValido(scanner, oro+negrita+"Tipo de combustible: "+reset);
                                    String automaticoOManual = leerTextoValido(scanner, oro+negrita+"Automatico o manual?: "+reset);
                                    int numeroPasajeros = leerEnteroValido(scanner, oro+negrita+"Numero de pasajeros: +reset");
                                    int numeroPuertas = leerEnteroValido(scanner, oro+negrita+"Numero de puertas: "+reset);
                                    boolean aireAcondicionado = leerBooleanValido(scanner, oro+negrita+"Tiene aire acondicionado?"+reset);
                                    boolean camaraReversa = leerBooleanValido(scanner, oro+negrita+"Tiene camara de reversa?"+reset);
                                    int velocidadCrucero = leerEnteroValido(scanner, oro+negrita+"Velocidad de crucero(km/h): "+reset);
                                    boolean aBS = leerBooleanValido(scanner, oro+negrita+"Tiene frenos ABS?"+reset);
                                    int numBolsasAire = leerEnteroValido(scanner, oro+negrita+"Numero de bolsas de aire: "+reset);
                                    boolean sensorColision = leerBooleanValido(scanner, oro+negrita+"Tiene sensor de colision?"+reset);
                                    boolean es4x4 = leerBooleanValido(scanner, oro+negrita+"Es 4x4?"+reset);
                                    int capacidadCarga = leerEnteroValido(scanner, oro+negrita+"Capacidad de carga(Kg): "+reset);
                                    empleado.registrarPickUp(marca, usadoONuevo, modelo, velocidadMaxima, tipoCombustible, automaticoOManual, numeroPasajeros, numeroPuertas, aireAcondicionado, camaraReversa, velocidadCrucero, numBolsasAire, aBS, sensorColision, es4x4, capacidadCarga);
                                }
                                break;

                                case 2:
                                System.out.println(oro+negrita+"Has seleccionado registrar un cliente!\nPara registrar el cliente llene sus datos."+reset);
                                String nombre = leerTextoValido(scanner, oro+negrita+"Nombre del cliente: "+reset);
                                int edad = leerEnteroValido(scanner, oro+negrita+"Edad del cliente: "+reset);
                                String direccion = leerTextoValido(scanner, oro+negrita+"Direccion del cliente: "+reset);
                                String telefono = leerTextoValido(scanner, oro+negrita+"Telefono del cliente: "+reset);
                                empleado.registrarCliente(nombre, edad, direccion, telefono);
                                System.out.print(verde+negrita+"Cliente registrado con exito!"+reset);
                                break;

                                case 3:
                                System.out.println(oro+negrita+"Seleccione primero el cliente al que le quiere alquilar el vehiculo, luego el vehiculo: "+reset);
                                System.out.println("Clientes registrados:");
                                for (int i = 0; i < empleado.getClientes().size(); i++) {
                                    Cliente cliente = empleado.getClientes().get(i);
                                    System.out.println((i + 1) + ". " + cliente);
                                }

                                System.out.print("Seleccione el cliente (número): ");
                                int clienteIndex = scanner.nextInt() - 1;
                                scanner.nextLine();

    
                                if (clienteIndex < 0 || clienteIndex >= empleado.getClientes().size()) {
                                    System.out.println("Cliente no válido.");
                                break;
                                }
                                Cliente clienteSeleccionado = empleado.getClientes().get(clienteIndex);

                                System.out.println("\nVehículos disponibles:");
                                for (int i = 0; i < empleado.getVehiculos().size(); i++) {
                                    Vehiculo vehiculo = empleado.getVehiculos().get(i);
                                    System.out.println((i + 1) + ". " + vehiculo);
                                }

                                System.out.print("Seleccione el vehículo (número): ");
                                int vehiculoIndex = scanner.nextInt() - 1;
                                scanner.nextLine();

    
                                if (vehiculoIndex < 0 || vehiculoIndex >= empleado.getVehiculos().size()) {
                                    System.out.println("Vehículo no válido.");
                                break;
                                }
                                Vehiculo vehiculoSeleccionado = empleado.getVehiculos().get(vehiculoIndex);

                                empleado.alquilarVehiculo(clienteSeleccionado, vehiculoSeleccionado, sistemaAutenticacion);
                                break;

                                case 4:
                                System.out.println(oro+negrita+"Clientes registrados:"+reset);
                                empleado.mostrarClientes();
                                System.out.print(oro+negrita+"Seleccione el cliente (por índice): "+reset);
                                int clienteIdxVenta = scanner.nextInt() - 1;
                                scanner.nextLine();

                                if (clienteIdxVenta < 0 || clienteIdxVenta >= empleado.getClientes().size()) {
                                    System.out.println(rojo+negrita+"Índice de cliente inválido."+reset);
                                    break;
                                }

                                Cliente clienteVenta = empleado.getClientes().get(clienteIdxVenta);

                                System.out.println(oro+negrita+"Vehículos disponibles:"+reset);
                                empleado.mostrarVehiculosDisponibles();
                                System.out.print(oro+negrita+"Seleccione el vehículo (por índice): "+reset);
                                int vehiculoIdxVenta = scanner.nextInt() - 1;
                                scanner.nextLine();

                                if (vehiculoIdxVenta < 0 || vehiculoIdxVenta >= empleado.getVehiculos().size()) {
                                    System.out.println(oro+negrita+"Índice de vehículo inválido."+reset);
                                    break;
                                }

                                Vehiculo vehiculoVenta = empleado.getVehiculos().get(vehiculoIdxVenta);

                                double precio = leerDoubleValido(scanner, oro+negrita+"Ingrese el precio de venta: "+reset);

                                empleado.venderVehiculo(clienteVenta, vehiculoVenta, precio, sistemaAutenticacion);
                                break;

                                case 5:
                                empleado.mostrarVehiculosDisponibles();
                                break;

                                case 6:
                                empleado.mostrarClientes();
                                break;

                                case 7:
                                empleado.mostrarTransacciones();
                                break;

                                case 8:
                                salirMenuUser = true;
                                break;

                                default:
                                System.out.println(rojo+negrita+"Opcion no valida."+reset);

                                
                            }
                        }
                    } else if(user != null && user instanceof Administrador){
                        while(!salirMenuUser){
                            user.mostrarMenu();
                            //1. Reporte de negocios
                            //2. Gestionar empleado
                            //3. Bloquear empleado
                            //4. Salir
                                //Seleccione una opción:
                                int opcionMenuAdmin = leerEnteroValido(scanner, morado+negrita+"Seleccione una opcion: "+reset);
                            switch(opcionMenuAdmin){
                                case 1:
                                empleado.mostrarTransacciones();
                                break;
                                
                                case 2:
                                administrador.gestionarEmpleado(sistemaAutenticacion);
                                break;

                                case 3:
                                administrador.bloquearEmpleado(sistemaAutenticacion);

                                case 4:
                                salirMenuUser = true;
                                break;

                                default:
                                System.out.println(rojo+negrita+"Opcion no valida."+reset);
                            }
                        }
                    }    
                    break;
                case 3:
                    System.out.println(azul+negrita+"Has seleccionado recuperar la contraseña de un usuario!"+reset);
                    String nombreRecuperar = leerTextoValido(scanner, azul+negrita+"Nombre del usuario: "+reset);
                    sistemaAutenticacion.recuperarContraseña(nombreRecuperar);
                    break;
                case 4:
                    System.out.println(verde+negrita+"¡Hasta luego!"+reset);
                    salir = true;
                    break;
                default:
                    System.out.println(rojo+negrita+"Opción no válida."+reset);
            }
        }
        scanner.close();
    }



    ///Metodos de optimizacion del scanner
    public static int leerEnteroValido(Scanner scanner, String mensaje) {
        String reset = "\u001B[0m";
        String negrita = "\u001B[1m";
        String rojo = "\u001B[31m";
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(rojo+negrita+"Dato inválido. Por favor, ingrese un número entero."+reset);
            }
        }
    }

    public static double leerDoubleValido(Scanner scanner, String mensaje) {
        String reset = "\u001B[0m";
        String negrita = "\u001B[1m";
        String rojo = "\u001B[31m";
        while (true) {
            try {
                System.out.print(mensaje);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(rojo+negrita+"Dato inválido. Por favor, ingrese un número decimal."+reset);
            }
        }
    }

    public static boolean leerBooleanValido(Scanner scanner, String mensaje) {
        while (true) {
            String reset = "\u001B[0m";
            String negrita = "\u001B[1m";
            String rojo = "\u001B[31m";
            System.out.print(mensaje + " (Si/No): ");
            String entrada = scanner.nextLine().trim().toLowerCase();
            if (entrada.equalsIgnoreCase("Si")) {
                return true;
            } else if (entrada.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.out.println(rojo+negrita+"Dato inválido. Por favor, ingrese 'si' o 'no'."+reset);
            }
        }
    }

    public static String leerTextoValido(Scanner scanner, String mensaje) {
        String texto;
        String reset = "\u001B[0m";
        String negrita = "\u001B[1m";
        String rojo = "\u001B[31m";
        while (true) {
            System.out.print(mensaje);
            texto = scanner.nextLine().trim(); // Eliminar espacios
            if (!texto.isEmpty()) {
                break;
            } else {
                System.out.println(rojo+negrita+"Dato inválido. Por favor, ingrese un valor."+reset);
            }
        }
        return texto;
    }
}
