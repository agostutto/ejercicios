/*
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
 */
package servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author agos.tutto
 */
public class OperacionServicio {
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int n1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int n2 = leer.nextInt();
        
        Operacion o1 = new Operacion(n1,n2);
        return o1;
    }


}
