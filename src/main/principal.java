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
public class principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        multipicar m = new multipicar();
        int o = 0; 
        while(o!= 10){
            m.tabla();
            System.out.println("va seguir multiplicando:");
            System.out.println("si(9)  o  no(10)");
            o =  input.nextInt();
        }
        
    }
}
