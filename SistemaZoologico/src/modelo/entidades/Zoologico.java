

package modelo.entidades;

/**
 *
 * @author MOA
 */
public class Zoologico {
    private String nombre;
    private String ubicacion;
    private int nDeAnimales;

    // Constructor, Getters y Setters
    public Zoologico(String nombre, String ubicacion, int nDeAnimales) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.nDeAnimales = nDeAnimales;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public int getNDeAnimales() { return nDeAnimales; }
    public void setNDeAnimales(int nDeAnimales) { this.nDeAnimales = nDeAnimales; }
}
    

