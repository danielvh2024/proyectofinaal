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
public class VentaTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */

    @Test
    public void testToString() {
        Empleado empleado = new Empleado("juan123", "pass", "¿Tu mascota favorita?", "Gato");
        Cliente cliente = new Cliente("Carlos Gómez", 45, "Calle 10", "123456789");
        Vehiculo vehiculo = new Sedan("Toyota", "Nuevo", "Corolla", 180, "Gasolina", "Automático", 5, 4, true, true, 120, 6, true, true);
        
        double precio = 25000.0;

        Venta venta = new Venta(empleado, cliente, vehiculo, precio);

        String expectedString = "\u001B[33mVenta realizada por juan123\nCliente: Carlos Gómez\nVehículo: Toyota Corolla\nLiquidada a 25000.0COP\u001B[0m";

        assertEquals("El método toString debe generar la salida esperada.", expectedString, venta.toString());
    }

    
}