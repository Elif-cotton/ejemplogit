
package ejemplogit;

import Entidades.Gato;

/**
 *
 * @author javer
 */
public class EjemploGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato miGato = new Gato("Whiskers", 3, 4.5, "Mediano");

        System.out.println("Nombre del gato: " + miGato.getNombre());
        System.out.println("Edad del gato: " + miGato.getEdad());
        System.out.println("Peso del gato: " + miGato.getPeso());
        System.out.println("Tamaño del gato: " + miGato.getTamaño());

        miGato.maullar();
        miGato.comer();
    }
    
}
