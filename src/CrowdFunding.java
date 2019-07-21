
import Controladores.Controlador1;
import Controladores.Singleton;
import Logica.Plataforma;
import Vista.Vista;
import javafx.application.Application;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class CrowdFunding extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      Plataforma CrowdFunding=new Plataforma();
      Singleton singleton = Singleton.getSingleton();
      singleton.setStage(primaryStage);
      Controlador1 controlador = new Controlador1(CrowdFunding);
      Vista vista = controlador.getVista();
      primaryStage.setScene(vista.getScene());
      primaryStage.show();
    }
    
}
