/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package entidad;

import java.util.Arrays;

public class Arreglo {

    private final double[] arreglo1 = new double[50];
    private final double[] arreglo2 = new double[20];

    public Arreglo() {
    }

    public void llenarArreglo1() {
        for (int i = 0; i < 50; i++) {
            arreglo1[i] = (double) Math.random() * 10;
        }
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + arreglo1[i] + "]");
        }
        System.out.println(" ");
    }
    public void ordenarArreglo(){
        Arrays.sort(arreglo1);
    }
    public void llenarArreglo2(){
    for (int i = 0; i < 10; i++) {
      arreglo2[i] = arreglo1[i];
    } //System.arraycopy(arreglo1, 0, arreglo2, 0, 10);
    Arrays.fill(arreglo2, 10, 20, 0.5);
}
    public void mostrarArreglo(){
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + arreglo1[i] + "]");
        }
    System.out.println(" ");
         for (int i = 0; i < 20; i++) {
            System.out.print("[" + arreglo2[i] + "]");
        }
    System.out.println(" ");
    }
}
