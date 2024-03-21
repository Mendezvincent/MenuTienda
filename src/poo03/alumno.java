package poo03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LAB02-PC02
 */
public class alumno {
   private int cantidad,idS = 0;
   private Scanner input = new Scanner(System.in);
   private ArrayList<String> nombre = new ArrayList<>();
   private ArrayList<Integer> id = new ArrayList<>();
   private ArrayList<Integer>nota = new ArrayList<>();
   
   public void cantidaG(){
       System.out.println("cuantos alunmos vas a registra");
       cantidad =  input.nextInt();
   }
   public void registar(){
       System.out.println("************************");
       System.out.println("** registro de alumno **");
       System.out.println("************************");
       for(int i =  0;  i < cantidad;  i++){
        System.out.println("DNI: ");
        id.add(input.nextInt());
        System.out.println("nombre: ");
        nombre.add(input.next());
        nota.add(0);
       }
   }
    public void listaAlunmo(){
        for(int m =  0; m < cantidad; m++){
            System.out.println("id ("+ m +") "+nombre.get(m));
        }
    }
    public void ponerNota(){
        listaAlunmo();
        System.out.println("ingrese id del alunmo: ");
        idS = input.nextInt();
        System.out.println("alunmo: " + nombre.get(idS));
        System.out.print("ingresar nota: ");
        nota.set(idS,input.nextInt());
    }
    public void mostraNota(){
        System.out.println("la nota de " + nombre.get(idS) + " es: "  + nota.get(idS));
    }

}
