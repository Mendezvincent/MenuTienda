package practica01;

import java.util.Scanner;

/**
 *
 * @author LAB02-PC02
 */
public class clas02 {
        Scanner input =  new Scanner(System.in);
        int numeros01;
        int numeros02;
        int resultado;
        public void capturar(){
            System.out.println("ingresar el prime numero: ");
            numeros01 = input.nextInt();
            System.out.println("ingresar el segundo numero: ");
            numeros02 = input.nextInt();
        }
        
        public void suma(){
           resultado = numeros01 + numeros02;
        }
        
        public void mostra(){
            System.out.println("la suma es " + resultado);
        }
}
