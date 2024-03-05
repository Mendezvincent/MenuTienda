/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author LAB02-PC22
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    /* ingrsa  */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int numeros [] =  new int[3];
        int mayor = 0,menor = Integer.MAX_VALUE;
        for(int n = 0;  n  <  numeros.length ;n++){
             System.out.println("ingresa un numero: ");
             numeros[n] = input.nextInt();
        }
        
        
        for(int a = 0 ; a < numeros.length ;a++){
             if(numeros[a] > mayor){
                 mayor = numeros[a];
             }if(numeros[a] < menor ){
                 menor = numeros[a];
             }
        }
        System.out.println("mayor: "  + mayor);
        System.out.println("menor: " + menor);
    }
    
}
