/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Dignidad;

/**
 *
 * @author admin
 */
public interface IDignidadServicio {
    
    public Dignidad crear(Dignidad dignidad);
    public Dignidad buscarPorCodigo(int codigoDignidad);
    public List<Dignidad> listar();   
    
}
