/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ej10g6;

import entidad.Arreglo;

/**

 */
public class Ej10g6 {

    public static void main(String[] args) {
       Arreglo a1 = new Arreglo();
       a1.llenarArreglo1();
       a1.ordenarArreglo();
       a1.llenarArreglo2();
       a1.mostrarArreglo();
    }
    
}
