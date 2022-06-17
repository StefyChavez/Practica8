/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author admin
 */
public class Eleccion {
    
    private int codigo;
    private int votos;
    private int numeroVotante;
    private String descripcion;
    private Candidato candidato;
    private Dignidad dignidad;

    public Eleccion(int codigo, int votos, int numeroVotante, String descripcion, Candidato candidato, Dignidad dignidad) {
        this.codigo = codigo;
        this.votos = votos;
        this.numeroVotante = numeroVotante;
        this.descripcion = descripcion;
        this.candidato = candidato;
        this.dignidad = dignidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getNumeroVotante() {
        return numeroVotante;
    }

    public void setNumeroVotante(int numeroVotante) {
        this.numeroVotante = numeroVotante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Dignidad getDignidad() {
        return dignidad;
    }

    public void setDignidad(Dignidad dignidad) {
        this.dignidad = dignidad;
    }

    @Override
    public String toString() {
        return "Eleccion{" + "codigo=" + codigo + ", votos=" + votos + ", numeroVotante=" + numeroVotante + ", descripcion=" + descripcion + ", candidato=" + candidato + ", dignidad=" + dignidad + '}';
    }

    
           
}
