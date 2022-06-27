
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 * Los autos que usan diésel tienen las siguientes características: número de 
 * litros máximo del tanque, costo de cada litro, descuento en litros (porcentaje
 * de litros que no se deben cancelar); el valor total a 
 * cancelar es igual a la siguiente operación: (costo x litros (los litros 
 * ya restados del descuento)) .
 */
public class AutomovilDiesel extends Automovil{
    double numLitros;
    double costoLitros;
    double descuentoLitros;
    
    public void setCostoLitro(double cl) {
        costoLitros = cl;
    }

    public void setDescuentoLitros(double dl) {
        descuentoLitros = dl*numLitros;
    }

     public void setNumLitros(double nl) {
        numLitros = nl;
    }
    
    public double getDescuentoLitros() {
        return descuentoLitros;
    }

    public double getNumLitros() {
        return numLitros;
    }
    
    public double getCostoLitro() {
        return costoLitros;
    }
    
    public double getTotalCancelar(){
        return v_canc;
    }
    
    @Override
    public void calcularV_Canc(){
        v_canc = costoLitros *(numLitros - descuentoLitros);
    }
    @Override 
    public String toString(){
        String cadena = String.format("Propietario: %s\nPlaca: %s\nNuméro de "
                + "litros máximos: %.2f\nCosto por litros: %.2f\nDescuento en "
                + "litros: %.2f\nValor a cancelar: %.2f\n\n", prop, placa, 
                numLitros, 
        costoLitros, descuentoLitros,v_canc);
        return cadena;
    }
}
