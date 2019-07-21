/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Vista.ALTO;
import static Vista.Vista.ANCHO;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

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
    
     public Vista4() {
        this.layout=new VBox ();
        this.lbOpcion=new Label("Registrese en Register. Si ya existe su usuario, escoja login");
        this.register=new Button("Register");
        this.login=new Button("Login");
        this.layout.getChildren().add(lbOpcion);
        this.layout.getChildren().add(register);
        this.layout.getChildren().add(login);
        this.escena = new Scene (layout,ANCHO,ALTO);
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
    public VBox getLayout() {
        return layout;
    }

    
}
