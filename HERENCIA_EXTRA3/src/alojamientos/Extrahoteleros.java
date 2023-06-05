package alojamientos;

/**
 *
 * @author lorena
 */
public class Extrahoteleros extends Alojamientos {

    //Atributos
    protected String privadoPublico;
    protected double area;

    //Constructores
    public Extrahoteleros() {
    }

    public Extrahoteleros(String privadoPublico, double area, String nombre, String direccion, String localidad, String encargado) {
        super(nombre, direccion, localidad, encargado);
        this.privadoPublico = privadoPublico;
        this.area = area;
    }

    //Metodos
    @Override
    public String toString() {
        return super.toString() + "\nEs privado?: " + privadoPublico + "\nTiene " + area + " metros cuadrados";
    }

}
