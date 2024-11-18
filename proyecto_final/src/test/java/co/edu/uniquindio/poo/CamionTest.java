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
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CamionTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    void testGetters() {
        assertEquals("Mercedes-Benz", camion.getMarca());
        assertEquals("Usado", camion.getUsadoONuevo());
        assertEquals("Actros", camion.getModelo());
        assertEquals(120, camion.getVelocidadMaxima());
        assertEquals("Diesel", camion.getTipoCombustible());
        assertEquals("Manual", camion.getAutomaticoOManual());
        assertEquals(20000, camion.getCapacidadCarga());
        assertTrue(camion.isAireAcondicionado());
        assertTrue(camion.isFrenosAire());
        assertEquals(3, camion.getNumEjes());
        assertTrue(camion.isABS());
    }

    @Test
    void testSetters() {
        camion.setCapacidadCarga(25000);
        assertEquals(25000, camion.getCapacidadCarga());

        camion.setAireAcondicionado(false);
        assertFalse(camion.isAireAcondicionado());

        camion.setFrenosAire(false);
        assertFalse(camion.isFrenosAire());

        camion.setNumEjes(4);
        assertEquals(4, camion.getNumEjes());

        camion.setABS(false);
        assertFalse(camion.isABS());
    }

    @Test
    void testToString() {
        String expected = "\u001B[93m\u001B[1mCamion con las siguientes caracteristicas: \n\u001B[0m\u001B[93m" +
                "Marca: Mercedes-Benz, usado o nuevo: Usado, modelo: Actros, velocidad maxima: 120km/h, tipo de combustible: Diesel, transmision: Manual, " +
                "Capacidad de carga: 20000Kg, tiene aire acondicionado?: true, tiene frenos de aire?: true, " +
                "numero de ejes: 3, tiene frenos ABS?: true\u001B[0m";

        assertEquals(expected, camion.toString());
    }
}