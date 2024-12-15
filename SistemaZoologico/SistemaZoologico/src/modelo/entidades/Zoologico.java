
 */
package modelo.entidades;

/**
 *
 * @author MOA
 */
public class Zoologico {
    
    private String nombre;
    private String ubicacion;
    private int numeroDeAnimales;

    // Constructor, Getters y Setters
    public Zoologico(String nombre, String ubicacion, int numeroDeAnimales) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.numeroDeAnimales = numeroDeAnimales;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public int getNumeroDeAnimales() { return numeroDeAnimales; }
    public void setNumeroDeAnimales(int numeroDeAnimales) { this.numeroDeAnimales = numeroDeAnimales; }
}
    

