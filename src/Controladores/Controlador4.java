/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import static Controladores.Controlador.modelo;
import Logica.Plataforma;
import Vista.Vista2;
import Vista.Vista4;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

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
    private Label BnoExiste;
    
    public Controlador4(Plataforma modelo,int usuario, int sigVista) {
        super(modelo);
        this.vista=new Vista4();
        this.usuario=usuario;
        this.sigVista=sigVista;
        this.vista.getRegister().setOnAction(new Evento(0));
        this.vista.getLogin().setOnAction(new Evento(1));
        this.lbUsuario=new Label("Usuario");
        this.lbContraseña=new Label("Contraseña");
        this.next=new Button ("Guardar");
        this.BnoExiste=new Label("El usuario ya existe");
        this.tfUsuario=new TextField();
        this.tfContraseña=new TextField();   
        this.fila1=new HBox();
        this.fila2=new HBox();
    }
     public Vista4 getVista() {
        return vista;
    }



    private class Evento implements EventHandler<ActionEvent> {
        private int opcion;
        private Evento(int i) {
        this.opcion=i;
        }

        @Override
        public void handle(ActionEvent event) {
        AnchorPane panel= vista.getPanel();
         vista.getLogin().setDisable(true);
        vista.getRegister().setDisable(true);
        fila1.getChildren().add(lbUsuario);
        fila1.getChildren().add(tfUsuario);
        fila2.getChildren().add(lbContraseña);
        fila2.getChildren().add(tfContraseña);
        
        panel.setLeftAnchor(fila1,165.00);
        panel.setTopAnchor(fila1,120.00);
        panel.setLeftAnchor(fila2,145.00);
        panel.setTopAnchor(fila2,160.00);
        panel.setLeftAnchor(next,275.00);
        panel.setTopAnchor(next,200.00);
        
        panel.getChildren().add(fila1);
        panel.getChildren().add(fila2);
        panel.getChildren().add(next);
        if(opcion==0){
        next.setOnAction(new Registro());
        }else{
        next.setOnAction(new Login());
        }
            
        }
        
    }
    private class Registro implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
        String usuarioS=tfUsuario.getText();
        String contraseña=tfContraseña.getText();
       
        Controlador controlador=null;
        if(usuario==0){
            try {
                modelo.registrarPromotor(usuarioS, contraseña);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador4.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(sigVista==0){
        controlador=new Controlador5(modelo,usuarioS);
        }else if(sigVista==1){
        controlador=new Controlador6(modelo,usuarioS);
        }
        }else{
            try {
                modelo.registrarAportante(usuarioS,contraseña);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador4.class.getName()).log(Level.SEVERE, null, ex);
            }
             if(sigVista==2){
           controlador= new Controlador7(modelo,usuarioS);
        }
        else if (sigVista==3){
            controlador= new Controlador8(modelo,usuarioS);
        }

        }
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene esc=controlador.getVista().getScene();
        stage.setScene(esc);
        stage.show();
        }

      
    }
    private class Login implements EventHandler<ActionEvent> {


        @Override
        public void handle(ActionEvent event) {
        String usuarioS=tfUsuario.getText();
        String contraseña=tfContraseña.getText();
        

        Controlador controlador=null;
        boolean noExiste=false;
        if(usuario==0){
        noExiste=modelo.loginPromotor(usuarioS, contraseña);
        if(sigVista==0){   
        controlador=new Controlador5(modelo,usuarioS);
        }else{
        controlador=new Controlador6(modelo,usuarioS);
        }
        }else{
        noExiste=modelo.loginAportante(usuarioS,contraseña);
        if(sigVista==2){   
        controlador=new Controlador7(modelo,usuarioS);
        }else{
        controlador=new Controlador8(modelo,usuarioS);
        }
        }
        if(noExiste==true){
        vista.getPanel().getChildren().add(BnoExiste);
        }else{
        Singleton singleton=Singleton.getSingleton();
        Stage stage=singleton.getStage();
        Scene esc=controlador.getVista().getScene();
        stage.setScene(esc);
        stage.show();
        }
            }
    }
    
}
