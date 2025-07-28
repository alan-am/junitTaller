import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SistemasCitasTest {
    @Test
    void testRegistrarPaciente() {
        Paciente paciente = new Paciente("09334258172", "Juan Perez", "vitipro@gmail.com");
        
    }

    @Test
    void testRegistrarResulado() {
        String cedulaPaciente = "";
        String tipoExamen = "";
        String resultado = "";

        SistemaCitas sistemaCitas = new SistemaCitas();

        assertEquals("No se añade examen", sistemaCitas.registrarResultado(cedulaPaciente, tipoExamen, resultado));
    }

}
