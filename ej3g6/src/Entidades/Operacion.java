/*

 */
package Entidades;

public class Operacion {
    private double n1;
    private double n2;

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operacion() {
    }

    public double getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public double sumar(){
        return n1+n2;
    }
    public double restar(){
        return n1-n2;
    }
    public double multiplicar(){
        if (n1!=0 && n2!=0){
            return n1*n2;
        } else {
            System.out.println("no puede multiplicarse por 0");
            return 0;
        }
    }
    public double dividir(){
        if (n1!=0 && n2!=0){
            return n1/n2;
        } else {
            System.out.println("no puede dividirse por 0");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
}
