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
public class Persona {
    //atributos
    private String nombre;
    private String apellidos;
    //constructor con atributos
    public Persona(String nombre, String apellidos) {
        //super();Aqui hay una llamada implícito al constructor de la clase padre
        //Por eso podemos acceder al objeto
        this.nombre = nombre;
        this.apellidos = apellidos;
        System.out.println("Accedemos a persona usando this: "+this);
        new Imprimir().imprimir(this);
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
}
