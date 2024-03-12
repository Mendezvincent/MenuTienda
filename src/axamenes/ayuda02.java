package axamenes;

import java.util.Scanner;

/**
 *
 * @author LAB02-PC02
 */
public class ayuda02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cuantos numeros desea poner");
        int n =  input.nextInt();
        int numeros [] = new int[n];
        for(int b = 0 ;  b  < numeros.length; b++){
            System.out.println("ingrese los numeros");
            numeros[b] = input.nextInt();
        }
        System.out.println("numeros orden");
        for(int a : numeros){
            System.out.print(" ["+ a +"] ");
        }
        for (int i = 0; i < numeros.length/2; i++) {
                    int j = numeros.length-i-1;
                    int a = numeros[i];
                    int b = numeros[j];
                    numeros[i] = b;
                    numeros[j] = a;
        }
        System.out.println("\nnumeros invertidos");
        for(int x :  numeros){
            
            System.out.print(" ["+ x +"] ");
        }
        
    }
}
