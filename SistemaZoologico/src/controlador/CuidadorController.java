/**
 *
 * @author MOA
 */

package controlador;

import modelo.entidades.Cuidador;
import modelo.repositorios.CuidadorRepository;

public class CuidadorController {
    private CuidadorRepository repo = new CuidadorRepository();

    // Método para agregar cuidador
    public boolean agregarCuidador(String nombre, String especialidad, int añosExperiencia) {
        if (nombre == null || nombre.isEmpty() || especialidad == null || añosExperiencia <= 0) {
            return false;
            // Datos inválidos
        }
        Cuidador c = new Cuidador(nombre, especialidad, añosExperiencia);
        repo.agregar(c);
        return true;
    }
    // Método para listar cuidadores
    public String listarCuidadores() {
        StringBuilder sb = new StringBuilder();
        for (Cuidador c : repo.listar()) {
            sb.append(c.getNombre()).append(", ").append(c.getEspecialidad()).append(", ")
              .append(c.getAñosExperiencia()).append(" años de experiencia\n");
        }
        return sb.toString(); // Retorna un listado formateado
    }

    // Método para eliminar un cuidador
    public boolean eliminarCuidador(Cuidador c) {
        return repo.listar().contains(cuidador) && repo.eliminar(cuidador);
    }    
        
}
