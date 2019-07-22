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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author Miguel Rincon
 */
public class Vista7 implements Vista{
    private Scene escena;
    private HBox layout;
    private VBox columna1;
    private VBox columna2;
    private VBox columna3;
    private VBox columna4;
    private VBox columna5;
    private Label nombrePromotor;
    private Label nombreProyecto;
    private Label precioActual;
    private Label descripcion;
    private Button salir;

    public HBox getLayout() {
        return layout;
    }
    public VBox getColumna1() {
        return columna1;
    }
    public VBox getColumna2() {
        return columna2;
    }
    public VBox getColumna3() {
        return columna3;
    }
    public VBox getColumna4() {
        return columna4;
    }
    public VBox getColumna5() {
        return columna5;
    }
    
    public Vista7() {
    this.layout=new HBox();
        layout.setSpacing(15);
        this.columna1=new VBox();
        this.columna2=new VBox();
        this.columna3=new VBox();
        this.columna4=new VBox();
        this.columna5=new VBox();
        this.nombrePromotor=new Label("    Promotor    ");
        this.nombreProyecto=new Label("    Proyecto    ");
        this.precioActual=new Label("    Precio Actual    ");
        this.descripcion=new Label("     Descripción    ");
        columna1.getChildren().add(nombrePromotor);
        columna2.getChildren().add(nombreProyecto);
        columna3.getChildren().add(precioActual);
        columna4.getChildren().add(descripcion);
        this.salir=new Button ("Salir");
        columna5.getChildren().add(salir);
        this.layout.getChildren().addAll(columna1,columna2,columna3,columna4,columna5);
        this.escena = new Scene(layout,ANCHO+200,ALTO);
    }
    
    
    @Override
    public Scene getScene() {
       return this.escena;
    }

    public Button getSalir() {
        return salir;
    }
    
}
