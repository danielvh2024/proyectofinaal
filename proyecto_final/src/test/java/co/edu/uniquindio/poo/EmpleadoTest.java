/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EmpleadoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */

    private Empleado empleado;
    
    @Test
    void testActualizarSalario() {
        empleado.setSalario(3000.0);
        assertEquals(3000.0, empleado.getSalario());
    }

    @Test
    public void testVenderVehiculo() {
        Empleado empleado = new Empleado("admin", "password123", "¿Cuál es tu color favorito?", "Rojo");
        Cliente cliente = new Cliente("Juan Pérez", 30, "Calle 123", "1234567890");
        Vehiculo vehiculo = new Sedan("Toyota", "Nuevo", "Corolla", 180, "Gasolina", "Automático", 5, 4, true, true, 120, 6, true, true);

        empleado.registrarSedan("Toyota", "Nuevo", "Corolla", 180, "Gasolina", "Automático", 5, 4, true, true, 120, 6, true, true);

        empleado.venderVehiculo(cliente, vehiculo, 20000, null);

        assertFalse("El vehículo debe estar marcado como no disponible tras la venta.", vehiculo.isDisponible());
    }

    @Test
    public void testMostrarVehiculosDisponibles() {
        Empleado empleado = new Empleado("admin", "password123", "¿Cuál es tu color favorito?", "Rojo");
        empleado.registrarSedan("Toyota", "Nuevo", "Corolla", 180, "Gasolina", "Automático", 5, 4, true, true, 120, 6, true, true);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);


        empleado.mostrarVehiculosDisponibles();

        assertTrue("El mensaje de vehículos disponibles debe aparecer.", output.toString().contains("Vehículos disponibles"));
    }

    @Test
    public void testMostrarTransacciones() {
        Empleado empleado = new Empleado("admin", "password123", "¿Cuál es tu color favorito?", "Rojo");
        Cliente cliente = new Cliente("Juan Pérez", 30, "Calle 123", "1234567890");
        Vehiculo vehiculo = new Sedan("Toyota", "Nuevo", "Corolla", 180, "Gasolina", "Automático", 5, 4, true, true, 120, 6, true, true);

        empleado.registrarSedan("Toyota", "Nuevo", "Corolla", 180, "Gasolina", "Automático", 5, 4, true, true, 120, 6, true, true);

        empleado.venderVehiculo(cliente, vehiculo, 20000, null);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        empleado.mostrarTransacciones();

        assertTrue("El mensaje de transacciones debe aparecer.", output.toString().contains("Ventas realizadas"));
    }

    
}