/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author usuario
 */
public class Vista5 implements Vista{
private Scene escena;
private VBox layout;
private HBox fila1;
private HBox fila2;
private HBox fila3;
private HBox fila4;
private Label lbNombre;
private Label lbDescripcion;
private Label lbPrecioMax;
private Label lbPrecioMin;
private TextField tfNombre;
private TextField tfDescripcion;
private TextField tfPrecioMax;
private TextField tfPrecioMin;
private Button guardar;

    public Vista5() {
        this.layout=new VBox();
        this.fila1=new  HBox();
        this.fila2=new  HBox();
        this.fila3=new  HBox();
        this.fila4=new  HBox();
        this.lbNombre = new Label("Nombre del Proyecto");
        this.lbDescripcion = new Label ("Decripción del Proyecto");
        this.lbPrecioMax = new Label ("Precio maximo de inversión");
        this.lbPrecioMin = new Label("Precio minimo de inversión");
        this.tfNombre = new TextField();
        this.tfDescripcion = new TextField();
        this.tfPrecioMax = new TextField();
        this.tfPrecioMin = new TextField();
        this.guardar = new Button("Iniciar Subasta");
        
        layout.getChildren().addAll(fila1,fila2,fila3,fila4,guardar);
        fila1.getChildren().addAll(lbNombre,tfNombre);
        fila2.getChildren().addAll(lbDescripcion,tfDescripcion);
        fila3.getChildren().addAll(lbPrecioMax,tfPrecioMax);
        fila4.getChildren().addAll(lbPrecioMin,tfPrecioMin);
        this.escena = new Scene(layout,ANCHO,ALTO);
    }

    public Button getGuardar() {
        return guardar;
    }

    public TextField getTfNombre() {
        return tfNombre;
    }
    public TextField getTfDescripcion() {
        return tfDescripcion;
    }
    public TextField getTfPrecioMax() {
        return tfPrecioMax;
    }
    public TextField getTfPrecioMin() {
        return tfPrecioMin;
    }
    

    @Override
    public Scene getScene() {
      return escena;
        }
    
}
