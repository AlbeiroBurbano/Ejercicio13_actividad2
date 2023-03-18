
package com.mycompany.ejercicio13_actividad2;
import java.util.Scanner;
public class Ejercicio13_actividad2 {

    public static void main(String[] args) {
     Scanner leerporteclado = new Scanner(System.in);
      
      double ValComp, ValPag, Pdes;
      String ColorBola;
      
        System.out.print("Ingrese el valor de la compra: ");
        ValComp = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el color de la bola, en MAYUSCULAS: ");
        ColorBola = leerporteclado.next();
        
        
        if(ColorBola.equals ("BLANCO")){
            Pdes = 0;
        } else if(ColorBola.equals("VERDE")){
            Pdes = 0.10;
        } else if(ColorBola.equals("AMARILLO")){
            Pdes = 0.25;
        } else if (ColorBola.equals("AZUL")){
            Pdes = 0.50;
        }else {
            Pdes = 1;
        }
        
        ValPag = ValComp - (Pdes*ValComp);
        System.out.print("El cliente debera pagar:$ " + ValPag);
    
    }
}
