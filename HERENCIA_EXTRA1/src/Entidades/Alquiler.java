package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author lorena
 */
public class Alquiler {

    String nombre;
    int documento;
    LocalDate fechaAlquiler, fechaDevolucion;
    int posicion = (int) (Math.random() * 10);
    Barco barco = new Barco();
    int precio;
    Scanner leer = new Scanner(System.in);

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicion, int precio, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.precio = precio;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getPrecio() {
        return precio;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{nombre=").append(nombre);
        sb.append(", documento=").append(documento);
        sb.append(", fechaAlquiler=").append(fechaAlquiler);
        sb.append(", fechaDevolucion=").append(fechaDevolucion);
        sb.append(", posicion=").append(posicion);
        sb.append(", precio=").append(precio);
        sb.append(", barco=").append(barco);
        sb.append('}');
        return sb.toString();
    }

    public int ocupacion() {
        return (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);

    }

    public void calcularAlquiler(int modulo) {

        System.out.print(modulo * ocupacion());

    }

    public void crearCliente() {

        leer.nextLine();
        System.out.println("Ingrese su nombre");
        this.nombre = leer.nextLine();
        System.out.println("Ingrese su numero de documento");
        this.documento = leer.nextInt();
        System.out.println("Ingrese la fecha de inicio del alquiler");
        System.out.println("Dia: DD");
        int dia = leer.nextInt();
        System.out.println("Mes: MM");
        int mes = leer.nextInt();
        System.out.println("Año: AAAA");
        int anio = leer.nextInt();
        this.fechaAlquiler = LocalDate.of(anio, mes, dia);

        System.out.println("Ingrese la fecha de devolucion del alquiler");
        System.out.println("Dia: DD");
        int dia2 = leer.nextInt();
        System.out.println("Mes: MM");
        int mes2 = leer.nextInt();
        System.out.println("Año: AAAA");
        int anio2 = leer.nextInt();
        this.fechaDevolucion = LocalDate.of(anio2, mes2, dia2);

        System.out.println(" ");
        System.out.println("Los barcos que tenemos para alquilar son los siguientes:");
        mostrarBarcos();

        System.out.println(" ");
        System.out.println("Elija el barco, colocando su matricula");
        String matricula2 = leer.next();
        for (Barco listaBarcos : barco.getBarcos()) {
            if (matricula2.equalsIgnoreCase(listaBarcos.getMatricula())) {

                System.out.println("El precio total del alquiler seria de: ");
                calcularAlquiler(listaBarcos.modulo());
                System.out.println(" dolares");
            }
        }
        System.out.println(" ");

        System.out.println("Dirijase al amarre numero: " + posicion);

        System.out.println(" ");

    }

    public void mostrarBarcos() {

        System.out.println("** BARCOS **");
        for (Barco listaBarcos : barco.getBarcos()) {
            System.out.println(" ");
            System.out.println("TIPO DE BARCO: " + String.valueOf(listaBarcos.getClass().getCanonicalName().substring(10)));
            System.out.print("\n| MATRICULA: " + listaBarcos.matricula + " | ");
            System.out.print(" | AÑO: " + listaBarcos.anio + " | ");
            System.out.print(" | ESLORA: " + listaBarcos.eslora + " | ");
            if (listaBarcos instanceof Velero) {
                System.out.print(" | MASTILES: " + ((Velero) listaBarcos).getMastiles() + " | ");

            }
            if (listaBarcos instanceof Motor) {
                System.out.print(" | POTENCIA: " + ((Motor) listaBarcos).getPotencia() + " | ");

            }
            if (listaBarcos instanceof Yate) {
                System.out.print(" | CAMAROTES: " + ((Yate) listaBarcos).getCamarotes() + " | ");

            }

            System.out.println(" ");

        }

    }

    public void menu() {

        int opcion;
        do {
            System.out.println("BIENVENIDOS A CHIQUI SHIPS");

            System.out.println("Elija una opcion:");
            System.out.println("1-Registrar cliente");
            System.out.println("2-Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    System.out.println("Gracias por alquilar con nosotros");
                    System.out.println("Chiqui ships!!");
                    break;

            }
            

        }while (opcion != 2);
    }
}
     


