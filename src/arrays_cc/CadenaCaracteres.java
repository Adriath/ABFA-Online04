/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_cc;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Realiza operaciones con cadenas de caracteres. Incluye un menú para elegir la
 * opción deseada.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class CadenaCaracteres {
    
    // DECLARACIÓN DE VARIABLES
    
    // MÉTODOS
    
    public static String textoAdjunto(){ // He decidido meterlo en un método porque
                                            // no hallaba la manera de que funcionara como variable normal.
                                            // Además queda limpio.
        
        String texto = "";
        
        try
        {
           texto = new String (Files.readAllBytes(Paths.get("fichero/texto.txt"))) ;
        }
        catch (IOException e)
        {
            System.out.println("ERROR " + e.getMessage());
        }
        
        return texto;
        
    }
    
    public static void opcionesMenu(){
        
        // DECLARACIÓN DE VARIABLES
        
        int opcion = 0;
        
        // Colores para la consola
        
        String rojo="\033[31m";
        String reset="\u001B[0m"; //resetea el color
        
        Scanner teclado = new Scanner (System.in);
        
        // PROCESAMIENTO
        
        do {
            
            System.out.println("\nBienvenido/a al submenú de ejercicios con cadenas de"
                    + " caracteres.");
            System.out.println("---------------------------------------------");
            System.out.println("1. Buscar palabra $Hyperboss.");
            System.out.println("2. Sustituir $Hyperboss por COÑAZO.");
            System.out.println("3. Visualiza la primera fase de $Hyperboss.");
            
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
//        System.out.println(textoAdjunto());
        
    }
   
    
    
}
