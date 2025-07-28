import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    void testVerHistorial(){
        //datos 

    }
}

