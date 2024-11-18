package co.edu.uniquindio.poo;


import java.util.LinkedList;
import java.util.Scanner;

public class SistemaAutenticacion {
    private LinkedList<Usuario> usuarios = new LinkedList<>();

    String azul = "\u001B[34m";
    String reset = "\u001B[0m";
    String negrita = "\u001B[1m";
    String rojo = "\u001B[31m";
    String verde = "\u001B[32m";
    String oro = "\u001B[33m";

    public SistemaAutenticacion() {
        usuarios = new LinkedList<>();
    }

    public LinkedList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    

    public void registrarUsuario(String nombreUsuario, String contraseña, String preguntaSeguridad, String respuestaSeguridad, String tipoUsuario) {
        if (tipoUsuario.equalsIgnoreCase("Administrador")) {
            usuarios.add(new Administrador(nombreUsuario, contraseña, preguntaSeguridad, respuestaSeguridad));
        } else if (tipoUsuario.equalsIgnoreCase("Empleado")) {
            usuarios.add(new Empleado(nombreUsuario, contraseña, preguntaSeguridad, respuestaSeguridad));
        } else {
            System.out.println(rojo+negrita+"Tipo de usuario no válido. Intente nuevamente."+reset);
            return;
        }
        System.out.println(verde+negrita+"Usuario registrado con éxito como " + tipoUsuario + "."+reset);
    }

    public Usuario iniciarSesion(String nombreUsuario, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.verificarContraseña(contraseña)) {
                System.out.println(oro+negrita+"Inicio de sesión exitoso. Bienvenido, " + usuario.getNombreUsuario() + "."+reset);
                return usuario;
            }
        }
        System.out.println(rojo+negrita+"Nombre de usuario o contraseña incorrectos."+reset);
        return null;
    }

    public void recuperarContraseña(String nombreUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println(azul+negrita+"Pregunta de seguridad: " + usuario.getPreguntaSeguridad()+reset);
                System.out.print(azul+negrita+"Respuesta: "+reset);
                String respuesta = scanner.nextLine();

                if (usuario.verificarRespuestaSeguridad(respuesta)) {
                    System.out.print(azul+negrita+"Introduce la nueva contraseña: "+reset);
                    String nuevaContraseña = scanner.nextLine();
                    usuario.setContraseña(nuevaContraseña);
                    System.out.println(verde+negrita+"Contraseña actualizada con éxito."+reset);
                } else {
                    System.out.println(rojo+negrita+"Respuesta incorrecta."+reset);
                }
                return;
            }
        }
        System.out.println(rojo+negrita+"Usuario no encontrado."+reset);
    }
    

    

    

    

    
}
