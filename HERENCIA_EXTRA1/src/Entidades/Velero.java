
package Entidades;

/**
 *
 * @author lorena
 */
public class Velero extends Barco {

    private int mastiles;

    public Velero() {

    }

    public Velero(int mastiles, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.mastiles = mastiles;
    }

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public int modulo() {
        return super.modulo() + mastiles; 
    }

    @Override
    public String toString() {
        return super.toString(); 
    }


    
}
    

