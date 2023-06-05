package alojamientos;

/**
 *
 * @author lorena
 */
public class Alojamientos {

    //Atributos protected
    protected String nombre, direccion, localidad, encargado;

    //Constructores
    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String encargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.encargado = encargado;
    }

    //Metodos
    @Override
    public String toString() {

        return "Nombre: " + nombre + "\nDireccion: " + direccion + "\nLocalidad: " + localidad + "\nEncargado: "
                + encargado;
    }

}
