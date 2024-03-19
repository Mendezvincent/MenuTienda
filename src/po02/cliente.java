package po02;

import java.util.Scanner;

/**
 *
 * @author LAB02-PC02
 */
public class cliente {
    private int password[] = new int[4];
    private String nombre[] =  new  String[4];
    private Scanner input = new Scanner(System.in);
    public void registra(){
        System.out.println("REGISTRO DE CUENTAS");
        for(int i =  0; i <  4 ; i++){
        System.out.print("user: ");
        nombre[i] = input.next();
        System.out.print("\npassword: ");
        password[i] =  input.nextInt();
        }
    }
    
    public void  validarDate(){
        System.out.println("sesion bco");
        System.out.print("user: ");
        String n =  input.next();
        System.out.print("\npassword: ");
        int pass = input.nextInt();
        for(int a = 0 ; a  < 4 ; a++){
            if(n.equals(nombre[a])  &&  pass == password[a]){
                System.out.println("sesion exitosa");
                break;
            }else{
                System.out.println("user o password no validos");
                break;
            }
        }
    }
    
    
}
