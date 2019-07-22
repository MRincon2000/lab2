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
public class Subasta {
private Promotor promotor;
private double precio_actual;
private Date fecha_creación;
private Proyecto proyecto;

    public Subasta(Promotor promotor, double precio_actual, Proyecto proyecto) {
        this.promotor = promotor;
        this.precio_actual = precio_actual;
        this.fecha_creación = new Date();
        this.proyecto = proyecto;
    }

    public Promotor getPromotor() {
        return promotor;
    }
    public double getPrecio_actual() {
        Date fecha=new Date();
    if(this.precio_actual>((proyecto.getPrecioMin()/100)*(proyecto.getPrecioMax()))){
        long dif_Fechas=(fecha.getTime()-this.fecha_creación.getTime())/(1000*60*60);
        this.setPrecio_actual((precio_actual)-(precio_actual*(dif_Fechas)*0.05));
    }
    return precio_actual;
    }
    
    public Date getFecha_creación() {
        return fecha_creación;
    }
    public Proyecto getProyecto() {
        return proyecto;
    }
    public void setPrecio_actual(double precio_actual) {
        this.precio_actual = precio_actual;
    }
}
