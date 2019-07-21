/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author usuario
 */
public class Proyecto {
    private String usuario;
    private String nombre;
    private String descripcion;
    private double precioMin;
    private double precioMax;
    private double precioOfertado;
    private Aportante aportanteGanador;

    public Proyecto(String nombre, String descripcion, double precioMin, double precioMax) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioMin = precioMin;
        this.precioMax = precioMax;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioMin() {
        return precioMin;
    }
    public void setPrecioMin(double precioMin) {
        this.precioMin = precioMin;
    }
    public double getPrecioMax() {
        return precioMax;
    }
    public void setPrecioMax(double precioMax) {
        this.precioMax = precioMax;
    }
    public Aportante getAportanteGanador() {
        return aportanteGanador;
    }
    public void setAportanteGanador(Aportante aportanteGanador) {
        this.aportanteGanador = aportanteGanador;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
}
