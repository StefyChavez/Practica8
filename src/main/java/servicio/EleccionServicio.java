/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Eleccion;
import modelo.Candidato;

/**
 *
 * @author admin
 */
public class EleccionServicio implements IEleccionServicio{
    
    private static List<Eleccion> eleccionList = new ArrayList<>();

    @Override
    public Eleccion crear(Eleccion eleccion) {
        this.eleccionList.add(eleccion);
        return eleccion;
    }

    @Override
    public Eleccion modificar(int codigoEleccion, Eleccion eleccionNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoEleccion));
        this.listar().get(posicion).setCodigo(eleccionNuevo.getCodigo());
        this.listar().get(posicion).setVotos(eleccionNuevo.getVotos());
        this.listar().get(posicion).setNumeroVotante(eleccionNuevo.getNumeroVotante());
        this.listar().get(posicion).setDescripcion(eleccionNuevo.getDescripcion());
        this.listar().get(posicion).setCandidato(eleccionNuevo.getCandidato());
        return eleccionNuevo;
    }

    @Override
    public Eleccion eliminar(int codigoEleccion) {
        Eleccion eleccion=this.buscarPorCodigo(codigoEleccion);
        var posicion=this.buscarPosicion(eleccion);
        this.listar().remove(posicion);
        return eleccion;
    }

    @Override
    public Eleccion buscarPorCodigo(int codigoEleccion) {
        Eleccion eleccion=null;
        for(var b:this.eleccionList){
            if(codigoEleccion==b.getCodigo()){
                eleccion=b;
                break;
            }
        }
        return eleccion;
    }

    @Override
    public List<Eleccion> listar() {
        return this.eleccionList;
    }

    @Override
    public int buscarPosicion(Eleccion eleccion) {
        int posicion=-1;
        for(var b:this.eleccionList){
            posicion++;
            if(b.getCodigo()==eleccion.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}
