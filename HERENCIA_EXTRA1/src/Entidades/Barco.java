
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author lorena
 */
public class Barco {

    protected String matricula;
    protected int eslora;
    protected int anio;
    ArrayList<Barco> barcos;

    public Barco(String matricula, int eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

//    public Barco() {
//        barcos=new ArrayList<>();
//    }
    public Barco() {
        crearBarcos();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(Barco barcos) {
        this.barcos.add(barcos);
    }

    public int modulo() {
        return 10 * eslora;
    }

    public void crearBarcos() {

        this.barcos = new ArrayList<>();

        
        barcos.add(new Velero(2, "AB123", 9, 2020));
        barcos.add(new Velero(3, "CA123", 16, 2021));
        barcos.add(new Motor(50, "BB765", 12, 2000));
        barcos.add(new Motor(150, "AA765", 24, 2019));
        barcos.add(new Yate(2, 200, "CD543", 12, 2010));
        barcos.add(new Yate(8, 500, "FF345", 30, 2022));

    }

    public void mostrarBarcos(){
        
        System.out.println("** BARCOS **");
        for (Barco listaBarcos:barcos) {
            System.out.println(" ");
            System.out.println("TIPO DE BARCO: "+String.valueOf(listaBarcos.getClass().getCanonicalName().substring(10)));
            System.out.print("\n| MATRICULA: "+listaBarcos.matricula+" | ");
            System.out.print(" | AÑO: "+listaBarcos.anio+" | ");
            System.out.print(" | ESLORA: "+listaBarcos.eslora+ " | ");
            if (listaBarcos instanceof Velero) {
                System.out.print(" | MASTILES: "+((Velero) listaBarcos).getMastiles()+ " | ");
               
            }
            if (listaBarcos instanceof Motor) {
                System.out.print(" | POTENCIA: "+((Motor) listaBarcos).getPotencia()+ " | ");
               
            }
            if (listaBarcos instanceof Yate) {
                System.out.print(" | CAMAROTES: "+((Yate) listaBarcos).getCamarotes()+ " | ");
                
            }
            

System.out.println(" ");
            


        }
        
    }

}
