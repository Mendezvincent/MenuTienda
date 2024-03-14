/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LAB02-PC22
 */
public class taskDos {
    static String menuDos [] = {"Entrante: Guacamole con totopos" ,"Plato principal: Tacos al pastor","Postre: Flan de caramelo"};
    static double precioD = 62.00;
    static String menuUNo [] = {"Entrante: Bruschetta con tomate y albahaca" , "Plato principal: Pasta a la carbonara", "Postre: Tiramisú"};
    static double precioU = 34.00;
    static String menuTres [] = {"Entrante: Rol los de primavera" ,"Plato principal: Pollo agridulce con arroz frito","Postre: Helado de té verde"};
    static double precioT = 62.00, total = 0;
    
    static  String menuElegido ="";
    static int Ncomensal = 0, opcion = 0, elecion;
    static ArrayList<String> menu =  new ArrayList<>();
    static ArrayList<String> nameB =  new ArrayList<>();
    static String name;
    static Scanner input =  new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("numeros de comensales: ");
        Ncomensal = input.nextInt();String p[] = new String[Ncomensal];
        System.out.println("numeros de comensales: " + Ncomensal);
        
        for(int a = 0  ; a < Ncomensal; a++){
            opcion= 0;
            taskDos.setNom();
            while(opcion != 12){
                taskDos.mostra();
                System.out.println("desea algo mas?");
                System.out.println("si(9) o no(12)");
                opcion =  input.nextInt();
            }
            
        }
         taskDos.getPedido();
    }
    static void setPedio(double precio, String name, String menuE){
        int a = 0;
        nameB.add(a,name);
        menu.add(a,menuE);
        total +=precio;
        a++;
        
    }
    static void getPedido(){
        int i = 0;
            System.out.println("************************");
            System.out.println("**  BOLETA DE VENTA   **");
            System.out.println("************************");
            System.out.println("NOMBRE Y APELLIDO: ");
            System.out.println(nameB.get(i));
            System.out.println("PRODUCTOS: ");
            System.out.println(menu.get(i));
            System.out.println("TOTAL: " + total);
            System.out.println("***************************");
            System.out.println("** GRACIAS POR SU COMPRA **");
            System.out.println("***************************");
        i++; 
    }
    static void setNom(){
        System.out.println("cual es tu nombre?");
        name =  input.next();
    }
    static void getNom(){
        System.out.println("hola " + name);
    }
    static void mostra(){
                getNom();
                System.out.println("(1) Menú #1");
                System.out.println("(2) Menú #2");
                System.out.println("(3) Menú #3 ");
                System.out.println("que menu desea?");
                elecion = input.nextInt();
                    if(elecion > 0 && elecion < 4 ){
                        switch (elecion) {
                            case 1 -> {
                                menuOne();
                            }
                            case 2 ->{ 
                                menuDos();
                            }
                            case 3 -> {
                                menuTres();
                            }
                            default ->{
                                System.out.println("opcion no validad");
                            }
                            
                        }
                        
                    }
    }
    static void menuOne(){
        System.out.println("Menú 1: Cocina italiana");
        for(String menuU : menuUNo){
            System.out.println(menuU);
        }
        System.out.println("desea el menu");
        System.out.println("si(10) o no(9)");
        opcion = input.nextInt();
        if(opcion == 10){
                System.out.println("precio: " + precioU);
                menuElegido = "Menú 1: Cocina italiana";
                setPedio(precioU, name, menuElegido);
        }
    }
    static void menuDos(){
        System.out.println("Menú 2: Cocina mexicana");
        for(String menuD : menuDos){
                System.out.println(menuD); 
            }
        System.out.println("desea el menu");
        System.out.println("si(10) o no(9)");
        opcion = input.nextInt();
        if(opcion == 10){
            System.out.println("precio: " + precioD);
            menuElegido = "Menú 2: Cocina mexicana";
            setPedio(precioD, name, menuElegido);
        }
        
    }
    static void menuTres(){
        System.out.println("Menú 3: Cocina asiática");
        for(String menuD : menuTres){
            System.out.println(menuD); 
        }
        System.out.println("desea el menu");
        System.out.println("si(10) o no(9)");
        opcion = input.nextInt();
        if(opcion == 10){
            System.out.println("precio: " + precioT);
            menuElegido = "Menú 3: Cocina asiática";
            setPedio(precioT, name, menuElegido);
        }
    }
}
