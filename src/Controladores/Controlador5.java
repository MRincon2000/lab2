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
import javafx.scene.control.Label;

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
        vista.getGuardar().setDisable(true);
        modelo.solicitarPrestamo(usuario, vista.getTfNombre().getText(),vista.getTfDescripcion().getText(),(vista.getsPMhundreds().getValue()*100000)+(vista.getsPMmillions().getValue()*1000000)+(vista.getsPMthousands().getValue()*1000), vista.getsPrecioMin().getValue());
        vista.getLayout().getChildren().add(new Label("Subasta Exitosa"));
        vista.getLayout().getChildren().add(new Label("Recuerde que cada hora el precio del producto se reduce un 5% hasta su precio minimo"));
        
        }

        
    }
    
    
}
