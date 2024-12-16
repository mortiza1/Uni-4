/**
 *
 * @author MOA
 */

package controlador;

import modelo.entidades.Zoologico;
import modelo.repositorios.ZoologicoRepository;

public class ZoologicoController {
    private ZoologicoRepository repo = new ZoologicoRepository();

     // Método para agregar Zoologico
    public boolean agregarZoologico(String nombre, String ubicacion, int nDeAnimales) {
        if (nombre == null || nombre.isEmpty() || nDeAnimales <= 0) {
            return false;
            // Datos inválidos
        }
        Zoologico z = new Zoologico(nombre, ubicacion, nDeAnimales);
        repo.agregar(z); // Se delega al repositorio
        return true; // Operación exitosa
    }
    // Método para listar cuidadores
    public String listarZoologicos() {
        StringBuilder sb = new StringBuilder();
        for (Zoologico z : repo.listar()) {
            sb.append(z.getNombre()).append(", ").append(z.getUbicacion())
              .append(", ").append(z.getNDeAnimales()).append("\n");
        }
        return sb.toString();
    }
}
    
}
