package alojamientos;

/**
 *
 * @author lorena
 */
public class Camping extends Extrahoteleros {

    //Atributos
    private int capMaximaCarpas;
    private int cantBanos;
    private String conRestaurante;

    //Constructores
    public Camping() {
    }

    public Camping(int capMaximaCarpas, int cantBanos, String conRestaurante, String privadoPublico,
            double area, String nombre, String direccion, String localidad, String encargado) {
        super(privadoPublico, area, nombre, direccion, localidad, encargado);
        this.capMaximaCarpas = capMaximaCarpas;
        this.cantBanos = cantBanos;
        this.conRestaurante = conRestaurante;
    }

    //Metodos
    public int getCapMaximaCarpas() {
        return capMaximaCarpas;
    }

    public void setCapMaximaCarpas(int capMaximaCarpas) {
        this.capMaximaCarpas = capMaximaCarpas;
    }

    public int getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(int cantBanos) {
        this.cantBanos = cantBanos;
    }

    public String getConRestaurante() {
        return conRestaurante;
    }

    public void setConRestaurante(String conRestaurante) {
        this.conRestaurante = conRestaurante;
    }

    public String getPrivadoPublico() {
        return privadoPublico;
    }

    public void setPrivadoPublico(String privadoPublico) {
        this.privadoPublico = privadoPublico;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
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

    @Override
    public String toString() {
        return super.toString() + "\nCapacidad Maxima de Carpas: " + capMaximaCarpas
                + "\nCantidad diponible de baños: " + cantBanos + "\nHay Restaurantes en las instalaciones?: "
                + conRestaurante;
    }

}
