/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ej9g6;

import entidad.Matematica;

/**
 *
 * @author agos.tutto
 */
public class Ej9g6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica m1 = new Matematica();
        m1.setN1((double) Math.random()*10);
        m1.setN2((double) Math.random()*10);
        System.out.println("el primer numero es: " + m1.getN1() + "\n y el segundo numero es: " + m1.getN2());
        System.out.println("el numero mayor es: " + m1.devolverMayor());
        m1.calcularPotencia();
        m1.calculaRaiz();
    }
    
}
