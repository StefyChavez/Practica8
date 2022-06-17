/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Candidato;
import servicio.CandidatoServicio;

/**
 *
 * @author admin
 */
public class CandidatoControl {
    
    private final CandidatoServicio candidatoServicio = new CandidatoServicio();
    
    public Candidato crear(String [] args){
        var candidato = new Candidato(Integer.valueOf(args[0]),args[1],args[2],args[3],args[4]);
        this.candidatoServicio.crear(candidato);
        return candidato;
    }
    
    public List<Candidato> listar(){
        return this.candidatoServicio.listar();
    }
    
}
