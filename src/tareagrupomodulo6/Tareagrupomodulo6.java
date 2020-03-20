/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupomodulo6;

import helpers.Deportista;
import helpers.Doctor;
import helpers.Persona;

/**
 *
 
 */
public class Tareagrupomodulo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //encapsulamiento
        Doctor doctor=new Doctor(20);
       System.out.println(doctor.informacionpersona());
        System.out.println("Nombre: "+doctor.getnombre());
        System.out.println("Experiencia: "+doctor.getexperiencia());
        System.out.println("Direccion: "+doctor.direccion());
        doctor.imprimirEspecialidad();
       
        //encapsulamiento
        doctor.imprimiredad();
        /////////////////////////////////
        
        //encapsulamiento
        Deportista deportista=new Deportista(33);
        System.out.println("\n");
       System.out.println(deportista.informacionpersona());
        System.out.println("Nombre: "+deportista.getnombre());
        System.out.println("Experiencia: "+deportista.getexperiencia());
        System.out.println("Direccion: "+deportista.direccion());
        deportista.imprimirEspecialidad();
       
        //encapsulamiento
        deportista.imprimiredad();
    }
    
}
