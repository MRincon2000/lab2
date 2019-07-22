/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

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
    
    public void registrarPromotor(String usuario,String contraseña){
        boolean yaExiste=false;
        for(Promotor promotor:this.promotores){
            if(promotor.getUsuario()==usuario){
                yaExiste=true;
            }
        }
        if(yaExiste!=true){
            this.promotores.add(new Promotor(usuario,contraseña));
        }
    }
    public void registrarAportante(String usuario,String contraseña){
        boolean yaExiste=false;
        for(Aportante aportante: this.aportantes){
            if(aportante.getUsuario()==usuario){
                yaExiste=true;
            }
        }
        if(yaExiste!=true){
            this.aportantes.add(new Aportante(usuario,contraseña));
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
    
    public void solicitarPrestamo(String usuario,String nombre,String descripcion, double precioMax, double precioMin){
        Promotor solicitor=null;
        Proyecto proyecto=null;
        for(Promotor promotor:this.promotores){
        if(promotor.getUsuario()==usuario){
            solicitor=promotor;
        proyecto=new Proyecto(nombre,descripcion,precioMax,precioMin);
        promotor.getProyectos().add(proyecto);        
            }
        this.subastas.add(new Subasta (solicitor, proyecto.getPrecioMax(), proyecto));
        break;
        }
    }
    public void tomarSubasta (String usuario, String contraseña,Date fecha){
        Aportante comprador=null;
        for(Aportante aportante: this.aportantes){
            if(aportante.getUsuario()==usuario){
            comprador=aportante;
            break;
        }           
    } 
        for(Subasta subasta: this.subastas){
            if(subasta.getFecha_creación()==fecha){
            comprador.getProyectos().add(subasta.getProyecto());
            subasta.getProyecto().setPrecioOfertado(subasta.getPrecio_actual());
            subasta.getProyecto().setAportanteGanador(comprador);
            this.subastas.remove(subasta);
            break;
            }
        }
}
}
