/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 
 */
public class Deportista extends Persona {
//variable para encapsular
 private int edad;
   
    
    public  Deportista(int edad){
        this.edad=edad;
        Establecerespecialidad("Delantero");
    }
    //encapsulamiento
    
    public void imprimiredad(){
        System.out.println("La edad del futbolista es: "+edad);
    }
    ///////abstraccion
    @Override
   public String getnombre() {
        return "Cristiano Ronaldo";
    }

    @Override
    public String getexperiencia() {
        return "10 años de experiencia";
    }

    @Override
    public String direccion() {
        return "Portugal";
    }

    @Override
    public String informacionpersona() {
        return "Esta Persona es un Futbolista";
    }
    
}
