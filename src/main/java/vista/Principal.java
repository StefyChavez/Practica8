/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

/**
 *
 * @author admin
 */
public class Principal {

    public static void main(String[] args) {
        
        var v1 = new CreateEleccion();
        var v2 = new CreateCandidato();
        var v3 = new CreateDignidad();
        var v4 = new DeleteEleccion();
        
        v1.setVisible(true);
        v2.setVisible(true);
        v3.setVisible(true);
        v4.setVisible(true);
    }
}
