/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import static Controladores.Controlador.modelo;
import Logica.Plataforma;
import Vista.Vista1;
import Vista.Vista2;
import Vista.Vista3;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Controlador3 extends Controlador  {
   private Vista3 vista; 

    public Controlador3(Plataforma modelo) {
        super(modelo);
        this.vista=new Vista3 ();
   this.vista.getSubastas().setOnAction(new Evento(2));
   this.vista.getVerProyectos().setOnAction(new Evento(3));
    }

    
    public Vista3 getVista() {
        return vista;
    }
    public void setVista(Vista3 vista) {
        this.vista = vista;
    }
  private class Evento implements EventHandler<ActionEvent> {
        private int opcion;
        private Evento(int i) {
         this.opcion=i;
        }

        @Override
        public void handle(ActionEvent event) {
        Controlador4 controlador=new Controlador4(modelo,1,opcion);
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene esc=controlador.getVista().getScene();
        stage.setScene(esc);
        stage.show();
        }

    }
  
   
}
