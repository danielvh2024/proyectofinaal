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
public class ClienteTest {
    @Test
    public void testGettersYSetters() {
        // Creamos el objeto Cliente
        Cliente cliente = new Cliente("Juan Perez", 30, "Calle Falsa 123", "555-1234");

        // Usamos los setters para cambiar los valores de los atributos
        cliente.setNombre("Maria Gomez");
        cliente.setEdad(35);
        cliente.setDireccion("Avenida Siempre Viva 742");
        cliente.setTelefono("555-5678");

        // Verificamos que los valores se hayan actualizado correctamente
        assertEquals("El nombre debe ser Maria Gomez.", "Maria Gomez", cliente.getNombre());
        assertEquals("La edad debe ser 35.", 35, cliente.getEdad());
        assertEquals("La dirección debe ser Avenida Siempre Viva 742.", "Avenida Siempre Viva 742", cliente.getDireccion());
        assertEquals("El teléfono debe ser 555-5678.", "555-5678", cliente.getTelefono());
    }

    @Test
    public void testToString() {
        // Creamos el objeto Cliente
        Cliente cliente = new Cliente("Juan Perez", 30, "Calle Falsa 123", "555-1234");

        // La cadena esperada para el toString
        String expectedString = "\u001B[93m\u001B[1mCliente \u001B[0m\u001B[93mJuan Perez, \u001B[93m\u001B[1medad: \u001B[0m\u001B[93m30 años, \u001B[93m\u001B[1mdireccion: \u001B[0m\u001B[93mCalle Falsa 123, \u001B[93m\u001B[1mtelefono: \u001B[0m\u001B[93m555-1234\u001B[0m";

        // Verificamos que el toString devuelva la cadena correcta
        assertEquals("El método toString debe devolver la cadena esperada.", expectedString, cliente.toString());
    }
}