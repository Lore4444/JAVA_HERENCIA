package alojamientos;

import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Menu {

    Scanner leer = new Scanner(System.in);
    Service S1 = new Service();

    public void menuInicio() {

        S1.crearAlojamientos();

        String inicio = "BIENVENIDOS A ALOJAMIENTOS EGG";
        String inicio2 = "Elija una opcion:";
        String inicio3 = "1-Mostrar todos los alojamientos";
        String inicio4 = "2-Mostrar los Hoteles ordenados por precio";
        String inicio5 = "3-Mostrar los Campings con Restaurante";
        String inicio6 = "4-Mostrar las Residencias con descuento";
        String inicio7 = "5-Salir";
        int opcion = 0;

        int anchoTotal = 50; //Es el ancho total del mensaje
        int bienvenido = inicio.length();//Es la longitud del cartel de bienvenida (inicio)
        int lado = (anchoTotal - bienvenido) / 2;//Es el ancho total del msj menos el de bienvenida/
        int bienvenido2 = inicio4.length();//Para calcular el espacio del msj mas largo de las opciones
        int lado2 = (anchoTotal - bienvenido2) / 2;//Para calcular los espacios a partir de los cuales se van a ubicar
        //todos los msj

        System.out.println("*".repeat(anchoTotal));//Repite los caracteres tantas veces como el ancho
        System.out.format("*%" + (lado - 1) + "s%s%" + (lado - 1) + "s*", "", inicio, "");
        System.out.println("\n" + "*".repeat(anchoTotal));

        do {
            System.out.println("\n" + "-".repeat(anchoTotal));
            System.out.format("|%" + (lado2 - 1) + "s%s%" + 28 + "s|", "", inicio2, "");
            System.out.format("\n|%" + (lado2 - 1) + "s%s%" + 13 + "s|", "", inicio3, "");
            System.out.format("\n|%" + (lado2 - 1) + "s%s%" + (lado2 - 1) + "s|", "", inicio4, "");
            System.out.format("\n|%" + (lado2 - 1) + "s%s%" + 7 + "s|", "", inicio5, "");
            System.out.format("\n|%" + (lado2 - 1) + "s%s%" + 6 + "s|", "", inicio6, "");
            System.out.format("\n|%" + (lado2 - 1) + "s%s%" + 38 + "s|", "", inicio7, "");
            System.out.println("\n" + "-".repeat(anchoTotal));
            //% hace referencia a los valores, s a los caracteres de letras

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    S1.mostrarHoteles();
                    break;
                case 2:
                    S1.ordenHoteles();
                    break;
                case 3:
                    S1.CampingConResto();
                    break;
                case 4:
                    S1.ResidenciasConDesc();
                    break;
                case 5:
                    System.out.println("Los esperamos nuevamente!!!");
                    break;
                default:
                    break;

            }
        } while (opcion != 5);
    }

}
