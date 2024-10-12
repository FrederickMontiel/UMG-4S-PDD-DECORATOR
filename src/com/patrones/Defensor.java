/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patrones;

/**
 *
 * @author PC
 */
public class Defensor extends JugadorDecorador {
    public Defensor(Persona jugador) {
        super(jugador);
    }

    @Override
    public String getDescripcion() {
        return jugador.getDescripcion() + ", que juega como Defensor";
    }

    public void defender() {
        System.out.println("El defensor bloquea el ataque del equipo contrario.");
    }
}