/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cicloinfinito2;

/**
 *
 * @author lucho
 */
public class CICLOINFINITO2 {

        public static void main(String[] args) {
        Ciclo();
    }
    
    public static void Ciclo() {
        int contador = 0;
        while (contador < 10) {
            contador = 0;
            System.out.println("Este ciclo se ejecutará 10 veces.");
            contador++;
        }
    }
}

