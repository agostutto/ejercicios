/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;
import servicios.BarajaService;

/**
 *
 * @author agos.tutto
 */
public class Menu {
  Scanner leer = new Scanner (System.in);
    public void crearMenu(){
    BarajaService bs = new BarajaService(); 
    Baraja b1 = bs.crearBaraja();
        boolean si = true;
        
        while(si){
            System.out.println("-------------------");
        System.out.println("INGRESE LA OPCION DESEADA:\n1 -Mostrar siguiente carta\n2 - Mezclar\n3 - Pedir Cartas\n4 - Ver cartas ya repartidas\n5 - Ver cantidad de cartas que quedan en el mazo\n6 - Salir ");    
        String op = leer.next();
            System.out.println("------------------");
        switch (op) {
            case "1":
                bs.siguienteCarta(b1.getNaipes());
                break;
                case "2":
                    bs.barajar(b1.getNaipes());
                break;
                case "3":
                    bs.darCartas(b1.getNaipes());
                break;
                case "4":
                    bs.cartasMonton(b1.getNaipes());
                break;
                case "5":
                    bs.mostrarBaraja(b1.getNaipes());
                
                break;
                case "6":
                    System.out.println("Juego terminado");
                    si = false;
                break;
            default:
                System.out.println("Ingreso una opcion incorrecta, intente nuevamente");
                
        }
        }
    }
}  

