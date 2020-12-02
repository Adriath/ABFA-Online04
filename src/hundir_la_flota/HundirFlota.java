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
    
    final int FILA = 11 ;
    final int COLUMNA = 11 ;
    char letras = 'A' ;

    String[][] tablero = new String[COLUMNA][FILA] ;
    
    /**
     * Crea el tablero para jugar a Hundir la Flota.
     * 
     * @param visualizar booleano. Introduce true para visualizar el tablero y false para ocultarlo.
     */
    
    public static void tablero(boolean visualizar){ //true para visualizar, false para ocultar
        
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
            tablero[i][0] = "[" + Character.toString(letras) + "]";
            letras++;
            
            for (int j = 1; j < FILA; j++)
            {
                tablero[0][j] = "[" + (Integer.toString(j)) + "]";
            }
        }
        
        // Visualizar tablero
        
        if (visualizar == true)
        {
            for (int i = 0; i < COLUMNA; i++)
            {
            System.out.println("\n");
            
                for (int j = 0; j < FILA; j++)
                {
                    System.out.print(tablero[i][j] + "     ");
                }
            }
            
        }
        System.out.println("\n");
        
    }
        public static void main(String[] args) {
            tablero(false);
    }
}
