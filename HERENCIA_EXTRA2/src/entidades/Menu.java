/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Menu {

    Scanner leer = new Scanner(System.in);
    Service serviceEd=new Service();

    public void menuInicio() {

        String inicio = "BIENVENIDOS A COMPLEJO EGGDIFICIOS";
        String inicio2 = "Elija una opcion:";
        String inicio3 = "1-Polideportivos";
        String inicio4 = "2-Edificio de oficinas";
        String inicio5 = "3-Edificios en general";
        String inicio6 = "4-Salir";
        int opcion = 0;

        int anchoTotal = 40; //Es el ancho total del mensaje
        int bienvenido = inicio.length();//Es la longitud del cartel de bienvenida (inicio)
        int ladoDerecho = (anchoTotal - bienvenido) / 2;//Es el ancho total del msj menos el de bienvenida/2
        int ladoIzquierdo = (anchoTotal - bienvenido) / 2;

        int bienvenido2 = inicio2.length();
        int ladoDerecho2 = (anchoTotal - bienvenido2) / 2;
        int bienvenido3 = inicio3.length();
        int ladoDerecho3 = (anchoTotal - bienvenido3) / 2;
        int bienvenido4 = inicio3.length();
        int ladoDerecho4 = (anchoTotal - bienvenido4) / 2;
        int bienvenido5 = inicio3.length();
        int ladoDerecho5 = (anchoTotal - bienvenido5) / 2;
        int bienvenido6 = inicio3.length();
        int ladoDerecho6 = (anchoTotal - bienvenido6) / 2;

        System.out.println("*".repeat(anchoTotal));//Repite los caracteres tantas veces como el ancho
        System.out.format("*%" + (ladoIzquierdo - 1) + "s%s%" + (ladoDerecho - 1) + "s*", "", inicio, "");
        System.out.println("\n" + "*".repeat(anchoTotal));

        do {
            System.out.println("\n" + "-".repeat(anchoTotal));
            System.out.format("|%" + ladoDerecho2 + "s%s%" + (ladoDerecho2 - 1) + "s|", "", inicio2, "");
            System.out.format("\n|%" + (ladoDerecho3 - 1) + "s%s%" + (ladoDerecho3 - 1) + "s|", "", inicio3, "");
            System.out.format("\n|%" + (ladoDerecho4 - 1) + "s%s%" + (ladoDerecho4 - 7) + "s|", "", inicio4, "");
            System.out.format("\n|%" + (ladoDerecho5 - 1) + "s%s%" + (ladoDerecho5 - 7) + "s|", "", inicio5, "");
            System.out.format("\n|%" + (ladoDerecho6 - 1) + "s%s%" + (ladoDerecho6 + 8) + "s|", "", inicio6, "");
            System.out.println("\n" + "-".repeat(anchoTotal));
            //% hace referencia a los valores, s a los caracteres de letras

            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    menuPolideportivos();
                    break;
                case 2:
                    menuOficinas();
                    break;
                case 3:
                    menuEdificios();
                    break;
                default:
                    break;
                    
            }
        } while (opcion != 4);
    }

    public void menuPolideportivos() {

        String inicio = "POLIDEPORTIVOS";
        String inicio2 = "Elija una opcion:";
        String inicio3 = "1-Mostrar Polideportivos";
        String inicio4 = "2-Construir nuevo Polideportivo";
        String inicio5 = "3-Salir";
        int opcion = 0;

        int anchoTotal = 40;
        int bienvenido = inicio.length();
        int lado = (anchoTotal - bienvenido) / 2;
        int bienvenido2 = inicio2.length();
        int lado2 = (anchoTotal - bienvenido2) / 2;
        int bienvenido3 = inicio3.length();
        int lado3 = (anchoTotal - bienvenido3) / 2;
        int bienvenido4 = inicio4.length();
        int lado4 = (anchoTotal - bienvenido4) / 2;
        int bienvenido5 = inicio5.length();
        int lado5 = (anchoTotal - bienvenido5) / 2;

        System.out.println("*".repeat(anchoTotal));
        System.out.format("*%" + (lado - 1) + "s%s%" + (lado - 1) + "s*", "", inicio, "");
        System.out.println("\n" + "*".repeat(anchoTotal));

        do {

            System.out.println("\n" + "-".repeat(anchoTotal));
            System.out.format("|%" + (lado4 - 1) + "s%s%" + 18 + "s|", "", inicio2, "");
            System.out.format("\n|%" + (lado4 - 1) + "s%s%" + 11 + "s|", "", inicio3, "");
            System.out.format("\n|%" + (lado4 - 1) + "s%s%" + lado4 + "s|", "", inicio4, "");
            System.out.format("\n|%" + (lado4 - 1) + "s%s%" + 28 + "s|", "", inicio5, "");
            System.out.println("\n" + "-".repeat(anchoTotal));

            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                    serviceEd.mostrarPolideportivos();
                    break;
                case 2:
                    serviceEd.nuevoPolideportivo();
                    break;
                default:
                    break;
                    
            }
        } while (opcion != 3);

    }

    public void menuOficinas() {

        String inicio = "EDIFICIOS DE OFICINAS";
        String inicio2 = "Elija una opcion:";
        String inicio3 = "1-Mostrar Edificios de oficinas";
        String inicio7 = "2-Construir nuevo Edificio";
        String inicio4 = "3-Cantidad de personas por piso";
        String inicio5 = "4-Cantidad de personas por Edificio";
        String inicio6 = "5-Salir";
        int opcion = 0;

        int anchoTotal = 40;
        int bienvenido = inicio.length();
        int lado = (anchoTotal - bienvenido) / 2;
        int bienvenido2 = inicio5.length();
        int lado2 = (anchoTotal - bienvenido2) / 2;

        System.out.println("*".repeat(anchoTotal));
        System.out.format("*%" + (lado - 1) + "s%s%" + (lado - 1) + "s*", "", inicio, "");
        System.out.println("\n" + "*".repeat(anchoTotal));

        do {
       
        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + lado2 + "s%s%" + 19 + "s|", "", inicio2, "");
        System.out.format("\n|%" + lado2 + "s%s%" + 5 + "s|", "", inicio3, "");
        System.out.format("\n|%" + lado2 + "s%s%" + 10 + "s|", "", inicio7, "");
        System.out.format("\n|%" + lado2 + "s%s%" + 5 + "s|", "", inicio4, "");
        System.out.format("\n|%" + lado2 + "s%s%" + 1 + "s|", "", inicio5, "");
        System.out.format("\n|%" + lado2 + "s%s%" + 29 + "s|", "", inicio6, "");
        System.out.println("\n" + "-".repeat(anchoTotal));
        
        opcion = leer.nextInt();
        
         switch (opcion){
                case 1:
                    serviceEd.mostrarOficinas();
                    break;
                case 2:
                    serviceEd.nuevaOficina();
                    break;
                case 3:
                    serviceEd.personasPiso();
                    break;
                case 4:
                    serviceEd.personasEdificio();
                    break;
                default:
                    break;
                    
            }
        } while (opcion != 5);
    }
    
    public void menuEdificios(){
        
        String inicio = "EDIFICIOS";
        String inicio2 = "Elija una opcion:";
        String inicio3 = "1-Mostrar todos los Edificios";
        String inicio4 = "2-Mostar superficie";
        String inicio5 = "3-Mostrar volumen";
        String inicio6 = "4-Salir";
        int opcion = 0;
        
        int anchoTotal = 40;
        int bienvenido = inicio.length();
        int lado = (anchoTotal - bienvenido) / 2;
        int bienvenido2 = inicio3.length();
        int lado2 = (anchoTotal - bienvenido2) / 2;

        System.out.println("*".repeat(anchoTotal));
        System.out.format("*%" + (lado - 1) + "s%s%" + (lado - 1) + "s*", "", inicio, "");
        System.out.println("\n" + "*".repeat(anchoTotal));
        
        do {
            
        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado2-1) + "s%s%" + 17 + "s|", "", inicio2, "");
        System.out.format("\n|%" + (lado2-1) + "s%s%" + lado2 + "s|", "", inicio3, "");
        System.out.format("\n|%" + (lado2-1) + "s%s%" + 15 + "s|", "", inicio4, "");
        System.out.format("\n|%" + (lado2-1) + "s%s%" + 17 + "s|", "", inicio5, "");
        System.out.format("\n|%" + (lado2-1) + "s%s%" + 27 + "s|", "", inicio6, "");
        System.out.println("\n" + "-".repeat(anchoTotal));
        
        opcion = leer.nextInt();
        
        switch (opcion){
                case 1:
                    serviceEd.mostrarEdificios();
                    break;
                case 2:
                    serviceEd.crearSuperficie();
                    break;
                case 3:
                    serviceEd.crearVolumen();
                    break;
               
                default:
                    break;
                    
            }
        
        } while (opcion != 4);
    }
}
