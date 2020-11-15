/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Operaciones {

    public void Suma() {
        Scanner tecla = new Scanner(System.in);
        int num1, num2, resp;
        System.out.println("Ingresar numero 1 : ");
        num1 = tecla.nextInt();
        System.out.println("Ingrse numero 2 : ");
        num2 = tecla.nextInt();
        resp = num1 + num2;
        System.out.println("Resulatdo : " + resp);
    }
    
    public void Resta() {
        int num1, num2, res;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = Integer.valueOf(tecla.nextLine());
        System.out.println("Ingrese el segundo número: ");
        num2 = Integer.valueOf(tecla.nextLine());
        res = num1 - num2;
        System.out.print("Respuesta: " + res);
    }

}
