public class Medico {
    private String nombre;
    private String especialidad;

    public Medico(String nombre, String especialidad) {
        if (nombre.equals("") || nombre==null) {
            throw new IllegalArgumentException("No se permite nombres vacíos");
        }
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }

    @Override
    public String toString() {
        return nombre + " - " + especialidad;
    }
}