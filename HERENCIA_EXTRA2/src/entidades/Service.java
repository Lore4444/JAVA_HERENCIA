/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Service {

    ArrayList<Edificio> edificios = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    //POLIDEPORTIVOS
    public void crearPolideportivo() {//creacion de Polideportivos predefinidos

        Polideportivo Poli1 = new Polideportivo("Superman", "techado", 2, 4, 3);
        Polideportivo Poli2 = new Polideportivo("Batman", "abierto", 5, 6, 7);
        edificios.add(Poli1);
        edificios.add(Poli2);
    }

    public void nuevoPolideportivo() {//creacion de Polideportivos por usuario
        leer.nextLine();
        String tipoInstalacion = " ";
        System.out.println("Ingrese el nombre del nuevo polideportivo");
        String nombre = leer.nextLine();
        System.out.println("Elija el tipo de instalacion del polideportivo:");
        System.out.println("1: Techado, 2: Abierto");
        int tipo = leer.nextInt();
        if (tipo == 1) {
            tipoInstalacion = "Techado";
        } else if (tipo == 2) {
            tipoInstalacion = "Abierto";
        } else {
            System.out.println("Opcion Incorrecta");
        }
        System.out.println("Ingrese las medidas del polideportivo:");
        System.out.println("ancho:");
        int ancho = leer.nextInt();
        System.out.println("largo:");
        int largo = leer.nextInt();
        System.out.println("alto:");
        int alto = leer.nextInt();
        Polideportivo Poli3 = new Polideportivo(nombre, tipoInstalacion, ancho, largo, alto);
        edificios.add(Poli3);

    }

    public void mostrarPolideportivos() {

        System.out.println("");

        System.out.println("");
        int[] longi = {21, 20};
        String[] encabezado = {"| Nombre", "Tipo de Instalacion"};
        String poli = "POLIDEPORTIVOS";
        int anchoTotal = 46;
        int lado = (anchoTotal - poli.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado - 1) + "s%s%" + (lado - 1) + "s|", "", poli, "");
        System.out.println("\n" + "-".repeat(anchoTotal));

        for (int i = 0; i < encabezado.length; i++) {
            System.out.format("%-" + longi[i] + "s | ", encabezado[i]);
        }
        System.out.println("\n----------------------+-----------------------");
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                System.out.println(edificio.toString());
            }

        }
    }

    //EDIFICIO DE OFICINAS
//    public void crearOficina() {
//        EdificioDeOficinas Ofi1 = new EdificioDeOficinas(10, 10, 30);
//        EdificioDeOficinas Ofi2 = new EdificioDeOficinas(20, 20, 60);
//        Ofi1.cantPersonas();
//        Ofi2.cantPersonas();
//        edificios.add(Ofi1);
//        edificios.add(Ofi2);
//    }
    public void nuevaOficina() {//creacion de Polideportivos por usuario
        leer.nextLine();
        System.out.println("Ingrese el nombre el Edificio de oficinas");
        String nombre = leer.nextLine();
        System.out.println("Ingrese las medidas del Edificio de oficinas:");
        System.out.println("ancho:");
        int ancho = leer.nextInt();
        System.out.println("largo:");
        int largo = leer.nextInt();
        System.out.println("alto:");
        int alto = leer.nextInt();
        System.out.println("Ingrese la cantidad de pisos que posee el Edificio");
        int numeroPisos = leer.nextInt();
        System.out.println("Ingrese la cantidad de oficinas que hay en cada piso del Edificio");
        int numeroOficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad de personas que trabajan en cada oficina");
        int personasPorOficina = leer.nextInt();

        EdificioDeOficinas Ofi1 = new EdificioDeOficinas(numeroOficinas, personasPorOficina, numeroPisos,
                nombre, ancho,
                largo, alto);
        edificios.add(Ofi1);
    }

    public void mostrarOficinas() {

        System.out.println("");

        System.out.println("");
        int[] longi = {21, 20, 19, 16};
        String[] encabezado = {"| Nombre del Edificio", "Numero de Oficinas", "Personas por oficina",
            "Numero de pisos"};
        String ed = "EDIFICIO DE OFICINAS";
        int anchoTotal = 88;
        int lado = (anchoTotal - ed.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado - 1) + "s%s%" + (lado - 1) + "s|", "", ed, "");
        System.out.println("\n" + "-".repeat(anchoTotal));

        for (int i = 0; i < encabezado.length; i++) {
            System.out.format("%-" + longi[i] + "s | ", encabezado[i]);
        }
        System.out.println("\n----------------------+----------------------+----------------------+"
                + "-------------------");
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println(edificio.toString());
            }

        }
    }

    public void personasPiso() {

        leer.nextLine();
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println("Ingrese el nombre del Edificio de oficinas");
                String nombre = leer.nextLine();
                if (nombre.equalsIgnoreCase(((EdificioDeOficinas) edificio).getNombre())) {
                    int persPiso = ((((EdificioDeOficinas) edificio).getNumeroOficinas())
                            * (((EdificioDeOficinas) edificio).getPersonasPorOficina()));
                    ((EdificioDeOficinas) edificio).setPersonasPorPiso(persPiso);
                    System.out.println(" ");
                    System.out.println("El Edificio de oficinas " + (((EdificioDeOficinas) edificio).getNombre()) + " tiene "
                            + "una capacidad de " + (((EdificioDeOficinas) edificio).getPersonasPorPiso()) + " personas "
                            + "por piso");
                }
            }
        }
    }

    public void personasEdificio() {

        leer.nextLine();
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println("Ingrese el nombre del Edificio de oficinas");
                String nombre = leer.nextLine();
                if (nombre.equalsIgnoreCase(((EdificioDeOficinas) edificio).getNombre())) {
                    int persEd = (((EdificioDeOficinas) edificio).getNumeroPisos()
                            * ((EdificioDeOficinas) edificio).getPersonasPorPiso());
                    ((EdificioDeOficinas) edificio).setPersonasEdificio(persEd);
                    System.out.println(" ");
                    System.out.println("El Edificio de oficinas " + (((EdificioDeOficinas) edificio).getNombre()) + " tiene "
                            + "una capacidad total de " + (((EdificioDeOficinas) edificio).getPersonasEdificio())
                            + " personas ");
                }
            }
        }
    }

    //EDIFICIOS
    String inicio3 = "1-Mostrar todos los Edificios";
    String inicio4 = "2-Mostar superficie";
    String inicio5 = "3-Mostrar volumen";

    public void mostrarEdificios() {

        //Si tenemos el toString armado diferente podemos usar lo siguiente:
//        int i = 0;
//        for (Edificio edificio : edificios) {
//
//            if (edificio instanceof Polideportivo) {
//                System.out.println("Polideportivo " + (i + 1));
//                System.out.println(edificio.toString());
//                i += 1;
//            }
//            System.out.println(" ");
//
//            if (edificio instanceof EdificioDeOficinas) {
////                i=0;
//                System.out.println("Edificio de Oficinas " + (i + 1));
//                System.out.println(edificio.toString());
//                i += 1;
//            }
//        }
//        System.out.println(" ");
        System.out.println("");
        int[] longi = {21, 20};
        String[] encabezado = {"| Nombre", "Tipo de Instalacion"};
        String poli = "POLIDEPORTIVOS";
        int anchoTotal = 46;
        int lado = (anchoTotal - poli.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado - 1) + "s%s%" + (lado - 1) + "s|", "", poli, "");
        System.out.println("\n" + "-".repeat(anchoTotal));

        for (int i = 0; i < encabezado.length; i++) {
            System.out.format("%-" + longi[i] + "s | ", encabezado[i]);
        }
        System.out.println("\n----------------------+-----------------------");
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                System.out.println(edificio.toString());
            }

        }
        System.out.println("");
        int[] longi2 = {21, 20, 19, 16};
        String[] encabezado2 = {"| Nombre del Edificio", "Numero de Oficinas", "Personas por oficina",
            "Numero de pisos"};
        String ed = "EDIFICIO DE OFICINAS";
        int anchoTotal2 = 88;
        int lado2 = (anchoTotal2 - ed.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal2));
        System.out.format("|%" + (lado2 - 1) + "s%s%" + (lado2 - 1) + "s|", "", ed, "");
        System.out.println("\n" + "-".repeat(anchoTotal2));

        for (int i = 0; i < encabezado2.length; i++) {
            System.out.format("%-" + longi2[i] + "s | ", encabezado2[i]);
        }
        System.out.println("\n----------------------+----------------------+----------------------+"
                + "-------------------");
        for (Edificio edificio : edificios) {
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println(edificio.toString());
            }

        }

    }

    public void crearSuperficie() {

        System.out.println("Ingrese el tipo de Edificio del cual desea conocer la superficie");
        System.out.println("1-Polideportivos");
        System.out.println("2-Edificio de oficinas");
        int opc = leer.nextInt();

        switch (opc) {
            case 1:
                for (Edificio edificio : edificios) {
                    if (edificio instanceof Polideportivo) {

                        System.out.println("El Polideportivo: " + ((Polideportivo) edificio).getNombre());
                        System.out.println("Tiene una superficie de: " + edificio.calcularSuperficie());

                    }
                    System.out.println(" ");
                }

                break;

            case 2:
                for (Edificio edificio : edificios) {
                    if (edificio instanceof EdificioDeOficinas) {
                        System.out.println("El Edificio de Oficinas : " + ((EdificioDeOficinas) edificio).getNombre());
                        System.out.println("Tiene una superficie de: " + edificio.calcularSuperficie());
                    }
                    System.out.println(" ");
                }

                break;

        }

    }
    
    public void crearVolumen() {

        System.out.println("Ingrese el tipo de Edificio del cual desea conocer su volumen");
        System.out.println("1-Polideportivos");
        System.out.println("2-Edificio de oficinas");
        int opc = leer.nextInt();

        switch (opc) {
            case 1:
                for (Edificio edificio : edificios) {
                    if (edificio instanceof Polideportivo) {

                        System.out.println("El Polideportivo: " + ((Polideportivo) edificio).getNombre());
                        System.out.println("Tiene un volumen de: " + edificio.calcularVolumen());

                    }
                    System.out.println(" ");
                }

                break;

            case 2:
                for (Edificio edificio : edificios) {
                    if (edificio instanceof EdificioDeOficinas) {
                        System.out.println("El Edificio de Oficinas : " + ((EdificioDeOficinas) edificio).getNombre());
                        System.out.println("Tiene un volumen de: " + edificio.calcularVolumen());
                    }
                    System.out.println(" ");
                }

                break;

        }

    }
}
