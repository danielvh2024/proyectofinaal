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
public class CamionetaTest {

    /**
     * Rigorous Test :-)
     */

    private Camioneta camioneta;


    @Test
    void testGetters() {
        assertEquals("Toyota", camioneta.getMarca());
        assertEquals("Nuevo", camioneta.getUsadoONuevo());
        assertEquals("Hilux", camioneta.getModelo());
        assertEquals(180, camioneta.getVelocidadMaxima());
        assertEquals("Diesel", camioneta.getTipoCombustible());
        assertEquals("Automático", camioneta.getAutomaticoOManual());
        assertEquals(5, camioneta.getNumeroPasajeros());
        assertEquals(4, camioneta.getNumeroPuertas());
        assertTrue(camioneta.isAireAcondicionado());
        assertTrue(camioneta.isCamaraReversa());
        assertEquals(150, camioneta.getVelocidadCrucero());
        assertEquals(6, camioneta.getNumBolsasAire());
        assertTrue(camioneta.isABS());
        assertTrue(camioneta.isSensorColision());
        assertTrue(camioneta.isEs4x4());
    }

    @Test
    void testToString() {
            String expected = "\u001B[1m\u001B[38;5;214mCamioneta con las siguientes caracteristicas:\n\u001B[0m\u001B[38;5;214m" +
                    "Marca: Toyota, usado o nuevo: Nuevo, modelo: Hilux, velocidad maxima: 180km/h, tipo de combustible: Diesel, transmision: Automático, " +
                    "numero de pasajeros: 5, numero de puertas: 4, tiene aire acondicionado?: true, tiene camara de reversa?: true, " +
                    "velocidad de crucero: 150km/h, numero de bolsas de aire6, tiene frenos ABS?: true, tiene sensor de colision?: true, es 4x4?: true\u001B[0m";
    
            assertEquals(expected, camioneta.toString());
        }
    }
