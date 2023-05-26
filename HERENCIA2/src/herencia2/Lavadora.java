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
public class Lavadora extends Electrodomestico{
    

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, int peso, String color, char letra) {
        super(peso, color, letra);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora: ");
        this.carga = consola.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga >= 30) {
            this.precio += 500;
        }
    }
}

    

