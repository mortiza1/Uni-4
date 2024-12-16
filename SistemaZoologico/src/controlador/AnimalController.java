/**
 *
 * @author MOA
 */

package controlador;

import modelo.entidades.Animal;
import modelo.repositorios.AnimalRepository;

public class AnimalController {    
     private AnimalRepository repo = new AnimalRepository();

    // Método para agregar un animal
    public boolean agregarAnimal(String especie, int edad, String habitat) {
        if (especie == null || especie.isEmpty() || edad <= 0 || habitat == null || habitat.isEmpty()) {
            return false; 
            // Datos inválidos
        }
        Animal a = new Animal(especie, edad, habitat);
        repo.agregar(a); // Se delega al repositorio
        return true; // Operación exitosa
    }
    // Método para listar animales
    public String listarAnimales() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : repo.listar()) {
            sb.append(a.getEspecie()).append(", ").append(a.getEdad()).append(" años, ")
              .append(a.getHabitat()).append("\n");
        }
        return sb.toString(); // Retorna un listado formateado
    }

    // Método para eliminar un animal
    public boolean eliminarAnimal(Animal a) {
        return repo.listar().contains(animal) && repo.eliminar(animal);
    }
}
