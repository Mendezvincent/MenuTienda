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
            System.out.println("(1)registra");
            System.out.println("(2)inicia sesion");
            op = a.next();
            switch (op) {
                case "1" -> clint.registra();
                case "2" -> clint.validarDate();
                default -> System.out.println("opcion no validad");
            }
        }
    }
}
