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
    static double Eprecio;
    static String nombreC, menuElegido;
    static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
        int Ncomensal = 0, opcion = 0, elecion;
        System.out.print("numeros de comensales: ");
        Ncomensal = input.nextInt();
        System.out.println("numeros de comensales: " + Ncomensal);
        String name;
        while(opcion != 10){
            for(int M = 0 ; M < Ncomensal;M++){
                System.out.println("cual es tu nombre?");
                name = nombre(Ncomensal);
                System.out.println("hola " + name);
                System.out.println("(1) Menú #1");
                System.out.println("(2) Menú #2");
                System.out.println("(3) Menú #3 ");
                System.out.println("que menu desea?");
                elecion = input.nextInt();
                while(opcion != 12){
                    if(elecion > 0 && elecion < 4 ){
                        switch (elecion) {
                            case 1 -> menuOne();
                            case 2 -> menuDos();
                            case 3 -> menuTres();
                            default -> System.out.println("opcion no validad");
                        }
                    }
                }
                tomarPedido(Ncomensal);
                
            }
            System.out.println("desea escoger otro menu?");
            System.out.println("si (9) o no (10)");
            opcion = input.nextInt();
        }
        
    }
    static String tomarPedido(int Npedidos){
        String pedido [][][] = new String [Npedidos][Npedidos][Npedidos];
        String pe = null;
        for(int n = 0; n < pedido.length; n++){
            for(int m = 0; m < pedido.length; m++){
                for(int p = 0; p < pedido.length;p++){
                    pedido[n][m][p] = nombreC + menuElegido + String.valueOf(Eprecio);
                    pe = pedido[n][m][p];
                }
            }
        }
        
        return pe;
    }
    static String  nombre(int N){
        String nombre[] = new String [N];
        for(int n = 0 ; n <  nombre.length; n++){
            nombre[n] = input.next();
            nombreC = nombre(n);
        }
        return String.valueOf(nombre);
    }
    
    static void menuOne(){
        String menuUNo [] = {"Entrante: Bruschetta con tomate y albahaca" , "Plato principal: Pasta a la carbonara", "Postre: Tiramisú"};
        double precioU = 34.00;
        String decicion;
        System.out.println("Menú 1: Cocina italiana");
        for(String menuU : menuUNo){
            System.out.println(menuU);
        }
        System.out.println("precio: " + precioU);
        System.out.println("desea este menu");
        System.out.println("si o no");
        decicion = input.next();
        if(decicion.toLowerCase().equals("si")){
            Eprecio = precioU;
            menuElegido = "Menú 1: Cocina italiana";
            
        }
    }
    static void menuDos(){
        String menuDos [] = {"Entrante: Guacamole con totopos" ,"Plato principal: Tacos al pastor","Postre: Flan de caramelo"};
        double precioD = 62.00;
        String decicion;
        System.out.println("Menú 2: Cocina mexicana");
        for(String menuD : menuDos){
            System.out.println(menuD); 
        }
        System.out.println("precio: " + precioD);
        System.out.println("desea este menu");
        System.out.println("si o no");
        decicion = input.next();
        if(decicion.toLowerCase().equals("si")){
            Eprecio = precioD;
            menuElegido = "Menú 1: Cocina italiana";
        }
        
    }
    static void menuTres(){
        String menuTres [] = {"Entrante: Rollos de primavera" ,"Plato principal: Pollo agridulce con arroz frito","Postre: Helado de té verde"};
        double precioT = 62.00;
        String decicion;
        System.out.println("Menú 3: Cocina asiática");
        for(String menuD : menuTres){
            System.out.println(menuD); 
        }
        System.out.println("precio: " + precioT);
        System.out.println("desea este menu");
        System.out.println("si o no");
        decicion = input.next();
        if(decicion.toLowerCase().equals("si")){
            Eprecio = precioT;
            menuElegido = "Menú 3: Cocina asiática";
        }
    }
    
}
