/**
 *
 * @author MOA
 */

package modelo.repositorios;

import modelo.entidades.Cuidador;
import java.util.ArrayList;
import java.util.List;

public class CuidadorRepository {
    private final List<Cuidador> cuidadores = new ArrayList<>();
  
     // Agregar  cuidador
    public void agregar(Cuidador c) {
        cuidadores.add(c);
    }

    // Lista cuidadores
    public List<Cuidador> listar() {
        return cuidadores;
    }

    // Eliminar cuidador
    public void eliminar(Cuidador c) {
        cuidadores.remove(c);
    }
}
