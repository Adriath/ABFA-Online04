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


/* NOTA: No he incorporado aquí los métodos de la clase IO_ES porque, según el 
    orden del ejercicio, los he implementado después de escribir todo este código.
    Como puede verse su funcionamiento y uso en la clase ValidarCadenas, omito hacer
    todos los cambios aquí y así poder optimizar el tiempo, aún quedan retos por delante.
*/

/**
 * Realiza operaciones con cadenas de caracteres. Incluye un menú para elegir la
 * opción deseada.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class CadenaCaracteres {
    
    // MÉTODOS
    
    /**
     * Lee el fichero "texto.txt" incluido en el proyecto dentro de la carpeta "fichero".
     * 
     * @return El contenido de "texto.txt" como String.
     */
    
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
    
    /**
     * Menú para explorar los métodos de la clase CadenaCaracteres. Se le llama
     * submenú porque está pensado para integrarse en otro menú.
     */
    
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
            System.out.println("\n-- Pulsa 0 para volver al menú principal.");
            
            System.out.println("\nSelecciona una de las opciones: ");
            String opc = teclado.nextLine() ;
            try
            {
                opcion = Integer.parseInt(opc);
            }
            catch (NumberFormatException e){
                
                System.out.println(rojo +  "Puede que hayas introducido una letra o un decimal...\n" + reset);
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
                            System.out.println("\nElige una opción válida, por favor.");
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
        System.out.println("Saliendo del submenú.");
        System.out.println("--------------------------------------------");
    }
    
    /**
     * Busca la palabra $Hyperboss en el contenido del fichero "texto.txt" para
     * conocer cuántas veces se repite.
     * 
     * @return Un mensaje tipo String que indica las veces que se repite la palabra.
     */
    
    public String buscaHyperboss(){
        
        CadenaCaracteres objeto = new CadenaCaracteres();
        
        String cadena1 = objeto.textoAdjunto(); // Texto adjunto. Devuelve un String.
        String cadena2 = "$Hyperboss" ; // La palabra que queremos comprobar.
        int contador = 0;
        
        int posicion = cadena1.indexOf(cadena2);
        
        
        while (posicion > -1){ // Cuando no encuentre la palabra retornará -1 y saldrá del bucle.
            
            posicion = cadena1.indexOf(cadena2,(posicion + 1)); 
            contador++ ;
            
            /* CÓMO FUNCIONA: Cuando encuentra la palabra , el método IndexOf devuelve un int con la posición en que se encuentra.
            De no encontrarlo daría un -1. La primera vez no tenemos problema, dará un 3000 y pico, que es la primera posición en que 
            aparece y la almacenamos en la vaiable posicion. Si lo hiciéramos de manera manual tendríamos que usar la última
            posición conocida para no empezar desde 0, pero no reconoce esa posición, sino al siguiente (si la primera fuese 3402,
            habría que retomar por la 3403). Es por ello que, como parámetro pondremos la última posición conocida + 1.
            Se repetirá este proceso aportando posiciones en segundo plano como 3402, 3747, 6832, 9223 y similares. Cuando no tenga
            más por delante, en vez de estas posiciones retornará un -1, ahora esta será nuestra última posición conocida.
            Con ello, deja de cumplirse la condición del bucle y se sale, mostrando las veces que indica el contador.
            */
        }
        
        
        return ("\nLa palabra " + cadena2 + " aparece " + contador + " veces en el texto.") ;
    
    }
    
    /**
     * Busca y sustituye la palabra "$Hyperboss" por "COÑAZO".
     * 
     * @return Devuelve como String el contenido de "texto.txt" con los cambios aplicados.
     */
    
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
    
    /**
     * Muestra la primera frase en que aparece la palabra "$Hyperboss" dentro de "texto.txt".
     * 
     * @return La primera frase en que aparece la palabra "@Hyperboss" como String.
     */
    
    public String muestraPrimeraFrase(){
        
        CadenaCaracteres objeto = new CadenaCaracteres();
        
        String cadena1 = objeto.textoAdjunto();
        String cadena2 = "$Hyperboss";
        String cadena3 = "despacho." ;
        int posicion = cadena1.indexOf(cadena2);
        
        cadena1 = "\nFRASE: " + cadena1.substring(posicion,((cadena1.indexOf(cadena3)) + cadena3.length()));
        
        return cadena1;
    }
    
    
   
    public static void main(String[] args) {
        
        CadenaCaracteres objeto = new CadenaCaracteres();
        
        objeto.opcionesMenu();
}
    
}


