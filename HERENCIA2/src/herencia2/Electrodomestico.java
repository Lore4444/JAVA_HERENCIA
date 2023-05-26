/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Electrodomestico {
    
    

    Scanner consola = new Scanner(System.in);
    protected int precio, peso;
    protected String color;
    protected char letra;

    public Electrodomestico() {
        this.precio = 1000;
    }

    public Electrodomestico(int peso, String color, char letra) {
        this.precio = 1000;
        this.peso = peso;
        this.color = color;
        this.letra = letra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            this.letra = letra;
        } else {
            this.letra = 'F';
        }
    }

    public void comprobarColor(String color) {
        ArrayList<String> colores = new ArrayList<>();
        colores.add("blanco");
        colores.add("negro");
        colores.add("rojo");
        colores.add("azul");
        colores.add("gris");
        if (colores.contains(color)) {
            this.color = color;
        } else {
            this.color = "blanco";
        }

    }

    public void crearElectrodomestico() {
        System.out.println("Ingrese el color: ");
        comprobarColor(consola.next());
        System.out.println("Ingrese el consumo enérgetico (A/B/C/D/F): ");
        comprobarConsumoEnergetico(consola.next().toUpperCase().charAt(0));
        System.out.println("Ingrese el peso en kg: ");
        this.peso = consola.nextInt();

    }

    public void precioFinal() {
        switch (letra) {
            case 'A' -> this.precio += 1000;
            case 'B' -> this.precio += 800;
            case 'C' -> this.precio += 600;
            case 'D' -> this.precio += 500;
            case 'E' -> this.precio += 300;
            case 'F' -> this.precio += 100;
        }

        if (peso <= 19) {
            this.precio += 100;
        } else if (peso > 19 && peso <= 49) {
            this.precio += 500;
        } else if (peso>49 && peso <=79){
            this.precio += 800;
        }else if(peso>79){
            this.precio +=1000;
        }

    }
}

    

