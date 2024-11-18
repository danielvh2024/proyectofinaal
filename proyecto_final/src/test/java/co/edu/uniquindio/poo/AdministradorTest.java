/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AdministradorTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */

    @Test
    public void testGestionarEmpleado_CambiarNombre() {
    // Preparamos los datos de prueba
    SistemaAutenticacion sistema = new SistemaAutenticacion();
    Administrador administrador = new Administrador("admin", "adminPass", "Pregunta", "Respuesta");
    Empleado empleado = new Empleado("empleado1", "pass123", "Pregunta", "Respuesta");
    sistema.registrarUsuario(empleado);
    administrador.gestionarEmpleado(sistema);
    String nombreEsperado = "nuevoNombre";
    assertEquals("El nombre del empleado debe ser actualizado.", nombreEsperado, empleado.getNombreUsuario());
    }

    @Test
public void testGestionarEmpleado_AsignarSalario() {
    // Preparamos los datos de prueba
    SistemaAutenticacion sistema = new SistemaAutenticacion();
    Administrador administrador = new Administrador("admin", "adminPass", "Pregunta", "Respuesta");
    Empleado empleado = new Empleado("empleado1", "pass123", "Pregunta", "Respuesta");
    sistema.registrarUsuario(empleado);   
    administrador.gestionarEmpleado(sistema);   
    double salarioEsperado = 1500.00;
    assertEquals("El salario del empleado debe ser asignado correctamente.", salarioEsperado, empleado.getSalario(), 0.01);
    }
}