/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_cc;

import utilidades.IO_ES;

/**
 * Realiza operaciones con arrays eligiendo entre los distintos métodos a través del submenú.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class Arrays {
    
    /**
     * Muestras los primeros 10 números pares contenidos en un array de 10 posiciones.
     */
    
    public void muestraDiezPrimerosNumerosPares(){
        
        int numeroPar = 2;
        int [] array = new int [10] ;
        
        for (int i = 0; i < 10; i++) {
            
            array[i] = numeroPar ;
            numeroPar +=2 ;
            
            System.out.print(array[i] + " ");
            
        }
        
    }
    
    /**
     * Crea un array de 10 posiciones con valores aleatorios entre 1 y 20. 
     * Pide un número por teclado y nos dirá si ese número está dentro de los valores del
     * array y la posición que ocupa.
     */
    
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
            
            if (validador == false)
            {
                IO_ES.escribirLN("El número no coincide, sigue intentándolo.");
            }
            
        } while (validador == false);
            
    }
    
    /**
     * Crea un array de números decimales con un tamaño dado por el usuario por teclado.
     * Sus valores serán aleatorios. Obtendrá de ellos la media, el número más alto y
     * el más bajo y lo mostrará por pantalla.
     */
    
    public void compruebaTamanoArrayDecimal(){
        
        // ------ DECLARACIONES ----------
        
        int numeroUsuario ;
        double media ;
        double suma = 0;
        double valor1 ;
        double valor2 ;
        double numeroMasAlto = 0;
        double numeroMasBajo = 100 ;
        
        double array [] ; // El array de tipo double (decimal)
        
        numeroUsuario = IO_ES.leerInteger("\nIntroduce la longitud del array: "); // Se pide al usuario que introduzca por teclado el tamaño del array
        
        array = new double [numeroUsuario] ; // Se declara el espacio del array a partir de la información del usuario.
        
        // --------- PROCESAMIENTO ----------
        
        for (int i = 0; i < array.length; i++) { // Asigna valores y acumula para calcular más tarde la media.
            
            array[i] = Math.round(Math.random()*100) ; // El enunciado no especifica el rango. He elegido de 0 a 100. 
            
            System.out.print(array[i] + " ");
            
            suma += array[i] ; // Acumula los valores de cada posición del array.
        }
        
        System.out.println();
        media = suma / array.length ; // Realiza la media 
        
        // Calcular el valor más alto
        
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
        
        // Calcular el valor más bajo
        
        for (int i = 0; i < (array.length - 1); i++) 
        {
            valor1 = array[i] ;
            valor2 = array[i+1] ;
            
            if (valor1 < valor2 )
            {
                if (valor1 < numeroMasBajo) 
                {
                    numeroMasBajo = valor1 ;
                }
                 
            }
            else if (valor1 > valor2)
            {
                if (valor2 < numeroMasBajo) 
                {
                    numeroMasBajo = valor2 ;
                }
                 
            }
            
                            
        }
        
        // ------- SALIDA DE DATOS -----------
        
        IO_ES.escribirLN("-------------------------------------------");
        IO_ES.escribirLN("\nLa media de los números contenidos en el array es: " + media);
        IO_ES.escribirLN("\nEl número más alto es: " + numeroMasAlto);
        IO_ES.escribirLN("\nEl número más bajo es: " + numeroMasBajo);

        
    }
    public static void main(String[] args) {
        Arrays objeto = new Arrays();
//        objeto.arrayPosicionesAleatorias();
//        objeto.muestraDiezPrimerosNumerosPares();
        objeto.compruebaTamanoArrayDecimal();
    }
}
    
    
    
    
    

