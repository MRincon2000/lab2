/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Vista.ALTO;
import static Vista.Vista.ANCHO;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author usuario
 */
public class Vista2 implements Vista {
    private Scene escena;
    
    private Label lbOpcion;
    private Button prestamo;
    private Button verProyectos;
    private Image imagen;

    public Vista2() {
       AnchorPane panel= new AnchorPane();
        Canvas canvas=new Canvas(ANCHO,ALTO);
        GraphicsContext lapiz= canvas.getGraphicsContext2D();
        panel.getChildren().add(canvas);
         lapiz.setFill(Color.WHITE);
        lapiz.fillRect(0, 0, ANCHO, ALTO);
        this.imagen=new Image("Imagenes/logo.jpg");
        lapiz.drawImage(imagen, ANCHO/2-105,-20,210,210);
     
        this.lbOpcion=new Label("Elija su opción");
        this.prestamo=new Button("Solicitar Prestamo");
        this.verProyectos=new Button("Ver proyectos");
     lbOpcion.setFont(Font.font("Calibri",15));   
        
        AnchorPane.setLeftAnchor(lbOpcion,255.00);
      AnchorPane.setTopAnchor(lbOpcion,160.00);
      AnchorPane.setLeftAnchor(prestamo,227.00);
      AnchorPane.setTopAnchor(prestamo,190.00);
       AnchorPane.setLeftAnchor(verProyectos,240.00);
      AnchorPane.setTopAnchor(verProyectos,230.00);
      
       
       
        panel.getChildren().addAll(lbOpcion,prestamo,verProyectos);
        
        this.escena = new Scene (panel,ANCHO,ALTO);
    }
    
    @Override
    public Scene getScene() {
        return escena;
    }
    public Button getPrestamo() {
        return prestamo;
    }

    public Button getVerProyectos() {
        return verProyectos;
    }
    
    
}
