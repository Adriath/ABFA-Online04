/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.*;

/**
 * Esta clase contiene los métodos estáticos que permiten la lectura de 
 * distintos tipos de datos desde teclado y muestra texto por consola.
 * 
 * @author Adrián Arjona
 * @version 1.1
 */
public class IO_ES {
    
    /**
     * Pide al usuario que introduzca un número entero por teclado.
     * 
     * @param String mensaje. Introduce un texto para que salga por pantalla.
     * @return Int. Número entero introducido por el usuario.
     */
    
    static public int leerInteger(String mensaje){
        
        String rojo="\033[31m";
        String reset="\u001B[0m";
        
        int numero = 0;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print(mensaje);
            String num = teclado.nextLine();
        
            try
            {
                numero = Integer.parseInt(num);
                validador = true;
            }
            catch (NumberFormatException e){

                System.out.println(rojo + "¯\\_(ツ)_/¯ Has introducido uua letra u otro carácter no válido." + reset);
            }
            catch (Exception e){

                System.out.println(rojo + "¯\\_(ツ)_/¯ Puede que hayas introducido uua letra u otro carácter no válido." + reset);
            }
            
        } while (validador == false);
        
        
        return  numero;
        
    }
    
    /**
     * Pide al usuario que introduzca un número real por teclado.
     * 
     * @param String mensaje. Introduce un texto para que salga por pantalla.
     * @return Float. Número real introducido por el usuario.
     */
    
    static public float leerReal(String mensaje){
        
        float numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        String rojo="\033[31m";
        String reset="\u001B[0m";
        
        do 
        {
            
            System.out.print(mensaje);
            String num = teclado.nextLine();
            
            try
            {
                numero = Float.parseFloat(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println(rojo + "¯\\_(ツ)_/¯ Has introducido una letra o un número no válido. La coma debe ser un punto." + reset);
            }
            catch (Exception e){
                
                System.out.println(rojo + "¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido." + reset);
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    /**
     * Pide al usuario que introduzca un número entero largo por teclado.
     * 
     * @param String mensaje. Introduce un texto para que salga por pantalla.
     * @return Long. Número entero largo introducido por el usuario.
     */
    
    static public long leerIntegerLargo(String mensaje){
        
        long numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        String rojo="\033[31m";
        String reset="\u001B[0m";
        
        do 
        {
            
            System.out.print(mensaje);
            String num = teclado.nextLine();
            
            try
            {
                numero = Long.parseLong(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println(rojo + "¯\\_(ツ)_/¯ Has introducido una letra o un número no válido." + reset);
            }
            catch (Exception e){
                
                System.out.println(rojo + "¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido." + reset);
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    /**
     * Pide al usuario que introduzca un número real largo por teclado.
     * 
     * @param String mensaje. Introduce un texto para que salga por pantalla.
     * @return Double. Número real largo introducido por el usuario.
     */
    
    static public double leerRealLargo(String mensaje){
        
        double numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        String rojo="\033[31m";
        String reset="\u001B[0m";
        
        do 
        {
            
            System.out.print(mensaje);;
            String num = teclado.nextLine();
            
            try
            {
                numero = Float.parseFloat(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println(rojo + "¯\\_(ツ)_/¯ Has introducido una letra o un número no válido. La coma debe ser un punto." + reset);
            }
            catch (Exception e){
                
                System.out.println(rojo + "¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido." + reset);
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    /**
     * Pide al usuario un mensaje tipo String por teclado.
     * 
     * @param String mensaje. Introduce un texto para que salga por pantalla.
     * @return Devuelve el mensaje introducido por teclado como String.
     */
    
    public static String leerString(String mensaje){
        
        Scanner teclado = new Scanner(System.in);
            
        System.out.print(mensaje);
        String mensajeUsuario = teclado.nextLine();
        
        return mensajeUsuario ;
        
    }
    
    /**
     * Lee un mensaje String escrito por parámetro y lo muestra por pantalla.
     * 
     * @param mensaje String. Muestra en la misma línea el mensaje recogido por parámetro.
     */
    
    static public void escribir(String mensaje){
        
        System.out.print(mensaje);
        
    }
    
    /**
     * Lee un mensaje String escrito por parámetro y lo muestra por pantalla.
     * 
     * @param mensaje String. Muestra el mensaje recogido por parámetro y añade un salto de línea.
     */
    
    static public void escribirLN(String mensaje){
        
        System.out.println(mensaje);
       
    } 
    
}

    
    

