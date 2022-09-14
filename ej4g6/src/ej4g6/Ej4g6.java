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
package ej4g6;

import entidad.Rectangulo;
import servicio.ServicioRectangulo;

/**
 *
 * @author agos.tutto
 */
public class Ej4g6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ServicioRectangulo sr1 = new ServicioRectangulo();
    Rectangulo r1 = sr1.crearRectangulo();
        System.out.println("la superficie es: " + r1.superficie());
        System.out.println("el perimetro es: " + r1.perimetro());
        System.out.println("y asi queda \n");
        r1.dibujarRectangulo();
    }
    
}
