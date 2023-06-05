package alojamientos;

/**
 *
 * @author lorena
 */
public class Residencia extends Extrahoteleros {

    //Atributos
    private String descuento;
    private String campoDeportivo;

    //Constructores
    public Residencia() {
    }

    public Residencia(String descuento, String campoDeportivo, String privadoPublico, double area,
            String nombre, String direccion, String localidad, String encargado) {
        super(privadoPublico, area, nombre, direccion, localidad, encargado);
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    //Metodo Get, Set, y sobreescritos
    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(String campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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
        return super.toString() + "\nTiene descuento?: " + descuento + "\nPosee Campo Deportivo?: "
                + campoDeportivo;
    }

}
