import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PacienteTest {
    @Test
    void testCreacionPersona(){
        //datos necesarios
        String cedula = "0931978920";
        String nombre = "Alan";
        String correo = "alan@gmail.com";
        //Creacion del objeto
        Paciente paciente_resultado = new Paciente(cedula, nombre, correo);
        //uso de assert
        assertNotNull(paciente_resultado);
    }

    @Test
    void testCreacionCedulaInvalida(){
        //datos necesarios
        String cedula = "";
        String nombre = "Alan";
        String correo = "alan@gmail.com";
       //uso de assert
        assertThrows(IllegalArgumentException.class, () -> {
         new Paciente(cedula, nombre, correo);
        });
    }
}
