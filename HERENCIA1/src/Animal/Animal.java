/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author lorena
 */
public class Animal {
    
    protected String nombre, alimento, raza;
    protected int edad;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }

    public void alimentarse() {
        System.out.println("Esta mascota se alimenta con :  " + this.alimento);
    }
}
    

