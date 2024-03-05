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
public class taskDos {
    static String menuUno [] = {"chupe de mariscos", " arroz con pato", "refresco de maracuya" };
    static double precioUno = 20.00; 
    static String menuDos [] = {"sopa de pollo", "pechuga a la plamcha", "refresco de  aguaje"};
    static double precioDos =  25.00;
    static String menuTres[] = {"aguadito","lomo saltado","refresco de chicha"}; 
    static double precioTres = 35.00;
    static int Ncomensal = 0 , total = 0 , Nelegir = 0 ;
    static String platosE [] = new String[Ncomensal];
    static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
        
    }
    
    static void  menuUno(){
        System.out.println("menu  #1");
        for(int m = 0  ;  m  < menuUno.length; m++){
            System.out.println((m+1) + menuUno[m]);
            System.out.print(" precio: " + precioUno);
        }
        System.out.println("desea el menu #1 (1)");
        
    }
    
    static void menuDos(){
        System.out.println("menu  #2");
        for(int m = 0  ;  m  < menuUno.length; m++){
            System.out.println((m+1) + menuDos[m]);
            System.out.print(" precio: " + precioDos);
        }
        System.out.println("desea el menu #2 (2)");
    }
    
    static void menuTres(){
        System.out.println("menu  #3");
        for(int m = 0  ;  m  < menuTres.length; m++){
            System.out.println((m+1) + menuTres[m]);
            System.out.print(" precio: " + precioTres);
            System.out.println("desea el menu #3 (3)");
        }
    }
    
}
