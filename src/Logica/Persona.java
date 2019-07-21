/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Persona {
    private String usuario;
    private String contraseña;
    private ArrayList<Proyecto> proyectos;

    public Persona(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.proyectos = new ArrayList<>();
    }

        public String getUsuario() {
        return usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }    
}
