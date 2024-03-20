package po02;

import java.util.Scanner;
/**
 *
 * @author LAB02-PC02
 */
public class cliente {
    private int password[] = new int[4];
    private int id , opcion = 0;
    private double saldo[] = new double[4];
    private String nombre[] =  new  String[4];
    private Scanner input = new Scanner(System.in);
    public void registra(){
        System.out.println("REGISTRO DE CUENTAS");
        for(int i =  0; i <  nombre.length ; i++){
        System.out.print("user: ");
        nombre[i] = input.next();
        System.out.print("password: ");
        password[i] =  input.nextInt();
        System.out.println("");
        saldo[i] =  0.0;
        }
    }
    
    public boolean validarDate(){
        boolean psar = false;
        System.out.println("\t***************");
        System.out.println("\t** BANCO BCV **");
        System.out.println("\t***************");
        System.out.print("user: ");
        String n =  input.next();
        System.out.print("password: ");
        int pass = input.nextInt();
        for(int a = 0 ; a  < 4 ; a++){
            if(n.equals(nombre[a])  &&  pass == password[a]){
                System.out.println("sesion exitosa");
                id =  a;
                psar =  true;
                break;
            }else{
                System.out.println("user o password no validos");
                psar =  false;
                break;
            }
        }
        return psar;
    }
    
    public void menu(){
        System.out.println("hola " + nombre[id]);
        System.out.println("*********************************************");
        System.out.println("** saldo disponible:  s/." + saldo[id] +"  **");
        System.out.println("*********************************************");
    }
    
    public void depositar(){
        System.out.print("monto a depositar: ");
        double monto =  input.nextDouble();
        saldo[id] += monto;
        System.out.println("*********************************************");
        System.out.println("** saldo disponible:  s/." + saldo[id] +"  **");
        System.out.println("*********************************************");
    }
    public void trafrerir(){
        System.out.println("depositar");
        System.out.println("lista");
        int d = 0;
        for(String name : nombre){
            System.out.println("id("+ d +") user: "+name);
            d++;
        }
        System.out.print("\ningrese el id para depostar:");
        opcion = input.nextInt();
        System.out.print("\nmonto del deposito: ");
        double monto = input.nextDouble();
        if(saldo[id] > 0.0){
            saldo[id] -=monto;
            saldo[opcion] = monto;
            System.out.println("el deposito fue un exito");
            System.out.println("*********************************************");
            System.out.println("** saldo disponible:  s/." + saldo[id] +"  **");
            System.out.println("*********************************************");
        }else{
            System.out.println("fondo insuficiente");
        }
    }
    
}