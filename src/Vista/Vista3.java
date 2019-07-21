/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Vista.ALTO;
import static Vista.Vista.ANCHO;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author usuario
 */
public class Vista3 implements Vista{
    private Scene escena;
    private VBox layout;
    private Label lbOpcion;
    private Button subastas;
    private Button verProyectos;
    
     public Vista3() {
        this.layout=new VBox ();
        this.lbOpcion=new Label("Eliga su opción");
        this.subastas=new Button("Ver subastas disponibles");
        this.verProyectos=new Button("Ver proyectos invertidos");
        this.layout.getChildren().add(lbOpcion);
        this.layout.getChildren().add(subastas);
        this.layout.getChildren().add(verProyectos);
        this.escena = new Scene (layout,ANCHO,ALTO);
    }
    @Override
    public Scene getScene() {
        return escena;
    }
}
