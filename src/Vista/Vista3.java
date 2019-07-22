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
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author usuario
 */
public class Vista3 implements Vista{
    private Scene escena;
    private Image imagen;
    private Label lbOpcion;
    private Button subastas;
    private Button verProyectos;
    
     public Vista3() {
           AnchorPane panel= new AnchorPane();
        Canvas canvas=new Canvas(ANCHO,ALTO);
        GraphicsContext lapiz= canvas.getGraphicsContext2D();
        panel.getChildren().add(canvas);
       lapiz.setFill(Color.WHITE);
       lapiz.fillRect(0, 0, ANCHO, ALTO);
       this.imagen=new Image("Imagenes/logo.jpg");
       lapiz.drawImage(imagen, ANCHO/2-105,-20,210,210);
       
       this.lbOpcion=new Label("Elija su opción");
        this.subastas=new Button("Ver subastas disponibles");
        this.verProyectos=new Button("Ver proyectos invertidos");
      
     AnchorPane.setLeftAnchor(lbOpcion,255.00);
      AnchorPane.setTopAnchor(lbOpcion,160.00);
      AnchorPane.setLeftAnchor(subastas,210.00);
      AnchorPane.setTopAnchor(subastas,190.00);
       AnchorPane.setLeftAnchor(verProyectos,211.50);
      AnchorPane.setTopAnchor(verProyectos,230.00);
         
      panel.getChildren().addAll(lbOpcion,subastas,verProyectos);
        
        
        this.escena = new Scene (panel,ANCHO,ALTO);
    }
    @Override
    public Scene getScene() {
        return escena;
    }
}
