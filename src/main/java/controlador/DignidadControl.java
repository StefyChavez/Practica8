/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Dignidad;
import servicio.DignidadServicio;

/**
 *
 * @author admin
 */
public class DignidadControl {
    
    private final DignidadServicio dignidadServicio = new DignidadServicio();
    
    public Dignidad crear(String [] args){
        var dignidad = new Dignidad(Integer.parseInt(args[0]),args[1],Integer.parseInt(args[2]),args[3],args[4]);
        this.dignidadServicio.crear(dignidad);
        return dignidad;
    }
    
    public List<Dignidad> listar(){
        return this.dignidadServicio.listar();
    }
    
    
}
