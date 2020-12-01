/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.regex.*;

/**
 * Contiene un submenú y dos métodos para comprobar matrículas de coche y ciclomotor.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class ValidarCadenas {
   
    /**
     * Comprueba la matrícula (String) introcida por parámetro y la compara con el 
     * modelo registrado en el validador para las matrículas de automóvil.
     * 
     * @param matricula Cadena de caracteres tipo String que se comparará con el patrón.
     * @return booleano, true si es válido, false si no es válido.
     */
    
    public static boolean comprobarMatriculaAutomovil(String matricula){
        
        boolean valido;
        
        Pattern p = Pattern.compile("^[\\d]{4}+[A-Z&&[^ÑAEIOU]]{3}$"); // Formato matrícula: 0000AAA (No vocales ni ñ)
        Matcher m = p.matcher(matricula);
        
        if (m.matches()) {
            valido = true;
        }else{
            valido = false;
        }
        
        return valido;
        
    }
    
    /**
     * Comprueba la matrícula (String) introcida por parámetro y la compara con el 
     * modelo registrado en el validador para las matrículas de ciclomotor.
     * 
     * @param matricula Cadena de caracteres tipo String que se comparará con el patrón.
     * @return booleano, true si es válido, false si no es válido.
     */
    
    public static boolean comprobarMatriculaCiclomotor(String matricula){
        
        boolean valido;
        
        Pattern p = Pattern.compile("^[A-Z&&[^ÑAEIOU]]{1}+[\\d]{4}+[A-Z&&[^ÑAEIOU]]{3}$"); // Formato matrícula: B0000BBB (No vocales ni ñ)
        Matcher m = p.matcher(matricula);
        
        if (m.matches()) {
            valido = true;
        }else{
            valido = false;
        }
        
        return valido;
        
    }
    
    /**
     * Submenú para elegir el validador de matrícula de la clase ValidarCadenas. Se le llama
     * submenú porque está pensado para integrarse en otro menú.
     */
    
    public static void opcionesMenu(){
        
        // DECLARACIÓN DE VARIABLES
        
        boolean validador = false ;
        int opcion;
        
        // PROCESAMIENTO
        
        do {
            
            IO_ES.escribirLN("\nBienvenido/a al submenú de expresiones regulares.");
            IO_ES.escribirLN("---------------------------------------------");
            IO_ES.escribirLN("1. Validar matrícula coche.");
            IO_ES.escribirLN("2. Validar matrícula ciclomotor.");
            IO_ES.escribirLN("\n-- Pulsa 0 para volver al menú principal.");
            
            opcion = IO_ES.leerInteger("\nSelecciona una opción a continuación. "); // Recoge el número entero del usuario.
            
                       
                switch (opcion)
                {

                    case 1: // Valida las matrículas de coche.
                        
                        String matricula = IO_ES.leerString("\n¿Qué matrícula quieres comprobar? ");

                        boolean resultado = comprobarMatriculaAutomovil(matricula);
                        
                        if (resultado == true) {
                            
                            IO_ES.escribirLN("La matrícula es válida.");
                        }
                        else{
                            
                            IO_ES.escribirLN("La matrícula no es válida.");
                        }
                        
                        break;

                    case 2: // Valida las matrículas de ciclomotor.

                        matricula = IO_ES.leerString("\n¿Qué matrícula quieres comprobar?");
                        
                        resultado = comprobarMatriculaCiclomotor(matricula);
                        
                         if (resultado == true) {
                            
                            IO_ES.escribirLN("La matrícula " + matricula + " es válida.");
                        }
                        else{
                            
                            IO_ES.escribirLN("La matrícula " + matricula + " no es válida.");
                        }
                        
                        break;

                    default:

                        if (opcion == 0)
                        {
                            validador = true;
                        }
                        else
                        {
                            IO_ES.escribirLN("\nElige una opción válida, por favor.");
                        }
                        break;
                }
            
            
        } while (validador == false);
        
        IO_ES.escribirLN("--------------------------------------------");
        IO_ES.escribirLN("Saliendo del submenú.");
        IO_ES.escribirLN("--------------------------------------------");
    }
    public static void main(String[] args) {
        opcionesMenu();
    }
    
}
