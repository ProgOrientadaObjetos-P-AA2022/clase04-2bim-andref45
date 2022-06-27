
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String prop;
    protected String placa;
    protected double v_canc;

    public void establecerProp(String n) {
        prop = n;
    }

    public void establecerPlaca(String n) {
        placa = n;
    }

    public abstract void calcularV_Canc();

    public String obtenerProp() {
        return prop;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public double obtenerV_Canc() {
        return v_canc;
    }
    
}
