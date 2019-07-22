/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.*;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


/**
 *
 * @author usuario
 */
public class Vista1 implements Vista{
    private VBox layout;
    private Scene escena;
    private Image imagen;
    private Button promotor;
    private Button aportante;
    private Label lbTitulo;
    private Label lbSlogan;
    private Label lbOpciones;
    
    public Vista1() {
        
        AnchorPane panel= new AnchorPane();
        Canvas canvas=new Canvas(ANCHO,ALTO);
        GraphicsContext lapiz= canvas.getGraphicsContext2D();
        panel.getChildren().add(canvas);
       lapiz.setFill(Color.WHITE);
        lapiz.fillRect(0, 0, ANCHO, ALTO);
    
        


     this.imagen=new Image ("Imagenes/logo.jpg");
     lapiz.drawImage(imagen,ANCHO/2-105,-20,210,210);
     this.aportante=new Button("Aportante");
     this.promotor=new Button("Promotor");
     this.lbTitulo=new Label("Presencia & Plata");
     this.lbSlogan=new Label("La plataforma de emprendedores para emprendedores ");
     this.lbOpciones=new Label("Elija su rol:");
     
     lbTitulo.setFont(Font.font("Calibri", FontWeight.BOLD, 30));
     lbSlogan.setFont(Font.font("Calibri",15));
     
     lbOpciones.setFont(Font.font("Calibri",15));
     
     AnchorPane.setLeftAnchor(lbTitulo,180.00);
      AnchorPane.setTopAnchor(lbTitulo,30.00);
     AnchorPane.setLeftAnchor(lbSlogan,130.00);
      AnchorPane.setTopAnchor(lbSlogan,140.00);
       AnchorPane.setLeftAnchor(lbOpciones,265.00);
      AnchorPane.setTopAnchor(lbOpciones,180.00);
      AnchorPane.setLeftAnchor(aportante,255.00);
      AnchorPane.setTopAnchor(aportante,200.00);
       AnchorPane.setLeftAnchor(promotor,257.00);
      AnchorPane.setTopAnchor(promotor,240.00);
      
      
      
      panel.getChildren().addAll(lbSlogan,lbOpciones,aportante,promotor);
     this.escena=new Scene(panel,ANCHO,ALTO);
    }

    @Override
    public Scene getScene() {
    return escena;
    }

    public Button getPromotor() {
        return promotor;
    }

    public void setPromotor(Button promotor) {
        this.promotor = promotor;
    }

    public Button getAportante() {
        return aportante;
    }

    public void setAportante(Button aportante) {
        this.aportante = aportante;
    }
    
    
}
