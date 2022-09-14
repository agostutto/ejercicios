/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package servicio;

import entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author agos.tutto
 */
public class ServicioRectangulo {
    
    public Rectangulo crearRectangulo(){
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese base");
        double base=leer.nextDouble();
        System.out.println("ingrese altura");
        double altura=leer.nextDouble();
        Rectangulo r1 = new Rectangulo(base,altura);
        return r1;
    }
    
}
