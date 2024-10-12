/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.patrones;

/**
 *
 * @author PC
 */

public class Main {
    public static void main(String[] args) {
        // Crear un jugador base
        Persona jugador = new JugadorBase();
        
        // Decorar al jugador para que sea un Portero
        jugador = new Portero(jugador);
        System.out.println(jugador.getDescripcion());
        ((Portero) jugador).atajar(); // Método específico de Portero

        // Decorar al mismo jugador para que también sea Delantero
        jugador = new Delantero(jugador);
        System.out.println(jugador.getDescripcion());
        ((Delantero) jugador).anotarGol(); // Método específico de Delantero

        // Decorar al mismo jugador para que también sea Defensor
        jugador = new Defensor(jugador);
        System.out.println(jugador.getDescripcion());
        ((Defensor) jugador).defender(); // Método específico de Defensor
    }
}

