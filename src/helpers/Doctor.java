/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 
 */
public class Doctor extends Persona  {
//variable para encapsular
 private int edad;
   
    
    public  Doctor(int edad){
        this.edad=edad;
        Establecerespecialidad("Dermatologo");
    }
    //encapsulamiento
    
    public void imprimiredad(){
        System.out.println("La edad de la persona es: "+edad);
    }
    ///////abstraccion
    @Override
   public String getnombre() {
        return "Aldo pavon";
    }

    @Override
    public String getexperiencia() {
        return "3 años de experiencia";
    }

    @Override
    public String direccion() {
        return "San Pedro Sula";
    }

    @Override
    public String informacionpersona() {
        return "Esta Persona es un Doctor";
    }

}
