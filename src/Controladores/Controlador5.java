/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Logica.Plataforma;
import Vista.Vista5;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author usuario
 */
public class Controlador5 extends Controlador{
    private Vista5 vista;
    private String usuario;
    private String contraseña;
    public Controlador5(Plataforma modelo, String usuario,String contraseña) {
        super(modelo);
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.vista=new Vista5();
        this.vista.getGuardar().setOnAction(new Evento());
    }

    @Override
    public Vista5 getVista() {
        return vista;
    }

    private class Evento implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
        modelo.solicitarPrestamo(usuario, contraseña, vista.getTfNombre().getText(),vista.getTfDescripcion().getText(),(double) vista.getTfPrecioMax().getText(),(double) vista.getTfPrecioMin().getText());
        }

        
    }
    
    
}
