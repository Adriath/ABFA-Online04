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
    
    public static boolean comprobarMatriculaAutomovil(String matricula){
        
        boolean valido = false;
        
        Pattern p = Pattern.compile("prueba");
        Matcher m = p.matcher(matricula);
        
        if (m.matches()) {
            valido = true;
        }else{
            valido = false;
        }
        
        return valido;
        
    } 
    
    public static void main(String[] args) {
        System.out.println(comprobarMatriculaAutomovil("prueba"));
    }
}
