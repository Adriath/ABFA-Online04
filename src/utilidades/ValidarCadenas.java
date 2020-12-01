/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.*;
import java.util.regex.*;

/**
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
    
}
