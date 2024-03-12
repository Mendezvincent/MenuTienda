package axamenes;

import java.util.Scanner;

/**
 *
 * @author LAB02-PC02
 */
public class ayuda03 {
    public static void main(String[] args) {
        int Inumeros []  = new int[5];
        int suma = 0 , mayor = 0 , menor = Integer.MAX_VALUE,par = 0,inpar = 0;
        Scanner input = new Scanner(System.in);
        for(int a= 0; a < Inumeros.length; a++){
            System.out.print("ingresa un numero: ");
            Inumeros[a] = input.nextInt();
        }
        for(int c = 0; c < Inumeros.length; c++){
            suma += Inumeros[c];
        }
        int promedio =  suma / Inumeros.length;
        System.out.println("el promedio es -> " + promedio);
        for(int w = 0 ; w < Inumeros.length; w++){
            if(Inumeros[w] > mayor){
                mayor =  Inumeros[w];
            }else if(Inumeros[w] < menor){
                menor =  Inumeros[w];
            }
        }
        System.out.println("el numero mas grande es -> " + mayor);
        System.out.println("el numero mas pequeño es -> " + menor);
        for(int q = 0; q < Inumeros.length; q++){
             if((Inumeros[q] % 2) == 0){
                 par++;
             }else{
                 inpar++;
             }
        }
        System.out.println("cantidad de numeros pares -> " + par);
        System.out.println("cantidad de numeros inpares -> " + inpar);
        
    }
}
