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
     * Muestra los primeros 10 números pares contenidos en un array de 10 posiciones.
     */
    
    public void muestraArrayDiezPrimerosNumerosPares(){
        
        int numeroPar = 2;
        int [] array = new int [10] ;
        
        IO_ES.escribirLN("\nA continuación se van a mostrar los 10 primeros números pares contenidos"
                + " en el array:\n");
        
        for (int i = 0; i < 10; i++) {
            
            array[i] = numeroPar ;
            numeroPar +=2 ;
            
            System.out.print(array[i] + " ");
            
        }
        System.out.println();
        
    }
    
    /**
     * Crea un array de 10 posiciones con valores aleatorios entre 1 y 20. 
     * Pide un número por teclado y nos dirá si ese número está dentro de los valores del
     * array y la posición que ocupa.
     */
    
    public void arrayAdivinaNumeroHasta20(){
        
        boolean validador = false ;
        int [] array = new int [10] ;
        
        IO_ES.escribirLN("\nVamos a intentar adivinar un número comprendido entre el 1 y el 20.");
        
        for (int i = 0; i < 10; i++) { // Relleno el array con números aleatorios entre 1 y 20.
            
            array[i] = (int)Math.round(Math.random()*20);
            
//            System.out.print(array[i] + " "); // Esta línea no es necesaria según el enunciado pero la incluyo porque facilita la corrección (y la creación).
                        
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
    
    public void arrayObtieneMediaNumeroAltoBajo(){
        
        // ------ DECLARACIONES ----------
        
        int numeroUsuario ;
        double media ;
        double suma = 0;
        double valor1 ;
        double valor2 ;
        double numeroMasAlto = 0;
        double numeroMasBajo = 100 ;
        
        double array [] ; // El array de tipo double (decimal)
        
        IO_ES.escribirLN("\nVamos a crear un array y a partir de él extraer la media, el número más alto"
                + " y el número más bajo.") ;
        
        numeroUsuario = IO_ES.leerInteger("\nIntroduce la longitud del array: "); // Se pide al usuario que introduzca por teclado el tamaño del array
        IO_ES.escribir("VALORES: ") ;
        
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
    
    /**
     * Muestra la cantidad de números mayores y menores que 50 a patir de un array
     * de longitud definida por el usuario y de valores aleatorios.
     */
    
    public void ArrayNumerosMayoresMenores50(){
        
        // ------------ DECLARACIONES --------------
        
        int numeroUsuario ;
        int array[] ;
        int numero ;
        int contadorMayor = 0;
        int contadorMenor = 0;
        
        
        // ----------- PROCESAMIENTO ------------
        
        IO_ES.escribirLN("\nVamos a obtener aleatoriamente valores mayores o menores que 50 a partir de un array.");
        
        numeroUsuario = IO_ES.leerInteger("\nIntroduce la longitud del array, por favor: ") ;
        array = new int [numeroUsuario] ; // Ya tenemos creado el array
        
        IO_ES.escribir("VALORES: ");
        
        for (int i = 0; i < array.length; i++) { // Asignación de valores aleatorios entre 0 y 100.
            
            array[i] = (int)Math.round(Math.random()*100) ;
            
            System.out.print(array[i] + " "); // Se puede desactivar. Sirve para visualizar los valores por pantalla, útil para corregir.
                
            }
        
        for (int i = 0; i < array.length; i++) { // Comprobación de números mayores / menores a 50.
                
                numero = array[i] ;
                
                if (numero > 50) // Cuenta si el número es mayor que 50.
                {
                    contadorMayor++ ;
                }
                else if (numero < 50) // Cuenta si el número es menor que 50.
                {
                    contadorMenor++ ;
                }
        
        }
        
        // ------- SALIDA DE DATOS --------------
        IO_ES.escribirLN("\n--------------------------");
        IO_ES.escribirLN("\nNúmero(s) mayor(es) que 50: " + contadorMayor);
        IO_ES.escribirLN("Número(s) menor(es) que 50: " + contadorMenor);
        
    }
    
    
    /**
     * Submenú para elegir entre los distintos métodos de la clase Arrays. Se le llama
     * submenú porque está pensado para integrarse en otro menú.
     */
    
    public static void opcionesMenu(){
        
        // DECLARACIÓN DE VARIABLES
        
        boolean validador = false ;
        int opcion;
        
        String azul="\033[34m";
        String reset="\u001B[0m";
        
        Arrays objeto = new Arrays() ; 
        
        // PROCESAMIENTO
        
        do {
            
            IO_ES.escribirLN(azul + "\nBienvenido/a al submenú de ejercicios de arrays." + reset);
            IO_ES.escribirLN("---------------------------------------------");
            IO_ES.escribirLN("1. Array 10 primeros números pares.");
            IO_ES.escribirLN("2. Adivinar número del array comprendido entre 1 y 20.");
            IO_ES.escribirLN("3. Obtener del array la media, el número más alto y el más bajo.");
            IO_ES.escribirLN("4. Obtener cantidad de números mayores y menores que 50 contenidos en el array.");
            IO_ES.escribirLN("\n-- Pulsa 0 para volver al menú principal.");
            
            opcion = IO_ES.leerInteger("\nSelecciona una opción a continuación. "); // Recoge el número entero del usuario.
            
                       
                switch (opcion)
                {

                    case 1: // Array 10 primeros números pares
                        
                        objeto.muestraArrayDiezPrimerosNumerosPares();
                        
                        break;

                    case 2: // Adivinar número del array comprendido entre 1 y 20.

                       objeto.arrayAdivinaNumeroHasta20();
                        
                        break;
                        
                    case 3: // Obtener del array la media, el número más alto y el más bajo.

                   objeto.arrayObtieneMediaNumeroAltoBajo();

                    break;
                    

                    case 4: // Obtener cantidad de números mayores y menores que 50 contenidos en el array.

                   objeto.ArrayNumerosMayoresMenores50();

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
        IO_ES.escribirLN("Saliendo del submenú.");
        IO_ES.escribirLN("--------------------------------------------");
    }
    
}
    
    
    
    
    

