/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Logica.Plataforma;
import Vista.Vista1;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Controlador1 extends Controlador {
    private Vista1 vista;

    public Controlador1(Plataforma modelo) {
        super(modelo);
        this.vista = new Vista1();
        this.vista.getPromotor().setOnAction(new EventoPromotor());
        this.vista.getAportante().setOnAction(new EventoAportante ());
    }
    
    

    public Vista1 getVista() {
        return vista;
    }

    private class EventoAportante implements EventHandler<ActionEvent> {
       @Override
        public void handle(ActionEvent event) {
        Controlador3 controlador=new Controlador3(modelo);
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene esc=controlador.getVista().getScene();
        stage.setScene(esc);
        stage.show();
        }
        
    }

    private class EventoPromotor implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
        Controlador2 controlador=new Controlador2(modelo);
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene esc=controlador.getVista().getScene();
        stage.setScene(esc);
        stage.show();
        }    
    }
    
    
}
