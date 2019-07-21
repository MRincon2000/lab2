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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Controlador2 extends Controlador  {
   private Vista2 vista;

    public Controlador2(Plataforma modelo) {
        super(modelo);
        this.vista = new Vista2();
        this.vista.getPrestamo().setOnAction(new Evento(0));
        this.vista.getVerProyectos().setOnAction(new Evento(1));
    }



   @Override
    public Vista2 getVista() {
        return vista;
    }


    private class Evento implements EventHandler<ActionEvent> {
        private int opcion;
        private Evento(int i) {
         this.opcion=i;
        }

        @Override
        public void handle(ActionEvent event) {
        Controlador4 controlador=new Controlador4(modelo,0,opcion);
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene esc=controlador.getVista().getScene();
        stage.setScene(esc);
        stage.show();
        }

    }

    }
   
   

