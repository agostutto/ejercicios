/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package entidad;

/**
 *
 * @author agos.tutto
 */
public class Matematica {
    private double n1;
    private double n2;
    public Matematica() {
    }
    public Matematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public double devolverMayor(){
        return Math.max(n1, n2);
    }
    public void calcularPotencia(){
        long n1,n2;
        n1=Math.round(this.n1);
        n2=Math.round(this.n2);
        System.out.println("la potencia entre los dos numeros es: " + Math.pow(Math.max(n1, n2), Math.min(n1,n2)));
    }
    public void calculaRaiz (){
        System.out.println("la raiz cuadrada del menor de los dos valores es: " + Math.sqrt(Math.abs(Math.min(n1, n2))));
    }
}
