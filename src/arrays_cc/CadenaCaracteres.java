/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_cc;

import java.util.*;

/**
 * 
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class CadenaCaracteres {
    
    public static int opcionesMenu(int opcion){
        
        Scanner teclado = new Scanner (System.in);
        
        do {
            
            System.out.println("Bienvenido/a al menú de ejercicios con cadenas de"
                    + "caracteres.");
            System.out.println("---------------------------------------------");
            System.out.println("1. Buscar una palabra en el texto y verla por pantalla.");
            System.out.println("2. Sustituir una palabra por otra.");
            
        } while (opcion!=0);
        
        
    }
    
}
