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
public class Ventanilla {
static int saldoBanco = 10000;
int saldoIngresado;
int saldoVentanilla;
int saldoExtraido;



    public Ventanilla(){
        saldoVentanilla = 0;        
    }
    
    public void ingresarDinero(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres ingresar: ");
        saldoIngresado = reader.nextInt();
        saldoBanco = saldoBanco + saldoIngresado;
        saldoVentanilla = saldoVentanilla + saldoIngresado;
        System.out.println("Has ingresado "+saldoIngresado+" , el balance de la ventanilla es "+ saldoVentanilla);
    }
    
    public void extraerDinero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres extraer: ");
        saldoExtraido = sc.nextInt();
        saldoVentanilla = saldoVentanilla - saldoExtraido;
        if (saldoVentanilla > (-5000)) {
            System.out.println("Has extraido "+ saldoExtraido+" ,El balance de la ventanilla es "+ saldoVentanilla);
        } else{
            System.out.println("No se puede hacer la operacion. No puedo quedarme con menos de -5000€");
            saldoVentanilla = saldoVentanilla + saldoExtraido;
        }
    }
    
    
    
    
}
