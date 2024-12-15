/**
 *
 * @author MOA
 */

package controlador;

import modelo.entidades.Cuidador;
import modelo.repositorios.CuidadorRepository;

public class CuidadorController {
    private  CuidadorRepository repo = new CuidadorRepository();

    public boolean agregarCuidador(String nombre, String especialidad, int añosExperiencia) {
        if (nombre == null || nombre.isEmpty() || especialidad == null || especialidad.isEmpty() || añosExperiencia <= 0) {
            return false;
        }
        Cuidador c = new Cuidador(nombre, especialidad, añosExperiencia);
        repo.agregar(c);
        return true;
}
public String listarCuidadores() {
    StringBuilder sb = new StringBuilder();
        for (Cuidador c : repo.listar()) {
            sb.append(c.getNombre()).append(", ").append(c.getEspecialidad())
              .append(", ").append(c.getAniosExperiencia()).append(" años de experiencia\n");
        }
        return sb.toString();
    }
}