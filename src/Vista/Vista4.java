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
public class Vista4 implements Vista{
    private Scene escena;
    private VBox layout;
    private Label lbOpcion;
    private Button register;
    private Button login;
      private Image imagen;
      private AnchorPane panel;
    
     public Vista4() {
       this.panel= new AnchorPane();
        Canvas canvas=new Canvas(ANCHO,ALTO);
        GraphicsContext lapiz= canvas.getGraphicsContext2D();
        panel.getChildren().add(canvas);
       lapiz.setFill(Color.WHITE);
       lapiz.fillRect(0, 0, ANCHO, ALTO);
       this.imagen=new Image("Imagenes/logo.jpg");
       lapiz.drawImage(imagen, ANCHO/2-150,-20);  
         
         
        this.lbOpcion=new Label("Registrese en Register. Si ya existe su usuario, escoja login");
        this.register=new Button("Register");
        this.login=new Button("Login");
        lbOpcion.setFont(Font.font("Calibri",15));
        AnchorPane.setLeftAnchor(lbOpcion,130.00);
      AnchorPane.setTopAnchor(lbOpcion,15.00);
      AnchorPane.setLeftAnchor(register,180.00);
      AnchorPane.setTopAnchor(register,60.00);
       AnchorPane.setLeftAnchor(login,340.00);
      AnchorPane.setTopAnchor(login,60.00);
      
      panel.getChildren().addAll(lbOpcion,register,login);
        
        
        
        
        this.escena = new Scene (panel,ANCHO,ALTO);
    }
    @Override
    public Scene getScene() {
        return escena;
    }

    public Button getRegister() {
        return register;
    }
    public Button getLogin() {
        return login;
    }
    public AnchorPane getPanel() {
        return panel;
    }

    
}
