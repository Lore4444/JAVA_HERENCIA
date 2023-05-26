/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. 
 */
package herencia1;

import Animal.Animal;
import Animal.Caballo;
import Animal.Gato;
import Animal.Perro;

/**
 *
 * @author lorena
 */
public class HERENCIA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaracion de los objetos perro, gato y caballo
        Animal perro1 = new Perro("Stich", "Carnivoro", "Doberman", 15);
        Animal perro2 = new Perro("Teddy", "Croquetas", "Chihuahua", 10);
        Animal gato = new Gato("Pelusa", "Galletas", "Siames", 15);
        Animal caballo = new Caballo("Spark", "Pasto", "Fino", 25);

        perro1.alimentarse();
        perro2.alimentarse();
        gato.alimentarse();
        caballo.alimentarse();
    }

}

