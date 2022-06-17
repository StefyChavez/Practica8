/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Candidato;

/**
 *
 * @author admin
 */
public class CandidatoServicio implements ICandidatoServicio{

    private static List<Candidato> candidatoList = new ArrayList<>();

    @Override
    public Candidato crear(Candidato candidato) {
        this.candidatoList.add(candidato);
        return candidato;
    }
    
    public List<Candidato> listar(){
        return this.candidatoList;
    }

    @Override
    public Candidato buscarPorCodigo(int codigoCandidato) {
            Candidato candidato=null;
        for(var c:this.candidatoList){
            if(codigoCandidato==c.getCodigo()){
                candidato=c;
                break;
            }
        }
        return candidato;
    }

}
