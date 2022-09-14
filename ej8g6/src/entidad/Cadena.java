/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author agos.tutto
 */
public class Cadena {
   private String frase;
   private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
   /*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    
    public void mostrarVocales(){
        int contador=0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i,i+1).equalsIgnoreCase("a") || frase.substring(i,i+1).equalsIgnoreCase("e") || frase.substring(i,i+1).equalsIgnoreCase("i") || frase.substring(i,i+1).equalsIgnoreCase("o") || frase.substring(i,i+1).equalsIgnoreCase("u")){
            contador++;
        }
        }
            System.out.println("la cantidad de vocales es: " + contador); 
    }
    public void invertirFrase(){
        for (int i = longitud-1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }
    }
    public void vecesRepetido(String letra){
        int contador=0;
        for (int i = 0; i < longitud; i++) {
         if(frase.substring(i,i+1).equalsIgnoreCase(letra)) {
          contador++;   
         }  
        }
            System.out.println("La letra " + letra + " se repite " + contador + " veces");
    }
    public void compararLongitud(String frase2){
        if (this.longitud==frase2.length()){
            System.out.println("las longitudes son las mismas");
        } else if (this.longitud>frase2.length()) {
            System.out.println("la primer frase es mas larga que la segunda");
        } else {
            System.out.println("la segunda frase es mas larga que la primera");
        }
    }
    public void unirFrases(String frase2){
        // System.out.println(frase + " " + frase2);
        System.out.println(frase.concat(" " + frase2));
    }
    public void reemplazar(String letra){
        setFrase(frase.replaceAll("a",letra));
    }
    public void contiene(String letra){
       if (frase.contains(letra)) {
           System.out.println("se econtro la letra en la frase");
       } else { 
           System.out.println("no se encontro la letra dentro de la frase");
       }
       
    }
}
