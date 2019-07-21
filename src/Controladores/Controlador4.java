/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Logica.Plataforma;
import Vista.Vista4;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author usuario
 */
public class Controlador4 extends Controlador{
    private Vista4 vista;
    private Label lbUsuario;
    private Label lbContraseña;
    private TextField tfUsuario;
    private TextField tfContraseña;
    private Button next;
    private HBox fila1;
    private HBox fila2;
    private int usuario;
    private int sigVista;
    public Controlador4(Plataforma modelo,int usuario, int sigVista) {
        super(modelo);
        this.vista=new Vista4();
        this.usuario=usuario;
        this.sigVista=sigVista;
        this.vista.getLogin().setOnAction(new Evento());
        this.vista.getRegister().setOnAction(new Evento());
        this.lbUsuario=new Label("Usuario");
        this.lbContraseña=new Label("Contraseña");
        this.next=new Button ("Guardar");
        this.tfUsuario=new TextField();
        this.tfContraseña=new TextField();   
        this.fila1=new HBox();
        this.fila2=new HBox();
    }

    private class Evento implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
        
        fila1.getChildren().add(lbUsuario);
        fila1.getChildren().add(tfUsuario);
        fila2.getChildren().add(lbContraseña);
        fila2.getChildren().add(tfContraseña);
        vista.getLayout().getChildren().add(fila1);
        vista.getLayout().getChildren().add(fila2);
        vista.getLayout().getChildren().add(next);
        
        }
        
    }

    private class Login implements EventHandler<ActionEvent> {

        private Login(int usuario, int sigVista) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void handle(ActionEvent event) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
