package arreglo;
import java.util.Scanner;

/**
 *
 * @author LAB02-PC02
 */
public class Arreglo {
    /*
    Mirilla va al supermercado se da cuenta que existen varias secciones en el supermercado 4,
    abarrotes ,panadería , verduras, lácteos. DENTRO de cada sección existen 6 productos, 
    dependiendo de lonque mirella escoja para comprar sacar el monto que va a comprar
    */
        static String section [] = {"abarrotes","panaderia","verdura","lacteos"};
        static String abarrotes [] = {"arroz","fideos","trome","atun","legia","pollo"};
        static double precioA [] =  {1.20,1.50,1.00,2.50,0.50,3.00};
        static String panaderia [] = {"pan redondo","pan cacho","pan molde","pan france","pan integral","pan bicocho"};
        static double precioP [] =  {0.50,1.50,1.00,2.50,0.50,3.00};
        static String verdura [] = {"cebolla","zanaoria","apio","lechuca","tomate","brocoli"};
        static double precioV [] =  {0.20,0.50,1.00,2.50,0.50,3.00};
        static String lacteos [] = {"leche","yougur","mantequilla","queso freco"," queso parmesano","queso mosarela"};
        static double precioL [] =  {1.50,2.50,3.00,2.50,0.50,3.00};
        static double total = 0; static int cantidad, cantidadElegida = 0; 
        static Scanner input = new Scanner(System.in);
        static int opcion = 0,elecionSec,Neejir = 0;
    public static void main(String[] args) {
        Arreglo test =  new Arreglo();
        while(opcion != 12){
            test.menuInicio();
            System.out.println("va a seguir comprando");
            System.out.println("si(9) no(12)");
            opcion =  input.nextInt();
        }            
        System.out.println("total a pagar: " + total + " cantida de productos" + cantidadElegida);
    }
    //funciones
    public void menuInicio(){
        System.out.println("elija la section:");
        for(String set : section){
            System.out.println("("+ Neejir +")" + set);
            if(Neejir < section.length){
                Neejir++;
            }else{
                Neejir = 0;
            }
            
        }
        System.out.println("escoger preoducto");
        elecionSec =  input.nextInt();
        switch (section[elecionSec]) {
            case "abarrotes" -> {
                getAbarrotes();
            }
            case "panaderia" -> {
                getPanaderia();
            }
            case "verdura" ->{
                getVerdura();
            }
            case "lacteos" ->{
               getLacteos();
            }
        }

    }
    
    
    public void getAbarrotes(){
                System.out.println("section " + section[elecionSec]);
                System.out.println("elegir producto");
                while(opcion != 10){
                    Neejir = 0;
                    for(String a : abarrotes){
                        System.out.println("("+ Neejir +")" + a);
                        if(Neejir < lacteos.length){
                            Neejir++;
                        }else{
                            Neejir = 0;
                        }
                    }
                    elecionSec =  input.nextInt();
                    System.out.println("producto selecionado " + abarrotes[elecionSec] + " precio " +precioA[elecionSec]);
                    System.out.println("canidad del producto");
                    cantidad = input.nextInt();
                    total += precioA[elecionSec]*cantidad;
                    cantidadElegida++;
                    System.out.println("Monto a pagar " + total);
                    System.out.println("producto escogido" + cantidadElegida);
                    System.out.println("desea compra mas producto");
                    System.out.println("si(9)  no (10)");
                    opcion = input.nextInt();
                }
    
    }
    public void getPanaderia(){
                System.out.println("section " + section[elecionSec]);
                System.out.println("elegir producto");
                while(opcion != 10){
                    Neejir = 0;
                    for(String a : panaderia){
                        System.out.println("("+ Neejir +")" + a);
                        if(Neejir < lacteos.length){
                            Neejir++;
                        }else{
                            Neejir = 0;
                        }
                    }
                    elecionSec =  input.nextInt();
                    System.out.println("producto selecionado " + panaderia[elecionSec] + " precio " +precioP[elecionSec]);
                    System.out.println("canidad del producto");
                    cantidad = input.nextInt();
                    total += precioP[elecionSec]*cantidad;
                    cantidadElegida++;
                    System.out.println("Monto a pagar " + total);
                    System.out.println("producto escogido" + cantidadElegida);
                    System.out.println("desea compra mas producto");
                    System.out.println("si(9)  no (10)");
                    opcion = input.nextInt();
                }
    }
    public void getVerdura(){
                System.out.println("section " + section[elecionSec]);
                System.out.println("elegir producto");
                while(opcion != 10){
                    Neejir = 0;
                    for(String a : verdura){
                        System.out.println("("+ Neejir +")" + a);
                        if(Neejir < lacteos.length){
                            Neejir++;
                        }else{
                            Neejir = 0;
                        }
                    }
                    elecionSec =  input.nextInt();
                    System.out.println("producto selecionado " + verdura[elecionSec] + " precio " +precioV[elecionSec]);
                    System.out.println("canidad del producto");
                    cantidad = input.nextInt();
                    total += precioA[elecionSec]*cantidad;
                    cantidadElegida++;
                    System.out.println("Monto a pagar " + total);
                    System.out.println("producto escogido" + cantidadElegida);
                    System.out.println("desea compra mas producto");
                    System.out.println("si(9)  no (10)");
                    opcion = input.nextInt();
                }
    }
    public void getLacteos(){
                System.out.println("section " + section[elecionSec]);
                System.out.println("elegir producto");
                while(opcion != 10){
                    Neejir = 0;
                    for(String a : lacteos){
                        System.out.println("("+ Neejir +")" + a);
                        if(Neejir < lacteos.length){
                            Neejir++;
                        }else{
                            Neejir = 0;
                        }
                    }
                    elecionSec =  input.nextInt();
                    System.out.println("producto selecionado " + lacteos[elecionSec] + " precio " +precioL[elecionSec]);
                    System.out.println("canidad del producto");
                    cantidad = input.nextInt();
                    total += precioA[elecionSec]*cantidad;
                    cantidadElegida++;
                    System.out.println("Monto a pagar " + total);
                    System.out.println("producto escogido" + cantidadElegida);
                    System.out.println("desea compra mas producto");
                    System.out.println("si(9)  no (10)");
                    opcion = input.nextInt();
                }
    }
}
