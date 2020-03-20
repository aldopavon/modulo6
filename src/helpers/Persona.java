/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 
 */
//agregamos abstract para convertir la clase en abstracta
public abstract class Persona {
    
    //atributos 
    private String especialidad;
    public Persona(){
        
    }
     //Establecer y obtener
    public void Establecerespecialidad(String esp){
        this.especialidad=esp;
    }
    public String ObtenerEspecialidad(){
        return this.especialidad;
    }
    
    public void imprimirEspecialidad(){
     System.out.println("Especialidad: "+especialidad);
     
     
    }
     //creamos los metodos abstractos
    abstract String getnombre();
    abstract String getexperiencia();
    abstract String direccion();
    
     //declaramos el metodo abstracto el cual estara en las subclases pero con diferente comportamiento
    abstract String informacionpersona();
    
}
