/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

/**
 *
 * @author usuario
 */
public class Plataforma {
    private ArrayList<Promotor> promotores;
    private ArrayList<Aportante> aportantes;
    private ArrayList <Subasta> subastas;

    public Plataforma() {
        this.promotores = new ArrayList<>();
        this.aportantes = new ArrayList<>();
        this.subastas = new ArrayList<>();
    }

    public ArrayList<Promotor> getPromotores() {
        return promotores;
    }
    public ArrayList<Aportante> getAportantes() {
        return aportantes;
    }
    public ArrayList<Subasta> getSubastas() {
        return subastas;
    }
    
    public void registrarPromotor(String usuario,String contraseña) throws FileNotFoundException{
        boolean yaExiste=false;
        for(Promotor promotor:this.promotores){
            if(promotor.getUsuario()==usuario){
                yaExiste=true;
            }
        }
        if(yaExiste!=true){
            this.promotores.add(new Promotor(usuario,contraseña));
            PrintStream salida= new PrintStream("Info_Aportantes_Promotores.txt");
            salida.println("Promotor"+" "+ usuario+" "+contraseña);
        }
    }
    public void registrarAportante(String usuario,String contraseña) throws FileNotFoundException{
        boolean yaExiste=false;
        for(Aportante aportante: this.aportantes){
            if(aportante.getUsuario()==usuario){
                yaExiste=true;
            }
        }
        if(yaExiste!=true){
            this.aportantes.add(new Aportante(usuario,contraseña));
            PrintStream salida= new PrintStream("Info_Aportantes_Promotores.txt");
            salida.println("Aportante"+" "+ usuario+" "+contraseña);
        }
    }
    public boolean loginPromotor (String usuario,String contraseña){
        for(Promotor promotor: this.promotores){
            if(promotor.getUsuario()==usuario && promotor.getContraseña()==contraseña){
                return true;
    }      
    }
         return false;
    }
    public boolean loginAportante (String usuario,String contraseña){
          for(Aportante aportante: this.aportantes){
            if(aportante.getUsuario()==usuario && aportante.getContraseña()==contraseña){
                return true;
    }           
}
          return false;
}
    
    public void solicitarPrestamo(String usuario,String nombre,String descripcion, double precioMax, double precioMin) throws FileNotFoundException{
        Promotor solicitor=null;
        Proyecto proyecto=null;
        for(Promotor promotor:this.promotores){
        if(promotor.getUsuario()==usuario){
            solicitor=promotor;
        proyecto=new Proyecto(nombre,descripcion,precioMax,precioMin);
        proyecto.setUsuario(usuario);
        promotor.getProyectos().add(proyecto); 
        
        
        
            }
        Subasta subasta=new Subasta (solicitor, proyecto.getPrecioMax(), proyecto);
        this.subastas.add(subasta);
        PrintStream salida = new PrintStream("Solicitudes.txt");
        salida.println(usuario+" "+nombre+" "+subasta.getFecha_creación().getDay()+"/"+subasta.getFecha_creación().getMonth()+"/"+subasta.getFecha_creación().getYear());
        break;
        }
    }
    public void tomarSubasta (String usuario,Date fecha){
        int s=0;
        for(int i=0;i<this.aportantes.size();i++){
            if(aportantes.get(i).getUsuario()==usuario){
            s=i;
        }           
    } 
        for(Subasta subasta: this.subastas){
            if(subasta.getFecha_creación()==fecha){

            subasta.getProyecto().setPrecioOfertado(subasta.getPrecio_actual());
            subasta.getProyecto().setAportanteGanador(aportantes.get(s));
            aportantes.get(s).getProyectos().add(subasta.getProyecto());

            this.subastas.remove(subasta);
            break;
            }
        }
}
}
