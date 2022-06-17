/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Eleccion;
import modelo.Candidato;
import modelo.Dignidad;
import servicio.EleccionServicio;
import servicio.CandidatoServicio;
import servicio.DignidadServicio;

/**
 *
 * @author admin
 */
public class EleccionControl {
    
    private final EleccionServicio eleccionServicio = new EleccionServicio();
    private final CandidatoServicio candidatoServicio = new CandidatoServicio();
    private final DignidadServicio dignidadServicio = new DignidadServicio();
    
    public Eleccion crear(String [] args){
        Candidato candidato = this.candidatoServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Dignidad dignidad = this.dignidadServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Eleccion eleccion = new Eleccion(Integer.valueOf(args[0]),Integer.valueOf(args[1]),Integer.parseInt(args[2]),args[3],candidato,dignidad);
        this.eleccionServicio.crear(eleccion);
        return eleccion;
    }
    
    public Eleccion buscarEleccion(String arg){
        return this.eleccionServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Eleccion eliminar(String arg)
    {
        return this.eleccionServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Eleccion modificar(String [] args){
        Candidato candidato = this.candidatoServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Dignidad dignidad = this.dignidadServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Eleccion eleccionNuevo = new Eleccion(Integer.valueOf(args[0]),Integer.valueOf(args[1]),Integer.parseInt(args[2]),args[3],candidato,dignidad);
        this.eleccionServicio.modificar(Integer.valueOf(args[0]), eleccionNuevo);
        return eleccionNuevo;
    }
    
    public List<Eleccion> listar(){
        return this.eleccionServicio.listar();
    }
    
}
