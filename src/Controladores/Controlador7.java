/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import static Controladores.Controlador.modelo;
import Logica.Aportante;
import Logica.Plataforma;
import Logica.Promotor;
import Logica.Proyecto;
import Logica.Subasta;
import Vista.Vista;
import Vista.Vista7;
import java.util.Date;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Miguel Rincon
 */
public class Controlador7 extends Controlador{

    private Vista7 vista;
    
    public Controlador7(Plataforma modelo,String usuario) {
        super(modelo);
        this.vista= new Vista7();
         for(Subasta subasta: modelo.getSubastas()){
                vista.getColumna1().getChildren().add(new Label(subasta.getPromotor().getUsuario()));
                vista.getColumna2().getChildren().add(new Label(subasta.getProyecto().getNombre()));
                vista.getColumna3().getChildren().add(new Label(""+subasta.getPrecio_actual()));
                vista.getColumna4().getChildren().add(new Label(subasta.getProyecto().getDescripcion()));
                Button boton=new Button ("Tomar");
                boton.setOnAction(new tomarSubasta(boton,usuario,subasta.getFecha_creación()));
                vista.getColumna5().getChildren().add(boton);
               }
                           
        this.vista.getSalir().setOnAction(new Evento());
        
    }

    private class tomarSubasta implements EventHandler<ActionEvent> {
       private Button boton1;
        private String usuario1;
        private Date fecha;
        public tomarSubasta(Button boton,String usuario,Date fecha) {
           this.boton1=boton;
           this.usuario1=usuario;
           this.fecha=fecha;
        }
        
        @Override
        public void handle(ActionEvent t) {
        boton1.setDisable(true);
        modelo.tomarSubasta(usuario1, fecha);
        }
    
    }

 private class Evento implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
        Controlador1 controlador=new Controlador1(modelo);
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene esc=controlador.getVista().getScene();
        stage.setScene(esc);
        stage.show();
        }

    }

    @Override
    public Vista7 getVista() {
      return vista;
    }
    
}
