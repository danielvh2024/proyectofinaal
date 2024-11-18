package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Scanner;

public class Administrador extends Usuario {

    String negrita = "\u001B[1m";
    String reset = "\u001B[0m";
    String morado = "\u001B[35m";
    String rojo = "\u001B[91m";
    String verde = "\u001B[92m";
    public Administrador(String nombreUsuario, String contraseña, String preguntaSeguridad, String respuestaSeguridad) {
        super(nombreUsuario, contraseña, preguntaSeguridad, respuestaSeguridad);
    }

    @Override
    public void mostrarMenu() {
        String negrita = "\u001B[1m";
        String reset = "\u001B[0m";
        String morado = "\u001B[35m";
            System.out.println(morado+negrita+"\n--- Menú de Administrador ---"+reset);                 
            System.out.println(morado+negrita+"1."+reset+ "Reporte de negocios");
            System.out.println(morado+negrita+"2."+reset+ "Gestionar empleado");
            System.out.println(morado+negrita+"3."+reset+ "Bloquear empleado");
            System.out.println(morado+negrita+"4."+reset+ "Salir");
    }

    public void gestionarEmpleado(SistemaAutenticacion sistema) {
        LinkedList<Empleado> empleados = new LinkedList<>();
        for (Usuario usuario : sistema.getUsuarios()) {
            if (usuario instanceof Empleado) {
                empleados.add((Empleado) usuario);
            }
        }

        if (empleados.isEmpty()) {
            System.out.println(rojo+negrita+"No hay empleados registrados."+reset);
            return;
        }

        System.out.println(morado+negrita+"Lista de empleados:"+reset);
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            System.out.println(i + ". " + empleado.getNombreUsuario() +
                    morado+negrita+" - Salario: $" + (empleado.getSalario() != null ? empleado.getSalario() : "Sin asignar"+reset));
        }

        System.out.print(morado+negrita+"Seleccione el índice del empleado a gestionar: "+reset);
        Scanner scanner = new Scanner(System.in);
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice < 0 || indice >= empleados.size()) {
            System.out.println(rojo+negrita+"Índice inválido."+reset);
            return;
        }

        Empleado empleadoSeleccionado = empleados.get(indice);

        // Opciones de gestión
        System.out.println(morado+negrita+"\nOpciones de gestión:"+reset);
        System.out.println(morado+negrita+"1."+reset+ "Cambiar nombre"+reset);
        System.out.println(morado+negrita+"2."+reset+ "Cambiar contraseña"+reset);
        System.out.println(morado+negrita+"3."+reset+ "Asignar salario"+reset);
        System.out.print(morado+negrita+"Seleccione una opción: "+reset);
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                String nuevoNombre = App.leerTextoValido(scanner, morado+negrita+"Nuevo nombre: "+reset);
                empleadoSeleccionado.setNombreUsuario(nuevoNombre);
                System.out.println(verde+negrita+"Nombre actualizado con éxito."+reset);
                break;
            case 2:
                String nuevaContraseña = App.leerTextoValido(scanner, morado+negrita+"Nueva contraseña: "+reset);;
                empleadoSeleccionado.setContraseña(nuevaContraseña);
                System.out.println(verde+negrita+"Contraseña actualizada con éxito."+reset);
                break;
            case 3:
            double nuevoSalario = App.leerDoubleValido(scanner, morado+negrita+"Nuevo salario: "+reset);
                empleadoSeleccionado.setSalario(nuevoSalario);
                System.out.println(verde+negrita+"Salario asignado con éxito."+reset);
                break;
            default:
                System.out.println(rojo+negrita+"Opción inválida."+reset);
                break;
        }
    }
    
    public void bloquearEmpleado(SistemaAutenticacion sistema) {
        LinkedList<Empleado> empleados = new LinkedList<>();
        for (Usuario usuario : sistema.getUsuarios()) {
            if (usuario instanceof Empleado) {
                empleados.add((Empleado) usuario);
            }
        }
    
        if (empleados.isEmpty()) {
            System.out.println(rojo+negrita+"No hay empleados registrados."+reset);
            return;
        }
    
        // Mostrar lista de empleados
        System.out.println(morado+negrita+"Lista de empleados:"+reset);
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            System.out.println(i + ". " + empleado.getNombreUsuario());
        }
    
        System.out.print(morado+negrita+"Seleccione el índice del empleado a bloquear: "+reset);
        Scanner scanner = new Scanner(System.in);
        int indice = scanner.nextInt();
        scanner.nextLine();
    
        if (indice < 0 || indice >= empleados.size()) {
            System.out.println(rojo+negrita+"Índice inválido."+reset);
            return;
        }

        Empleado empleadoBloqueado = empleados.get(indice);
        sistema.getUsuarios().remove(empleadoBloqueado);
        System.out.println(verde+negrita+"Empleado bloqueado (eliminado) con éxito!."+reset);
}    
}

