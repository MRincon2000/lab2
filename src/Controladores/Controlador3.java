/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Logica.Plataforma;
import Vista.Vista1;
import Vista.Vista2;
import Vista.Vista3;

/**
 *
 * @author usuario
 */
public class Controlador3 extends Controlador  {
   private Vista3 vista; 

    public Controlador3(Plataforma modelo) {
        super(modelo);
        this.vista=new Vista3 ();
    }

    
    public Vista3 getVista() {
        return vista;
    }
    public void setVista(Vista3 vista) {
        this.vista = vista;
    }
   
   
}
