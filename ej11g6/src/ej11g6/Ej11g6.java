/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ej11g6;

import java.util.Date;

/**
 *
 * @author agos.tutto
 */
public class Ej11g6 {

    public static void main(String[] args) {
       Date fecha = new Date(120,03,26); // 120 porque el date suma 1900 anios
       Date fechaActual = new Date();
        System.out.println(fecha + " " + fechaActual);
        System.out.println("la diferencia de anios es de: " + (fechaActual.getYear()-fecha.getYear()));
    }
}
