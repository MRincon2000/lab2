/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;


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
     this.layout=new VBox();
     //this.imagen=new Image ("");
     this.aportante=new Button("Aportante");
     this.promotor=new Button("Promotor");
     this.lbTitulo=new Label("CrowdFunding");
     this.lbSlogan=new Label("La plataforma de emprendedores para emprendedores ");
     this.lbOpciones=new Label("Eliga su rol");
     layout.getChildren().add(lbTitulo);
     layout.getChildren().add(lbSlogan);
     layout.getChildren().add(lbOpciones);
     layout.getChildren().add(promotor);
     layout.getChildren().add(aportante);
     this.escena=new Scene(layout,ANCHO,ALTO);
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
