package co.edu.uniquindio.poo;

public abstract class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private String preguntaSeguridad;
    private String respuestaSeguridad;

    public Usuario(String nombreUsuario, String contraseña, String preguntaSeguridad, String respuestaSeguridad) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public boolean verificarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }

    public boolean verificarRespuestaSeguridad(String respuesta) {
        return this.respuestaSeguridad.equalsIgnoreCase(respuesta);
    }

    public void setContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    public abstract void mostrarMenu();
}
