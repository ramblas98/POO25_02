
package tp2_ej5;

import java.util.Scanner;

public class TP2_EJ5 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Estudiante lista[] = new Estudiante [100];
        int n = 0;
        int opcion = 0;
        
        System.out.println("\n=========================================================================================\n");
        
        do {
            
            Estudiante nuevo = new Estudiante();
            nuevo.IngresarDatos();
            lista[n] = nuevo;
            
            n++;
            
            System.out.println("Desea Ingresar Un Nuevo Estudiante (No = 0) | (Si = 1): ");
            opcion = teclado.nextInt();
            
        } while (opcion != 0);
        
        System.out.println("\n=========================================================================================\n");
        
        
        
        System.out.println("\n=========================================================================================\n");
        
    }
    
}
