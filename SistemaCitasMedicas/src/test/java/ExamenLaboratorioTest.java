import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExamenLaboratorioTest {
    @Test
    void testRegistrarResultado(){
        Paciente paciente = new Paciente("0000000000", "Roberto Bravo", "robertobr@gmail.com");
        ExamenLaboratorio examen = new ExamenLaboratorio(paciente, "Halter de corazon");

        examen.registrarResultado("Positivo");

        String esperado = "Examen: Halter de corazon - Paciente: Roberto Bravo (0000000000) - Resultado: Positivo";
        assertEquals(esperado, examen.toString());
    }


    @Test
    void testToString(){

        Paciente paciente = new Paciente("0000000001", "Alan Aguilar", "alan@gmail.com");
        ExamenLaboratorio examen = new ExamenLaboratorio(paciente, "Sangre");
        String salida = examen.toString();
        assertTrue(salida.contains("Pendiente"));
    }


}
