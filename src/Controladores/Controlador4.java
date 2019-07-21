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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        
        fila1.getChildren().add(lbUsuario);
        fila1.getChildren().add(tfUsuario);
        fila2.getChildren().add(lbContraseña);
        fila2.getChildren().add(tfContraseña);
        vista.getLayout().getChildren().add(fila1);
        vista.getLayout().getChildren().add(fila2);
        vista.getLayout().getChildren().add(next);
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
        vista.getLogin().setDisable(true);
        vista.getRegister().setDisable(true);
        Controlador controlador=null;
        if(usuario==0){
        modelo.registrarPromotor(usuarioS, contraseña);
        if(sigVista==0){
        controlador=new Controlador5(modelo,usuarioS,contraseña);
        }else{
        controlador=new Controlador6(modelo);
        }
        }else{
        modelo.registrarAportante(usuarioS,contraseña);

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
        vista.getLogin().setDisable(true);
        vista.getRegister().setDisable(true);

        Controlador controlador=null;
        boolean noExiste=false;
        if(usuario==0){
        noExiste=modelo.loginPromotor(usuarioS, contraseña);
        if(sigVista==0){   
        controlador=new Controlador5(modelo,usuarioS,contraseña);
        }else{
        controlador=new Controlador6(modelo);
        }
        }else{
        noExiste=modelo.loginAportante(usuarioS,contraseña);
        }
            if(noExiste==true){
        vista.getLayout().getChildren().add(BnoExiste);
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
