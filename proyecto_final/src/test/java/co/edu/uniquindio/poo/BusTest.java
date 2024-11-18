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
public class BusTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }

    @Test
    public void testToString() {
        Bus bus = new Bus("Mercedes", "Nuevo", "Sprinter", 120, "Diesel", "Automático", 40, 2, true, true, 6, true, 2, 2);
        String expectedString = "\u001B[93m\u001B[1mBus con las siguientes caracteristicas: \n\u001B[0m"
            + "\u001B[93mMarca: Mercedes, Usado o Nuevo: Nuevo, Modelo: Sprinter, Velocidad Maxima: 120, Tipo de Combustible: Diesel, "
            + "Transmisión: Automático, tiene una capacidad de 40 pasajeros, tiene 2 puertas, tiene aire acondicionado?: true, "
            + "tiene camara de reversa?: true, tiene 6 bolsas de aire, tiene frenos ABS?: true\u001B[0m";

        assertEquals("El método toString debe devolver la cadena esperada.", expectedString, bus.toString());
    }

    @Test
    public void testGettersYSetters() {
        // Creamos el objeto Bus
        Bus bus = new Bus("Mercedes", "Nuevo", "Sprinter", 120, "Diesel", "Automático", 40, 2, true, true, 6, true, 2, 2);
        bus.setNumeroPasajeros(45);
        bus.setNumeroPuertas(3);
        bus.setAireAcondicionado(false);
        bus.setCamaraReversa(false);
        bus.setNumBolsasAire(8);
        bus.setABS(false);
        bus.setNumEjes(3);
        bus.setSalidasEmergencia(3);

        assertEquals("El número de pasajeros debe ser 45.", 45, bus.getNumeroPasajeros());
        assertEquals("El número de puertas debe ser 3.", 3, bus.getNumeroPuertas());
        assertFalse("No debe tener aire acondicionado.", bus.isAireAcondicionado());
        assertFalse("No debe tener cámara de reversa.", bus.isCamaraReversa());
        assertEquals("Debe tener 8 bolsas de aire.", 8, bus.getNumBolsasAire());
        assertFalse("No debe tener frenos ABS.", bus.isABS());
        assertEquals("Debe tener 3 ejes.", 3, bus.getNumEjes());
        assertEquals("Debe tener 3 salidas de emergencia.", 3, bus.getSalidasEmergencia());
    }
}