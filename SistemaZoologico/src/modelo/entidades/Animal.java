/**
 *
 * @author MOA
 */

package modelo.entidades;

public class Animal {
    private String especie;
    private String habitat;
    private int edad;

    // Constructor, Getters y Setters
    public Animal(String especie, String habitat, int edad) {
        this.especie = especie;
        this.habitat = habitat;
        this.edad = edad;
    }

    public Animal(String especie, int edad, String habitat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}
