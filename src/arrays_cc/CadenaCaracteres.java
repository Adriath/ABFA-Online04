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
    
    public static void opcionesMenu(){
        
        // DECLARACIÓN DE VARIABLES
        
        int opcion = 0;
        
        // Colores para la consola
        
        String rojo="\033[31m";
        String reset="\u001B[0m";
        
        Scanner teclado = new Scanner (System.in);
        
        // PROCESAMIENTO
        
        do {
            
            System.out.println("\nBienvenido/a al menú de ejercicios con cadenas de"
                    + " caracteres.");
            System.out.println("---------------------------------------------");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            
            System.out.println("\nSelecciona una de las opciones: ");
            String opc = teclado.nextLine() ;
            try
            {
                opcion = Integer.parseInt(opc);
            }
            catch (NumberFormatException e){
                
                System.out.println(rojo +  "Introduce un número válido, por favor.\n" + reset);
            }
            catch (Exception e){
                
                System.out.println(rojo + "Puede que hayas introducido algo mal. \n" + reset);
            }
            
            
        } while (opcion!=0);
        
        System.out.println("--------------------------------------------");
        System.out.println("Has salido del menú. \n");
    }
    public static void main(String[] args) { //MAIN PROVISIONAL
        
        opcionesMenu();
    }
   
}
