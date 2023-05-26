/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author lorena
 */
public class Televisor extends Electrodomestico {
    
    private int tamanio;
    private boolean sintonizador=false;

    public Televisor() {
    }

    public Televisor(int tamanio, boolean sintonizador, int peso, String color, char letra) {
        super(peso, color, letra);
        this.tamanio = tamanio;
        this.sintonizador = sintonizador;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    

    public void crearTelevisor(){
        crearElectrodomestico();
        System.out.println("Ingrese el tamaño del televisor: ");
        this.tamanio=consola.nextInt();
        System.out.println("¿Tiene sintonizador TDT incorporado? S/N");
        this.sintonizador =(consola.next().equalsIgnoreCase("si"));
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (tamanio>40) {
            this.precio=(int) (precio*1.3);
        }
        if (sintonizador) {
            this.precio+=500;
        }
    }
    
    
}

    

