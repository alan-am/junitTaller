import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SistemasCitasTest {
    @Test
    void testRegistrarPaciente() {
        SistemaCitas sistema = new SistemaCitas();
        sistema.registrarPaciente("09334258172", "Juan Perez", "vitipro@gmail.com");

        Paciente paciente = sistema.buscarPaciente("09334258172");

        assertEquals("Juan Perez", paciente.getNombre());
        assertEquals("vitipro@gmail.com", paciente.getCorreo());
        
    }

    @Test
    void testSolicitarExamenValido(){
        //datos 

    }

    @Test
    void testRegistrarResultado(){
        //datos 

    }
@Test
void testVerHistorial() {
    SistemaCitas sistema = new SistemaCitas();
    ByteArrayOutputStream salida = new ByteArrayOutputStream();
    System.setOut(new PrintStream(salida));

    sistema.registrarPaciente("123", "Luis", "luis@correo.com");
    sistema.verHistorial("123");
    assertEquals("", salida.toString().trim(), "Debe estar vacío si no hay historial");

    salida.reset();

    sistema.registrarMedico("Dra. Ana", "Neurología");
    sistema.agendarCita("123", "Neurología", LocalDateTime.now());
    sistema.solicitarExamen("123", "Sangre");
    sistema.verHistorial("123");

    String out = salida.toString();
    assertTrue(out.contains("Luis"));
    assertTrue(out.contains("Neurología"));
    assertTrue(out.contains("Sangre"));
 }
}
