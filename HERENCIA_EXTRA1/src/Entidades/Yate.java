
package Entidades;

/**
 *
 * @author lorena
 */
public class Yate extends Motor {

    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes) {
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potencia, String matricula, int eslora, int anio) {
        super(potencia, matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    public Yate(int camarotes, int potencia) {
        super(potencia);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public int modulo() {
        return super.modulo() + camarotes; 
    }

}
