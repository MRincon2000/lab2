/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import static Controladores.Controlador.modelo;
import Logica.Aportante;
import Logica.Plataforma;
import Logica.Proyecto;
import Logica.Subasta;
import Vista.Vista;
import Vista.Vista8;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Miguel Rincon
 */
public class Controlador8 extends Controlador{

    private Vista8 vista;
    

    public Controlador8(Plataforma modelo,String usuario) {
        super(modelo);
        this.vista=new Vista8();
        for(Aportante aportante: modelo.getAportantes()){
            if(aportante.getUsuario()==usuario){
                for(Proyecto proyecto:aportante.getProyectos()){

                vista.getColumna1().getChildren().add(new Label(aportante.getUsuario()));
                vista.getColumna2().getChildren().add(new Label(proyecto.getNombre()));
                vista.getColumna3().getChildren().add(new Label(""+proyecto.getPrecioOfertado()));
                vista.getColumna4().getChildren().add(new Label(proyecto.getUsuario()));
                }
    }
        }
        this.vista.getSalir().setOnAction( new Evento());
    }
    @Override
    public Vista getVista() {
      return vista;
    }
 private class Evento implements EventHandler<ActionEvent> {

        private Evento() {

        }

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
}
