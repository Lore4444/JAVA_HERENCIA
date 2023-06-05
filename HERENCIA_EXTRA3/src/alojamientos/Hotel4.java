package alojamientos;

/**
 *
 * @author lorena
 */
public class Hotel4 extends Hoteles {

    //Atributos private, porque no tiene clase heredada
    private String gimnasio, nombreRestaurante;
    private int capacidadRestaurante;

    //Constructores
    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantHabitaciones,
            int numeroCamas, int cantPisos, int precioHabitaciones, String nombre, String direccion,
            String localidad, String encargado) {
        super(cantHabitaciones, numeroCamas, cantPisos, precioHabitaciones, nombre, direccion, localidad,
                encargado);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
    //Metodos get, set y sobreescritos
    public String getGimnasio() {

        return gimnasio;

    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
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

        return super.calcularPrecioH() + valorAg1 + valorAg2 + valorAg3;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Gimnasio: " + gimnasio + "\nNombre del Restaurante: "
                + nombreRestaurante
                + "\nCapacidad del Restaurante: " + capacidadRestaurante;
    }

}
