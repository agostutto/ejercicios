/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3g6;

import Entidades.Operacion;
import servicio.OperacionServicio;

/**
 *
 * @author agos.tutto
 */
public class Ej3g6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      OperacionServicio os1 = new OperacionServicio();
      Operacion o1 = os1.crearOperacion(); // en la linea 16 de la clase operacion servicio
      System.out.println(o1);
        System.out.println("la suma de los dos numeros es: " + o1.sumar());
        System.out.println("la resta es: " + o1.restar()); 
        System.out.println("la multiplicacion es: " + o1.multiplicar()); 
        System.out.println("la division es: " + o1.dividir()); 
      
              
    }
    
}
