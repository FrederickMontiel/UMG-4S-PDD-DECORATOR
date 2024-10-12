/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patrones;

/**
 *
 * @author PC
 */
public class Delantero extends JugadorDecorador {
    public Delantero(Persona jugador) {
        super(jugador);
    }

    @Override
    public String getDescripcion() {
        return jugador.getDescripcion() + ", que juega como Delantero";
    }

    public void anotarGol() {
        System.out.println("El delantero anota un gol.");
    }
}
