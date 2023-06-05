package alojamientos;

import java.util.Comparator;

/**
 *
 * @author lorena
 */
public class Hoteles extends Alojamientos {

    //Atributos protected porque tienen clases heredadas
    protected int cantHabitaciones, numeroCamas, cantPisos;
    protected int precioHabitaciones;

    //Constructores: vacio y propio con atributos de la superclase Alojamiento mendiante palabra clave super
    public Hoteles() {
    }

    public Hoteles(int cantHabitaciones, int numeroCamas, int cantPisos, int precioHabitaciones, String nombre,
            String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantPisos = cantPisos;
        this.precioHabitaciones = 50;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int calcularPrecioH() {

        return this.precioHabitaciones;

    }

    //Metodos sobreescritos
    @Override
    public String toString() {
        return super.toString() + "\nCantidad de Habitaciones: " + cantHabitaciones + "\nNumero de Camas: "
                + numeroCamas + "\nCantidad de Pisos: " + cantPisos + "\nPrecio de las Habitaciones: "
                + precioHabitaciones;
    }

    public static Comparator<Hoteles> ordenPrecio = new Comparator<Hoteles>() {

        public int compare(Hoteles s1, Hoteles s2) {
            int a = s1.getPrecioHabitaciones();
            int b = s2.getPrecioHabitaciones();
            return b - a;

//    return o1.getDuracion().compareTo(o2.getDuracion());
        }

    };

}
