package po02;

import java.util.Scanner;

/**
 *
 * @author LAB02-PC02
 */
public class main {
    public static void main(String[] args) {
        int opcion = 1;
        String op;
        Scanner a = new Scanner(System.in);
        cliente clint = new cliente();
            System.out.println("\t***************");
            System.out.println("\t** BANCO BCV **");
            System.out.println("\t***************");
            while(opcion != 0){
            System.out.println("que desea hacer?");
            System.out.println("registra");
            System.out.println("inicia sesion");
            op = a.next();
            switch (op) {
                case "registra" -> clint.registra();
                case "inicia sesion" -> {
                    if(clint.validarDate()){
                        clint.menu();
                        while(opcion != 0){
                            System.out.println("depositar");
                            System.out.println("trasferir");
                            op =  a.next();
                            if(op.equals("depositar")){
                                clint.depositar();
                            }else if(op.equals("trasferir")){
                                clint.trafrerir();
                            }
                        }
                    }else{
                        System.out.println("error por bot v:");
                    }
                }
                default -> System.out.println("opcion no validad");
            }
        }
    }
}
