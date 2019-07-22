/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Vista.ALTO;
import static Vista.Vista.ANCHO;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

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
private HBox fila5;
private HBox fila6;
private HBox fila7;
private Label lbNombre;
private Label lbDescripcion;
private Label lbPrecioMax;
private Label lbPrecioMin;
private TextField tfNombre;
private TextField tfDescripcion;
private Label lbMillion;
private Label lbHundreds;
private Label lbThousands;
private Spinner <Double> sPMmillions;
private Spinner <Double> sPMhundreds;
private Spinner <Double> sPMthousands;
private Spinner <Double> sPrecioMin;
private Button guardar;
private Button salir;
private Image imagen;



    public Vista5() {
        
        AnchorPane panel= new AnchorPane();
        Canvas canvas=new Canvas(ANCHO+50,ALTO+50);
        GraphicsContext lapiz= canvas.getGraphicsContext2D();
        panel.getChildren().add(canvas);
       lapiz.setFill(Color.WHITE);
        lapiz.fillRect(0, 0, ANCHO+50, ALTO+50);
    
        


     this.imagen=new Image ("Imagenes/logo.jpg");
     lapiz.drawImage(imagen,380,-20,210,210);
        
        
        
        
        this.layout=new VBox();
        this.fila1=new  HBox();
        this.fila2=new  HBox();
        this.fila3=new  HBox();
        this.fila4=new  HBox();
        this.fila5=new  HBox();
        this.fila6=new  HBox();
        this.fila7=new  HBox();
        this.lbNombre = new Label("Nombre del Proyecto");
        this.lbDescripcion = new Label ("Decripción del Proyecto");
        this.lbPrecioMax = new Label ("Precio maximo de inversión:");
        this.lbPrecioMin = new Label("Precio minimo (Porcentaje del Precio Maximo):            ");
        this.tfNombre = new TextField();
        this.tfDescripcion = new TextField();
        this.lbMillion=new Label ("Millones:  ");
        this.lbHundreds=new Label ("Cientos de Miles:  ");
        this.lbThousands=new Label ("Miles: ");
        this.sPMmillions = new Spinner<>();
        this.sPMhundreds = new Spinner<>();
        this.sPMthousands = new Spinner<>();
        this.sPrecioMin=new Spinner<>();
        this.sPMhundreds.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0,9,0));
        this.sPMthousands.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0,9,0));
        this.sPMmillions.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0,50,0));
        this.sPrecioMin.setValueFactory(new SpinnerValueFactory.DoubleSpinnerValueFactory(0,50,0));
        this.guardar = new Button("Iniciar Subasta");
        this.salir=new Button("Salir");
        fila1.getChildren().addAll(lbNombre,tfNombre);
        fila2.getChildren().addAll(lbDescripcion,tfDescripcion);
        fila3.getChildren().addAll(lbPrecioMax);
        fila5.getChildren().addAll(lbHundreds,sPMhundreds);
        fila6.getChildren().addAll(lbThousands,sPMthousands);
        fila7.getChildren().addAll(lbMillion,sPMmillions);
        fila4.getChildren().addAll(lbPrecioMin,sPrecioMin);
        layout.getChildren().addAll(fila1,fila2,fila3,fila5,fila6,fila7,fila4,guardar);
       panel.setLeftAnchor(layout,20.00);
       panel.setTopAnchor(layout,20.00);
        panel.getChildren().add(layout);
        
        this.escena = new Scene(panel,ANCHO+50,ALTO+50);
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
    public Spinner<Double> getsPMmillions() {
        return sPMmillions;
    }
    public Spinner<Double> getsPMhundreds() {
        return sPMhundreds;
    }
    public Spinner<Double> getsPMthousands() {
        return sPMthousands;
    }
    public Spinner<Double> getsPrecioMin() {
        return sPrecioMin;
    }

    public VBox getLayout() {
        return layout;
    }
    public Button getSalir() {
        return salir;
    }
    
    



    @Override
    public Scene getScene() {
      return escena;
        }
 
    
}
