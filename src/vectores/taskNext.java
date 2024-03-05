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
public class taskNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int N = input.nextInt();
        int contadorSuperior = 0,  contadorInferior = 0;
        int[] alturas = new int[N];
        int sumaAlturas = 0;
        if (N <= 0) {
            System.out.println("El número de personas debe ser un entero positivo.");
        }
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese la altura de la persona " + (i + 1) + ": ");
            alturas[i] = input.nextInt();
            sumaAlturas += alturas[i];
        }

        double alturaMedia = (double) sumaAlturas / N;

        for (int i = 0; i < N; i++) {
            if (alturas[i] > alturaMedia) {
                contadorSuperior++;
            } else if (alturas[i] < alturaMedia) {
                contadorInferior++;
            }
        }

        System.out.println("Altura media: " + alturaMedia);
        System.out.println("Personas con altura superior a la media: " + contadorSuperior);
        System.out.println("Personas con altura inferior a la media: " + contadorInferior);
    }
}
