/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usothis;

/**
 *
 * @author Santiago
 */
public class UsoThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Santiago", "Otero");
        System.out.println("Persona = "+p1.getNombre());
        System.out.println("Nombre de la persona: "+p1.getNombre());
        System.out.println("Apellido de la persona: "+p1.getApellidos());
         
    }
    
}
