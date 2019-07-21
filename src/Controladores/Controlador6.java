/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Logica.Plataforma;
import Vista.Vista6;

/**
 *
 * @author usuario
 */
public class Controlador6 extends Controlador{
    private Vista6 vista;
    public Controlador6(Plataforma modelo) {
        super(modelo);
    }
    public Vista6 getVista() {
        return vista;
    }
}
