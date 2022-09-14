/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author agos.tutto
 */
public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldoActual;
    private double interes;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    /* d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
    public double ingresar(double saldo) {
        System.out.println("ingrese una cantidad de dinero a ingresar");
        Scanner leer = new Scanner(System.in);
        double cantDinero = leer.nextDouble();
        return this.saldoActual=cantDinero + saldo;
    }

    public double retiro(double saldo) {
        System.out.println("ingrese una cantidad de dinero a retirar");
        Scanner leer = new Scanner(System.in);
        setSaldoActual(saldo);
        double cantDineroR = leer.nextDouble();
        if (cantDineroR >= this.saldoActual) {
            return this.saldoActual = 0;
        } else {
            return this.saldoActual= saldo - cantDineroR;
        }
    }

    public double extraccionRapida(double saldo) {
        System.out.println("ingrese una cantidad de dinero a retirar rapidamente");
        Scanner leer = new Scanner(System.in);
        setSaldoActual(saldo);
        System.out.println("lo maximo que podes retirar es:" + (getSaldoActual() * 0.20));
        double cantDineroQ = leer.nextDouble();
        if (cantDineroQ < getSaldoActual() * 0.20) {
            return this.saldoActual=cantDineroQ - saldo;
        } else {
            System.out.println("solo puede retirar el 20%");
            return 0;
        }
    }

    public double consultarSaldo() {
        return getSaldoActual();
    }

    public void consultarDatos() {
        System.out.println("Cuenta{" + "numeroCuenta=" + this.numeroCuenta + ", dni=" + this.dni + ", saldoActual=" + this.saldoActual + '}');
    }
}
