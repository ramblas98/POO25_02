
package tp2_ej3;

import java.util.Scanner;

public class TP2_EJ3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Racional R1 = new Racional();
        
        System.out.println("Numeros Ingresados: ");
        
        R1.setNum(8);
        R1.setDen(2);
        
        System.out.println(R1);
        
        System.out.println("\n===========================================================\n");
        
        System.out.println("Prueba de Los Puntos 7 y 8 (+Suma ; +Resta): \n");
        
        System.out.println("Ingrese Un Numerador: ");
        int n = teclado.nextInt();
        
        System.out.println("\nIngrese Un Denominador: ");
        int d = teclado.nextInt();
        
        Racional temp = new Racional();
        
        temp.setNum(n);
        temp.setDen(d);
               
        Racional suma = R1.Suma(temp);
        
        System.out.println("Resultado de La Suma: " + suma);
        
        Racional resta = R1.Resta(temp);
        
        System.out.println("Resulatdo de La Resta: " + resta);
        
        System.out.println("\n===========================================================\n");
        
        System.out.println("Prueba de Los Puntos 7 y 8 (+Multiplicar ; +Dividir): \n");
        
        
        
        System.out.println("\n===========================================================\n");
        
    }
    
}
