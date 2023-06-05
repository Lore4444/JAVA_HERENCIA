package alojamientos;

/**
 *
 * @author lorena
 */
public class Hotel5 extends Hoteles {

    //Atributos private
    private String gimnasio, nombreRestaurante;
    private int capacidadRestaurante, cantidadSalones, cantidadSuites, cantidadLimosinas;

    //Constructores
    public Hotel5() {
    }

    public Hotel5(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadSalones,
            int cantidadSuites, int cantidadLimosinas, int cantHabitaciones, int numeroCamas, int cantPisos,
            int precioHabitaciones, String nombre, String direccion, String localidad, String encargado) {
        super(cantHabitaciones, numeroCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad,
                encargado);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantidadSalones = cantidadSalones;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    //Metodos get/set
    public int getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(int precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    //Metodos
    @Override
    public int calcularPrecioH() {
        int valorAg1 = cantHabitaciones;

        int valorAg2 = 0;
        if (capacidadRestaurante < 30) {
            valorAg2 = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            valorAg2 = 30;
        } else {
            valorAg2 = 50;
        }

        int valorAg3 = 0;
        if (gimnasio.equalsIgnoreCase("A")) {
            valorAg3 = 50;
        } else {
            valorAg3 = 30;
        }

        int valorAg4 = 15 * cantidadLimosinas;

        return super.calcularPrecioH() + valorAg1 + valorAg2 + valorAg3 + valorAg4;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Gimnasio: " + gimnasio + "\nNombre del Restaurante: "
                + nombreRestaurante + "\nCapacidad del Restaurante: " + capacidadRestaurante
                + "\nCapacidad del Restaurante: " + capacidadRestaurante + "\nCantidad de Salones: "
                + cantidadSalones + "\nCantidad de Suites: " + cantidadSuites + "\nCantidad de Limosinas"
                + cantidadLimosinas;
    }

}
