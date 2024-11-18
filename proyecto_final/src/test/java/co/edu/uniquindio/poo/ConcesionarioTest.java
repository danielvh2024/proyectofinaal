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

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ConcesionarioTest {
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
    public void testMostrarMenu() {
        Concesionario concesionario = new Concesionario("AutoCenter");

        String expectedMenu = "\u001B[32m\u001B[1m---Consesionario AutoCenter---\n\n1.\u001B[0m Registrar usuario\n\u001B[32m\u001B[1m2.\u001B[0m Iniciar sesión\n\u001B[32m\u001B[1m3\u001B[0m. Recuperar contraseña\n\u001B[32m\u001B[1m4\u001B[0m. Salir";

        assertEquals("El menú mostrado debe coincidir con el formato esperado.", expectedMenu, concesionario.mostrarMenu());
    }

    @Test
    public void testMostrarMensaje() {
        // Creamos el objeto Concesionario
        Concesionario concesionario = new Concesionario("AutoCenter");

        // Configuramos para capturar la salida a la consola
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(output);
        System.setOut(printStream);

        // Llamamos al método mostrarMensaje
        Concesionario.mostrarMensaje("Bienvenido al concesionario");

        // Verificamos que el mensaje se haya impreso correctamente
        String expectedMessage = "Bienvenido al concesionario";
        assertTrue("El mensaje debe ser mostrado en la consola.", output.toString().contains(expectedMessage));

        // Restauramos la salida estándar
        System.setOut(System.out);
    }
}