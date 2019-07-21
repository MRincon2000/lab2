/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 *
 * @author usuario
 */
public class Vista2 implements Vista {
    private Scene escena;
    private VBox layout;
    private Label lbOpcion;
    private Button prestamo;
    private Button verProyectos;

    public Vista2() {
        this.layout=new VBox ();
        this.lbOpcion=new Label("Eliga su opción");
        this.prestamo=new Button("Solicitar Prestamo");
        this.verProyectos=new Button("Ver proyectos");
        this.layout.getChildren().add(lbOpcion);
        this.layout.getChildren().add(prestamo);
        this.layout.getChildren().add(verProyectos);
        this.escena = new Scene (layout,ANCHO,ALTO);
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
