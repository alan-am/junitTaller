import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SistemasCitasTest {
    @Test
    void testRegistrarPaciente() {
        Paciente paciente = new Paciente("09334258172", "Juan Perez", "vitipro@gmail.com");
        
    }

    @Test
    void testSolicitarExamenValido(){
        //datos
        SistemaCitas sistemaCitas = new SistemaCitas();
        sistemaCitas.registrarPaciente("099999999", "Victor Bravo", "skibidi@gmail.com");
        sistemaCitas.solicitarExamen("099999999", null);
        assertEquals(sistemaCitas.getExamenes().size(), 1);
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

