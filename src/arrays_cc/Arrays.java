/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_cc;

import utilidades.IO_ES;

/**
 *
 * @author Adrián Arjona
 * @version 1.0
 */
public class Arrays {
    
    public void muestraDiezPrimerosNumerosPares(){
        
        int numeroPar = 2;
        int [] array = new int [10] ;
        
        for (int i = 0; i < 10; i++) {
            
            array[i] = numeroPar ;
            numeroPar +=2 ;
            
            System.out.print(array[i] + " ");
            
        }
        
    }
    
    public void arrayPosicionesAleatorias(){
        
        boolean validador = false ;
        int [] array = new int [10] ;
        
        for (int i = 0; i < 10; i++) { // Relleno el array con números aleatorios entre 0 y 20.
            
            array[i] = (int)Math.round(Math.random()*20);
            
            System.out.print(array[i] + " "); // Esta línea no es necesaria según el enunciado pero la incluyo porque facilita la corrección (y la creación).
                        
        }
        
        System.out.println();
                
        do 
        {
            int numeroUsuario = IO_ES.leerInteger("\nIntroduce un número entero: ");
            
            for (int i = 0; i < 10; i++) {
            
                if (array[i] == numeroUsuario) 
                {
                    IO_ES.escribirLN("La coincidencia se ha dado en la posición " + (i+1));
                    validador = true;
                }
            }
            
        } while (validador == false);
            
    }
    
    public void compruebaTamanoArrayDecimal(){
        
        // ------ DECLARACIONES ----------
        
        int numeroUsuario ;
        double media ;
        double suma = 0;
        double valor1 ;
        double valor2 ;
        double numeroMasAlto = 0;
        double numeroMasBajo = 0 ;
        
        double array [] ; // El array de tipo double (decimal)
        
        numeroUsuario = IO_ES.leerInteger("\nIntroduce la longitud del array: "); // Se pide al usuario que introduzca por teclado el tamaño del array
        
        array = new double [numeroUsuario] ; // Se declara el espacio del array a partir de la información del usuario.
        
        // --------- PROCESAMIENTO ----------
        
        for (int i = 0; i < array.length; i++) { // Asigna valores y acumula para calcular más tarde la media.
            
            array[i] = Math.round(Math.random()*100) ; // El enunciado no especifica el rango. He elegido de 0 a 100. 
            
            System.out.print(array[i] + " ");
            
            suma += array[i] ; // Acumula los valores de cada posición del array.
        }
        
        media = suma / array.length ; // Realiza la media 
        
        for (int i = 0; i < (array.length - 1); i++) 
        {
            valor1 = array[i] ;
            valor2 = array[i+1] ;
            
            if (valor1 > valor2 )
            {
                if (valor1 > numeroMasAlto) 
                {
                    numeroMasAlto = valor1 ;
                }
                 
            }
            else if (valor1 < valor2)
            {
                if (valor2 > numeroMasAlto) 
                {
                    numeroMasAlto = valor2 ;
                }
                 
            }
            
                            
        }
        
        // ------- SALIDA DE DATOS -----------
        
        IO_ES.escribirLN("\nLa media de los números contenidos en el array : " + media);
        IO_ES.escribirLN("\nEl número más alto es " + numeroMasAlto);

        
    }
        
    public static void main(String[] args) {
        Arrays objeto = new Arrays();
//        objeto.muestraDiezPrimerosNumerosPares();
//           objeto.arrayPosicionesAleatorias();
            objeto.compruebaTamanoArrayDecimal();
        }
    
}
    
    
    
    
    

