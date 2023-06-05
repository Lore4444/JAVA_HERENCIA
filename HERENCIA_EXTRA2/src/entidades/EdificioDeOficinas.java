/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class EdificioDeOficinas extends Edificio {

    //ATRIBUTOS
    private int numeroOficinas, personasPorOficina, numeroPisos, personasPorPiso, personasEdificio;
    private String nombre;

    //CONSTRUCTORES
    public EdificioDeOficinas() {
    }

    //si voy a utilizar el metodo crearOficina usar el siguiente constructor
    //public EdificioDeOficinas(double ancho, double largo, double alto) {
    //super(ancho, largo, alto);

    public EdificioDeOficinas(int numeroOficinas, int personasPorOficina, int numeroPisos, String nombre, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
        this.nombre = nombre;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public int getPersonasPorPiso() {
        return personasPorPiso;
    }

    public void setPersonasPorPiso(int personasPorPiso) {
        this.personasPorPiso = personasPorPiso;
    }

    public int getPersonasEdificio() {
        return personasEdificio;
    }

    public void setPersonasEdificio(int personasEdificio) {
        this.personasEdificio = personasEdificio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
   

    //METODOS
    @Override
    public double calcularSuperficie() {
        double superficie = numeroPisos * (largo * ancho);
        return superficie;
    }

    @Override
    public double calcularVolumen() {
        double volumen = largo * ancho * alto;
        return volumen;
    }

//    public void cantPersonas() {
//
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese la cantidad de pisos que posee el Edificio");
//        numeroPisos = leer.nextInt();
//        System.out.println("Ingrese la cantidad de oficinas que hay en cada piso del Edificio");
//        numeroOficinas = leer.nextInt();
//        System.out.println("Ingrese la cantidad de personas que trabajan en cada oficina");
//        personasPorOficina = leer.nextInt();
//        System.out.println(" ");
//        personasPorPiso = numeroOficinas * personasPorOficina;
//        personasEdificio = personasPorPiso * numeroPisos;
//        System.out.println(" ");
//        System.out.println("El edifcio tiene " + numeroPisos + " pisos , en cada uno de ellos hay " + numeroOficinas + " oficinas");
//        System.out.println("En cada piso pueden trabajar " + personasPorPiso + " personas, y en todo el Edifcio "
//                + "pueden trabajar "+ personasEdificio + " personas");
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //"| %-23s | %-18s | %-20s | %-18s |", 
        sb.append(String.format("| %-19s | %-20s | %-20s | %-16s |", nombre,numeroOficinas, 
                personasPorOficina, numeroPisos));
        sb.append("\n----------------------+----------------------+----------------------+" +
                "-------------------");
        
        
             
        return sb.toString();
    }

  
    

}
