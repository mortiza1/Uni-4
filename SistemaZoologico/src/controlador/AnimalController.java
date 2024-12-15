/**
 *
 * @author MOA
 */

package controlador;

import modelo.entidades.Animal;
import modelo.repositorios.AnimalRepository;

public class AnimalController {
      private AnimalRepository repo = new AnimalRepository();

    public boolean agregarAnimal(String especie, int edad, String habitat) {
        if (especie == null || especie.isEmpty() || edad <= 0 || habitat == null || habitat.isEmpty()) {
            return false;
        }
        Animal a = new Animal(especie, edad, habitat);
        repo.agregar(a);
        return true;
    }
    public String listarAnimales() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : repo.listar()) {
            sb.append(a.getEspecie()).append(", ").append(a.getEdad())
              .append(" años, ").append(a.getHabitat()).append("\n");
        }
        return sb.toString();
    }
}
