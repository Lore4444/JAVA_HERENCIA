
package Entidades;

/**
 *
 * @author lorena
 */
public class Motor extends Barco {

    protected int potencia;

    public Motor() {
    }

    public Motor(int potencia, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.potencia = potencia;
    }

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int modulo() {
        return super.modulo() + potencia; 
    }

}
    
