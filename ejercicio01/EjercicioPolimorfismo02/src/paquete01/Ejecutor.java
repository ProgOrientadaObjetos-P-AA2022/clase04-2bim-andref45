/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        double total;
        
        String nombreUno = "Daniel";
        String placaUno = "BB12345";
        AutomovilGasolina auto1 = new AutomovilGasolina();
        auto1.establecerProp(nombreUno);
        auto1.establecerPlaca(placaUno);
        auto1.establecerCostoGalon(4.50);
        auto1.establecerNumGalon(10);
        auto1.calcularV_Canc();

        System.out.printf("%s", auto1);

        String nombreDos = "Andre";
        String placaDos = "asfd2525";
        AutomovilGasolina auto2 = new AutomovilGasolina();
        auto2.establecerProp(nombreDos);
        auto2.establecerPlaca(placaDos);
        auto2.establecerCostoGalon(5.50);
        auto2.establecerNumGalon(9);
        auto2.calcularV_Canc();

        System.out.printf("%s", auto2);

        
        String nombreTres = "Joel";
        String placaTres = "jkl1212";
        AutomovilDiesel auto3 = new AutomovilDiesel();
        auto3.establecerProp(nombreTres);
        auto3.establecerPlaca(placaTres);
        auto3.setNumLitros(20);
        auto3.setCostoLitro(5);
        auto3.setDescuentoLitros(0.1);
        auto3.calcularV_Canc();
        System.out.printf("%s", auto3);

        String nombreCua = "Martin";
        String placaCua = "TTER594";
        AutomovilDiesel auto4 = new AutomovilDiesel();
        auto4.establecerProp(nombreCua);
        auto4.establecerPlaca(placaCua);
        auto4.setNumLitros(30);
        auto4.setCostoLitro(5);
        auto4.setDescuentoLitros(0.1);
        auto4.calcularV_Canc();
        System.out.printf("%s", auto4);
        
        total = auto1.obtenerV_Canc() + auto2.obtenerV_Canc() + 
        auto3.obtenerV_Canc() + auto4.obtenerV_Canc();
        
        System.out.println("Valor total de ventas: " + total);
    }
}

