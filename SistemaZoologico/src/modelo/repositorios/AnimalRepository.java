/**
 *
 * @author MOA
 */

package modelo.repositorios;

import modelo.entidades.Animal;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
     private List<Animal> animales = new ArrayList<>();

    // Agregar animal
    public void agregar(Animal a) {
        animales.add(a);
    }

    // Lista animales
    public List<Animal> listar() {
        return animales;
    }

    // Eliminar animal
    public void eliminar(Animal a) {
        animales.remove(a);
    }
}
