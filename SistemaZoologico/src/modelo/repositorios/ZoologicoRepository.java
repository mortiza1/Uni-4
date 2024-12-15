/**
 *
 * @author MOA
 */

package modelo.repositorios;

import modelo.entidades.Zoologico;
import java.util.ArrayList;
import java.util.List;

public class ZoologicoRepository {
    private final List<Zoologico> zoologicos = new ArrayList<>();

    // Agregar zoologico
    public void agregar(Zoologico z) {
        zoologicos.add(z);
    }

  // Lista animales*/
    public List<Zoologico> listar() {
        return zoologicos;
    }

    // Eliminar zoologico
    public void eliminar(Zoologico z) {
        zoologicos.remove(z);
    }
}
