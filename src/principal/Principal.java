/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import arrays_cc.Arrays;
import arrays_cc.CadenaCaracteres;
import hundir_la_flota.HundirFlota;
import utilidades.IO_ES;
import utilidades.ValidarCadenas;
import static utilidades.ValidarCadenas.comprobarMatriculaAutomovil;
import static utilidades.ValidarCadenas.comprobarMatriculaCiclomotor;

/**
 *
 * @author Adrián Arjona
 * @version 1.0
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // --------- DECLARAIONES DE VARIABLES -------------
        
        int opcion = 0 ;
        boolean validador = false ;
        
        String verde="\033[32m";
        String azul="\033[34m";
        String reset="\u001B[0m";

        
        // ----------- INSTANCIACIONES --------------
        
        CadenaCaracteres cadenaCaracteres = new CadenaCaracteres() ;
        
        // ----------- PROCESAMIENTO --------------
        
        IO_ES.escribirLN("¡Bienvenido/a al menú de la tarea online 4 de Programación!\n") ;
        
        do {
            
            IO_ES.escribirLN("-------------- " + azul + "Menú Principal"  + reset + "---------------");
            IO_ES.escribirLN("---------------------------------------------");
            IO_ES.escribirLN("1. Cadena de caracteres.");
            IO_ES.escribirLN("2. Expresiones regulares.");
            IO_ES.escribirLN("3. Arrays.");
            IO_ES.escribirLN("4. Hundir la flota.");
            IO_ES.escribirLN("\n-- Pulsa 0 para salir del programa. ");
            
            opcion = IO_ES.leerInteger("\nSelecciona una opción a continuación: "); // Recoge el número entero del usuario.
            
                       
                switch (opcion)
                {

                    case 1: // Cadena de caracteres
                        
                        cadenaCaracteres.opcionesMenu();
                        
                        break;

                    case 2: // Expresiones regulares

                        ValidarCadenas.opcionesMenu();
                        
                        break;
                        
                    case 3: // Arrays

                        Arrays.opcionesMenu(); 
                        
                        break;

                    case 4: // Hundir la flota

                        HundirFlota.tablero(true);

                        break;

                    default:

                        if (opcion == 0)
                        {
                            validador = true;
                        }
                        else
                        {
                            IO_ES.escribirLN("\nElige una opción válida, por favor.\n");
                        }
                        break;
                }
            
            
        } while (validador == false);
        
        IO_ES.escribirLN("--------------------------------------------");
        IO_ES.escribirLN("Saliendo del programa.");
        IO_ES.escribirLN("--------------------------------------------");
        
        IO_ES.escribirLN("\n ¡¡Hasta la próxima!!");
        IO_ES.escribirLN("\n" + verde + "---------- HAS SALIDO DEL PROGRAMA. ------------" + reset + "\n");
        
    }
    
}
