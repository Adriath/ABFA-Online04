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
    
    public String textoAdjunto(){ // He decidido meterlo en un método porque
                                            // no hallaba la manera de que funcionara como variable normal.
                                            // Además queda limpio.
        
        String texto = "";
        
        // Colores para la consola
        
        String rojo="\033[31m";
        String reset="\u001B[0m"; //resetea el color
        
        try
        {
           texto = new String (Files.readAllBytes(Paths.get("fichero/texto.txt"))) ;
        }
        catch (IOException e)
        {
            System.out.println(rojo + "ERROR " + e.getMessage() + reset);
        }
        
        return texto;
        
    }
    
    public void opcionesMenu(){
        
        // DECLARACIÓN DE VARIABLES
        
        boolean validador = false ;
        int opcion = 0;
        
        CadenaCaracteres objeto = new CadenaCaracteres();
        
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
            System.out.println("\n-- Pulsa 0 para salir del menú.");
            
            System.out.println("\nSelecciona una de las opciones: ");
            String opc = teclado.nextLine() ;
            try
            {
                opcion = Integer.parseInt(opc);
            }
            catch (NumberFormatException e){
                
                System.out.println(rojo +  "Puede que hayas introducido una letra o un decimal..\n" + reset);
                opcion = -1;
            }
            catch (Exception e){
                
                System.out.println(rojo + "Puede que hayas introducido algo mal. \n" + reset);
                opcion = -1;
            }
            
            try
            {
                
            
                switch (opcion)
                {

                    case 1: // Busca en el texto la palabra Hyperboss.

                        System.out.println(objeto.buscaHyperboss());
                        break;

                    case 2: // Sustituye la palabra Hyperboss por COÑAZO

                        System.out.println(objeto.sustituyeHyperboss());
                        break;

                    case 3: // Muestra la primera frase en la que aparece la palabra Hyperboss.

                        System.out.println(objeto.muestraPrimeraFrase());
                        break;

                    default:

                        if (opcion == 0)
                        {
                            validador = true;
                        }
                        else
                        {
                            System.out.println("Elige una opción válida, por favor.");
                        }
                        break;
                }
            }
            catch(NumberFormatException e){
                
                System.out.println(rojo + "Puede que hayas introducido una letra." + reset);
                opcion = -1;
            }
            catch (Exception e){
                System.out.println(rojo + "Has introducido algún carácter inválido" + reset);
                opcion = -1;
            }
            
        } while (validador == false);
        
        System.out.println("--------------------------------------------");
        System.out.println("Saliendo del submenú. \n");
        System.out.println("--------------------------------------------");
    }
    
    public String buscaHyperboss(){
        
        CadenaCaracteres objeto = new CadenaCaracteres();
        
        String cadena1 = objeto.textoAdjunto(); // Texto adjunto. Devuelve un String.
        String cadena2 = "$Hyperboss" ; // La palabra que queremos comprobar.
        int contador = 0;
        
        int posicion = cadena1.indexOf(cadena2);
        
        
        while (posicion > -1){ // Cuando no encuentre la palabra retornará -1 y saldrá del bucle.
            
            posicion = cadena1.indexOf(cadena2,(posicion + 1));
            contador++ ;
        }
        
        
        return ("La palabra " + cadena2 + " aparece " + contador + " veces en el texto.") ;
    
    }
    
    public String sustituyeHyperboss(){
        
        //DECLACIÓN DE VARIABLES
        
        CadenaCaracteres objeto = new CadenaCaracteres();
        
        String cadena1 = objeto.textoAdjunto();
        String cadena2 = "$Hyperboss";
        String cadena3 = "COÑAZO";

        // Colores para la consola
        
        String blue="\033[34m";
        String reset="\u001B[0m";
        
        // PROCESAMIENTO
        
       cadena1 = cadena1.replace(cadena2, blue + cadena3 + reset);
        
        //SALIDA DE DATOS
        
        return cadena1;
        
    }
    
    public String muestraPrimeraFrase(){
        
        CadenaCaracteres objeto = new CadenaCaracteres();
        
        String cadena1 = objeto.textoAdjunto();
        String cadena2 = "$Hyperboss";
        String cadena3 = "despacho." ;
        int posicion = cadena1.indexOf(cadena2);
        
        cadena1 = cadena1.substring(posicion,((cadena1.indexOf(cadena3)) + cadena3.length()));
        
        return cadena1;
    }
   
    public static void main(String[] args) {
        
        CadenaCaracteres objeto = new CadenaCaracteres();
        
        objeto.opcionesMenu();
}
    
}


