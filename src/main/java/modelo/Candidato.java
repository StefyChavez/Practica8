/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author admin
 */
public class Candidato {
    
    private int codigo;
    private String nombre;
    private String apeliido;
    private String genero;
    private String tituloUniversitario;

    public Candidato(int codigo, String nombre, String apeliido, String genero, String tituloUniversitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.genero = genero;
        this.tituloUniversitario = tituloUniversitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }

    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }

    @Override
    public String toString() {
        return "Candidato{" + "codigo=" + codigo + ", nombre=" + nombre + ", apeliido=" + apeliido + ", genero=" + genero + ", tituloUniversitario=" + tituloUniversitario + '}';
    }

    
}
