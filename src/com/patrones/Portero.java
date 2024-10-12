/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patrones;

/**
 *
 * @author PC
 */
public class Portero extends JugadorDecorador {
    public Portero(Persona jugador) {
        super(jugador);
    }

    @Override
    public String getDescripcion() {
        return jugador.getDescripcion() + ", que juega como Portero";
    }

    public void atajar() {
        System.out.println("El portero hace una atajada impresionante.");
    }
}