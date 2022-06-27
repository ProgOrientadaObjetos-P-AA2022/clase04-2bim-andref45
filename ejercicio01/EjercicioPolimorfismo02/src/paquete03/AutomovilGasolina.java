
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 Los autos que usan gasolina tienen las siguientes características particulares: 
 * número de galones máximo del tanque, costo de cada galón, iva (valor fijo de 10%); 
 * el valor total a cancelar es igual a la siguiente operación: 
 * (costo x galón) * (número de galones) +  el iva de ((costo x galón) * (número de galones)).
 */
public class AutomovilGasolina extends Automovil {
    double numGal;
    double costGal;
    double iva = 0.1;
    
    public void establecerNumGalon(double n){
        numGal = n;
    }
    public void establecerCostoGalon(double n){
        costGal = n;
    }
    @Override 
    public void calcularV_Canc(){
        v_canc = (costGal*numGal) + iva * (costGal*numGal);
        }
    public double obtenerNumGal(){
        return numGal;
    }
    public double obtenerCostoGalon(){
        return costGal;
    }
    public double obtenerV_Canc(){
        return v_canc;
    }
    @Override 
    public String toString(){
        String cadena = String.format("Propietario: %s\n"
                + "Placa: %s\n"
                + "Numéro de galones máximos: %.2f\n"
                + "Costo por galón: %.2f\n"
                + "Valor a cancelar: %.2f\n\n", 
                prop, 
                placa, 
                numGal, 
                costGal, 
                v_canc);
        return cadena;
    }
}
