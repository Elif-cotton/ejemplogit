
package Entidades;

/**
 *
 * @author javer
 */
public class Gato {
    
    private String nombre; // Atributo privado
    private int edad;     // Atributo privado
    private double peso;  // Atributo privado
    private String tamaño; // Atributo privado

    public Gato() {
    }

    public Gato(String nombre, int edad, double peso, String tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
}
