import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MedicoTest {
    @Test
    void testMedico1() {
        String nombre = new String("alan");
        String especialidad = new String("cardiólogo");

        Medico medico = new Medico(nombre, especialidad);

        assertEquals("alan", medico.getNombre());
        assertEquals("cardiólogo", medico.getEspecialidad());
    }

    @Test
    void testMedico2() {
        String nombre = "";
        String especialidad = new String("cardiólogo");

        assertThrows(IllegalArgumentException.class, () -> {
            new Medico(nombre, especialidad);
        });
    }
}
