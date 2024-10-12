/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patrones;

/**
 *
 * @author PC
 */
public abstract class JugadorDecorador implements Persona {
    protected Persona jugador;

    public JugadorDecorador(Persona jugador) {
        this.jugador = jugador;
    }

    @Override
    public String getDescripcion() {
        return jugador.getDescripcion();
    }
}