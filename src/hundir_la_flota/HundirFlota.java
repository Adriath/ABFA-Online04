/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hundir_la_flota;

/**
 * Juego de Hundir la Flota.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class HundirFlota {
    
    public static void tablero(){
        
        // ------------ DECLARACIONES ------------
        
        final int FILA = 11 ;
        final int COLUMNA = 11 ;
        char letras = 'A' ;
        
        String[][] tablero = new String[COLUMNA][FILA] ;
        
        // ---------- PROCESAMIENTO -------------
        
        // Insertamos valores en el array
        
        for (int i = 1; i < COLUMNA; i++)
        {            
            for (int j = 1; j < FILA; j++)
            {
                tablero[i][j] = " . " ;
            }
        }
        
        tablero[0][0] = "  " ; // Dejamos la esquina vacía.
                
        // Creamos encabezado de tablero
        
        for (int i = 1; i < COLUMNA; i++)
        {
            tablero[i][0] = Character.toString(letras);
            letras++;
            
            for (int j = 1; j < FILA; j++)
            {
                tablero[0][j] = Integer.toString(j - 1) + "  ";
            }
        }
        
        // Visualizar tablero
        
        for (int i = 0; i < COLUMNA; i++)
        {
            System.out.println("\n");
            
            for (int j = 0; j < FILA; j++)
            {
                System.out.print(tablero[i][j] + "   ");
            }
        }
        
    }
    public static void main(String[] args) {
        
        tablero();
        
        
        // la a es 97. ¿Y la A mayúscula? 65
    }
}