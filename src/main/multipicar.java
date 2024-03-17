/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author TIC
 */
public class multipicar {
    private int tabla,M,r;
    
    public void tabla(){
        Scanner input = new Scanner(System.in);
        System.out.print("ingrese el numeros de la tabla: ");
        tabla = input.nextInt();
        System.out.print("\ningresa hasta que numeros se va a multiplicar:" );
        M =  input.nextInt();
        System.out.println("tabla del " + tabla);
        for(int a  = 0;  a  < M ; a++){
            r = tabla * a;
            System.out.println(tabla+ " x " + a + " : " + r);
        }
        
    }
}
