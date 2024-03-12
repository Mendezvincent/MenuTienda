package axamenes;

import java.util.Scanner;

/**
 *
 * @author LAB02-PC02
 */
public class ayuda01 {
    public static void main(String[] args) {
        int camionM = 0 ,cal = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Distribuidora MM");
        System.out.println("capacidad maxima de carga de caminon (18000 a 28000)");
        System.out.println("");
        for(int ca = 0 ;  ca < 5; ca++){
            System.out.print("capacidad del camion: ");
            camionM = input.nextInt();
            System.out.println("");
            System.out.print("cuantos kg de cal:");
            cal = input.nextInt();
            System.out.println("");
            /*if(getCal() >= 300 && getCal() <=9000){
            cal = getCal();
            }*/
         if(cal > camionM){
            System.out.println("sobre pasa el peso indicado :(");
        }else{
            System.out.println("comienza el camion :)");
            }
        }

    }
    static int getCal(){
        int cal = (int) (Math.random() * 9000);
        return cal;
    }
}
