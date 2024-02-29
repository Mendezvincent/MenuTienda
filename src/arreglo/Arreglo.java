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
    public static void main(String[] args) {
        String section [] = {"abarrotes","panaderia","verdura","lacteos"};
        String productoA [] = {"arroz","fideos","trome","atun","legia","pollo"};
        double precioA [] =  {1.20,1.50,1.00,2.50,0.50,3.00};
        String productoP [] = {"pan redondo","pan cacho","pan molde","pan france","pan integral","pan bicocho"};
        double precioP [] =  {0.50,1.50,1.00,2.50,0.50,3.00};
        String productoV [] = {"cebolla","zanaoria","apio","lechuca","tomate","brocoli"};
        double precioV [] =  {0.20,0.50,1.00,2.50,0.50,3.00};
        String productoL [] = {"leche","yougur","mantequilla","queso freco"," queso parmesano","queso mosarela"};
        double precioL [] =  {1.50,2.50,3.00,2.50,0.50,3.00};
        double total;
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opción 1.");
                    break;
                case 2:
                    System.out.println("Ha seleccionado la opción 2.");
                    break;
                case 3:
                    System.out.println("Ha seleccionado la opción 3.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while(opcion != 0);
        
        scanner.close();
    
        
        
    }
    
        public static void mostrarMenu() {
        System.out.println("=== MENÚ ===");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("0. Salir");
        System.out.println("============");
    }

}
