/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;

/**
 *
 * @author agos.tutto
 */
public class Persona{
    private String nombre;
    private Date fNacim;

    public Persona() {
    }

    public Persona(String nombre, Date fNacim) {
        this.nombre = nombre;
        this.fNacim = fNacim;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacim() {
        return fNacim;
    }

    public void setfNacim(Date fNacim) {
        this.fNacim = fNacim;
    }

    public int calcularEdad(){
        Date d2 = new Date();
        System.out.println("La edad de "+nombre+" Es : "+ (d2.getYear()-fNacim.getYear()));
        return d2.getYear()-fNacim.getYear();
    }
    
    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.*/
    
    public boolean menorQue(int edad){
        
        return calcularEdad()>edad;
    }
    
    public void mostrarDato(){
        System.out.println(getNombre()+"Nacio el "+fNacim.getDate()+" "+fNacim.getMonth()+" "+fNacim.getYear());
    }
    
 
    
}
