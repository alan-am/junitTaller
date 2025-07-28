import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class CitaMedicaTest {
    @Test
    void testToString() {
        Paciente paciente = new Paciente("09334258172","Juan Perez","vitipro@gmail.com");
        Medico medico = new Medico("Angela Lopez", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2024, 6, 10, 15, 30);
        CitaMedica cita = new CitaMedica(paciente, medico, fechaHora);

        String resultado = cita.toString();
        String esperado = "Cita con Angela Lopez - Cardiología para Juan Perez (09571834) en 2024-06-10T15:30 [Agendada]";
        assertEquals(esperado, resultado);
    }

    @Test
    void testSetEstadoNull() {
        Paciente paciente = new Paciente("09334258172","Juan Perez","vitipro@gmail.com");
        Medico medico = new Medico("Angela Lopez", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2024, 6, 10, 15, 30);
        CitaMedica cita = new CitaMedica(paciente, medico, fechaHora);

        assertThrows(IllegalArgumentException.class, () -> {
            cita.setEstado(null);
        });
    }
}
