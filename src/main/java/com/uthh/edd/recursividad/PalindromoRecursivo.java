/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */package com.uthh.edd.recursividad;
public class PalindromoRecursivo {
    
    public boolean esPalindromo(String palabra){
        
        String palabraLimpio=palabra.toLowerCase().replaceAll("\\s+","");
        return esPalindromoRecursivo (palabraLimpio, 0, palabraLimpio.length() - 1);
    }
    public boolean esPalindromoRecursivo(String palabra, int inicio, int fin)
    {
        if(inicio>=fin)
        {
            return true;
        }
        else if (palabra.charAt(inicio) != palabra.charAt(fin)){
            return false;
        }
        return esPalindromoRecursivo(palabra, inicio + 1, fin -1 );
    
    }
    
}
