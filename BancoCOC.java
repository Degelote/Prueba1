/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancococ;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class BancoCOC {

    public static void main(String[] args) {
        
        int menu;
        Ventanilla v1 = new Ventanilla();
        Ventanilla v2 = new Ventanilla();
        Ventanilla v3 = new Ventanilla();
        System.out.println("Bienvenido al Banco Nacional.");
        do {
            
            System.out.println("Qué quieres hacer? 1. Ingresar dinero 2. Extraer dinero 3. Irse");
            Scanner reader = new Scanner(System.in);
            menu = reader.nextInt();
            if (menu == 1) {
                v1.ingresarDinero();
            } else if (menu == 2) {
                if (v1.saldoVentanilla > -5000) {
                    v1.extraerDinero();
                    System.out.println("Estas sacando dinero de la ventanilla 1");
                } else if (v2.saldoVentanilla < -5000) {
                    v2.extraerDinero();
                }
            } else if (menu == 3){
                break;
            }
        } while (menu != 3);

    }

}
