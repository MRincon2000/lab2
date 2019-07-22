/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import static Controladores.Controlador.modelo;
import Logica.Plataforma;
import Logica.Promotor;
import Logica.Proyecto;
import Vista.Vista6;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class Controlador6 extends Controlador{
    private Vista6 vista;

    public Controlador6(Plataforma modelo, String usuarioS) {
       super(modelo);
       this.vista=new Vista6();
       for(Promotor promotor: modelo.getPromotores()){
           if(usuarioS.equals(promotor.getUsuario())){
                for(Proyecto proyecto: promotor.getProyectos()){
                
                Label aportante=null;
                if(proyecto.getAportanteGanador()==null){
                aportante=new Label("No hay aportante");
                }else{
                    aportante=new Label(proyecto.getAportanteGanador().getUsuario());
                }
                vista.getColumna1().getChildren().add(new Label(proyecto.getNombre()));
                vista.getColumna2().getChildren().add(new Label(""+proyecto.getPrecioMin()));
                vista.getColumna3().getChildren().add(new Label(""+proyecto.getPrecioMax()));
                vista.getColumna4().getChildren().add(new Label(""+proyecto.getPrecioOfertado()));
                vista.getColumna5().getChildren().add(aportante);
               }
                break;
               }
          
               }
       this.vista.getSalir().setOnAction(new Evento());
       }
    
    
    public Vista6 getVista() {
        return vista;
    }

    private static class Evento implements EventHandler<ActionEvent> {
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

