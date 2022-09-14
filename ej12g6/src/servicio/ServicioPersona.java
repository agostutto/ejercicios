/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author agos.tutto
 */
public class ServicioPersona {
    
    public Persona crearPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nom = sc.nextLine();
        System.out.println("Ingrese el año de nacimiento");
        int anio = sc.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento");
        int mes = sc.nextInt();
        
        System.out.println("Ingrese el dia de nacimiento");
        int dia = sc.nextInt();
        
        Date d1 = new Date(anio,mes,dia);
        Persona p1 = new Persona(nom,d1);
        
        return p1;
    }
    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.*/
   
}
