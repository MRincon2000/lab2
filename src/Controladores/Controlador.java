/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Logica.Plataforma;

/**
 *
 * @author usuario
 */
public class Controlador {
    public static Plataforma modelo;

    public Controlador(Plataforma modelo) {
        this.modelo = modelo;
    }

    public Plataforma getModelo() {
        return modelo;
    }
    
    
}
