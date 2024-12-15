
package modelo.entidades;
/**
 *
 * @author MOA
 */
public class Cuidador {
    private String nombre;
    private String especialidad;
    private int añosExperiencia;

    // Constructor
    public Cuidador(String nombre, String especialidad, int añosExperiencia){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public int getAñosExperiencia() { return añosExperiencia; }
    public void setAñosExperiencia(int añosExperiencia) { this.añosExperiencia = añosExperiencia; }
}

