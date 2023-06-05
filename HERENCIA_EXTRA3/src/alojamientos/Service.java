package alojamientos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author lorena
 */
public class Service {

    ArrayList<Alojamientos> listaAlo = new ArrayList();
    ArrayList<Hoteles> listaHotel = new ArrayList();

    public void crearAlojamientos() {
        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 = 0;

        Hotel4 h4 = new Hotel4("A", "JuanPARest", 10,
                5, 7, 7, x, "Hotel JP", "Calle JP",
                "Local JP", "Encargado 1");
        x = h4.calcularPrecioH();
        h4.setPrecioHabitaciones(x);
        listaAlo.add(h4);
        listaHotel.add(h4);

        Hotel5 h5 = new Hotel5("B", "JhonLopez", 10, 5,
                7, 7, 8, 9, 10, y,
                "Hotel JP", "Calle JP", "Local JP", "Encargado 1");
        y = h5.calcularPrecioH();
        h5.setPrecioHabitaciones(y);
        listaAlo.add(h5);
        listaHotel.add(h5);

        Hotel4 h2 = new Hotel4("B", "LorePa", 15, 10,
                10, 5, x, "Hotel Estrellas", "Calle Estrellas",
                "Local Estrellas", "Encargado 2");
        x2 = h2.calcularPrecioH();
        h2.setPrecioHabitaciones(x2);
        listaAlo.add(h2);
        listaHotel.add(h2);

        Hotel5 h1 = new Hotel5("A", "FerChi", 5, 5,
                15, 10, 10, 9, 6, y2,
                "Hotel Chikis", "Calle Chikis", "Local Chichi", "Encargado 2");
        y2 = h1.calcularPrecioH();
        h1.setPrecioHabitaciones(y2);
        listaAlo.add(h1);
        listaHotel.add(h1);

        Residencia R1 = new Residencia("si", "si", "si", 300,
                "Residencia Verano", "Calle verano", "veraniega", "Encargado 1");
        listaAlo.add(R1);

        Residencia R2 = new Residencia("no", "no", "no", 200,
                "Residencia Primavera", "Calle primavera", "primaveral", "Encargado 2");
        listaAlo.add(R2);

        Camping C1 = new Camping(10, 3, "si", "si",
                200, "Camping Invierno", "Calle invierno",
                "invernal", "Encargado 1");
        listaAlo.add(C1);

        Camping C2 = new Camping(15, 2, "no", "no",
                200, "Camping Otoño", "Calle otoño", "otoñal",
                "Encargado 2");
        listaAlo.add(C2);
    }

    public void ordenHoteles() {

        System.out.println("");
        String cartel = "LISTA DE HOTELES ORDENADOS POR PRECIO";
        int anchoTotal = 50;
        int lado = (anchoTotal - cartel.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado - 1) + "s%s%" + lado + "s|", "", cartel, "");
        System.out.println("\n" + "-".repeat(anchoTotal));

        int i = 1;
        Collections.sort(listaHotel, Hoteles.ordenPrecio);
        for (Hoteles lista : listaHotel) {
            System.out.println(" ");
            System.out.println("HOTEL " + i);
            System.out.println(lista.toString());
            i += 1;
        }

    }

    public void CampingConResto() {

        System.out.println("");
        String cartel = "CAMPINGS CON RESTAURANTE";
        int anchoTotal = 50;
        int lado = (anchoTotal - cartel.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado - 1) + "s%s%" + lado + "s|", "", cartel, "");
        System.out.println("\n" + "-".repeat(anchoTotal));

        for (Alojamientos alojamientos : listaAlo) {
            if (alojamientos instanceof Camping) {
                if (((Camping) alojamientos).getConRestaurante().equalsIgnoreCase("si")) {
                    System.out.println(alojamientos.toString());
                }
            }

        }

    }

    public void ResidenciasConDesc() {

        System.out.println("");
        String cartel = "RESIDENCIAS CON DESCUENTO";
        int anchoTotal = 50;
        int lado = (anchoTotal - cartel.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado - 1) + "s%s%" + lado + "s|", "", cartel, "");
        System.out.println("\n" + "-".repeat(anchoTotal));

        for (Alojamientos alojamientos : listaAlo) {
            if (alojamientos instanceof Residencia) {
                if (((Residencia) alojamientos).getDescuento().equalsIgnoreCase("si")) {
                    System.out.println(alojamientos.toString());
                }
            }

        }
    }

    public void mostrarHoteles() {

        System.out.println("");
        String cartel = "HOTELES";
        int anchoTotal = 50;
        int lado = (anchoTotal - cartel.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado - 1) + "s%s%" + lado + "s|", "", cartel, "");
        System.out.println("\n" + "-".repeat(anchoTotal));

        for (Alojamientos lista : listaAlo) {
            if (lista instanceof Hotel4) {
                System.out.println(" ");
                System.out.println("HOTELES 4 ESTRELLAS");
                System.out.println(lista.toString());
            } else if (lista instanceof Hotel5) {
                System.out.println(" ");
                System.out.println("HOTELES 5 ESTRELLAS");
                System.out.println(lista.toString());
            }
        }

        System.out.println("");

        String cartel2 = "EXTRAHOTELEROS";
        int anchoTotal2 = 50;
        int lado2 = (anchoTotal2 - cartel2.length()) / 2;

        System.out.println("\n" + "-".repeat(anchoTotal));
        System.out.format("|%" + (lado2 - 1) + "s%s%" + lado2 + "s|", "", cartel2, "");
        System.out.println("\n" + "-".repeat(anchoTotal2));

        for (Alojamientos lista : listaAlo) {
            if (lista instanceof Camping) {
                System.out.println(" ");
                System.out.println("CAMPINGS");
                System.out.println(lista.toString());
            } else if (lista instanceof Residencia) {
                System.out.println(" ");
                System.out.println("RESIDENCIAS");
                System.out.println(lista.toString());
            }
        }

    }
}
