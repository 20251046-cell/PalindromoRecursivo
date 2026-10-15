/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.edd.recursividad;

/**
 *
 * @author hp
 */
public class Recursividad {

    public static void main(String[] args) {
        PalindromoRecursivo verificador = new PalindromoRecursivo();
        
       String palabraPrueba="Anita lava la tina";
       
       boolean resultado= verificador.esPalindromo(palabraPrueba);
       
       System.out.println("¿La palabra '" + palabraPrueba + "' es un palíndromo? " + resultado);
    }
}
