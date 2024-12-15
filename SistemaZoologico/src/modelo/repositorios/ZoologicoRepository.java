/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.repositorios;

/**
 *
 * @author MOA
 */

import modelo.entidades.Zoologico;
import java.util.ArrayList;
import java.util.List;

public class ZoologicoRepository {
    private final List<Zoologico> zoologicos = new ArrayList<>();

    public void agregar(Zoologico z) {
        zoologicos.add(z);
    }

    /**
     *
     * @return
     */
    public List<Zoologico> listar() {
        return zoologicos;
    }

    public void eliminar(Zoologico z) {
        zoologicos.remove(z);
    }
}
