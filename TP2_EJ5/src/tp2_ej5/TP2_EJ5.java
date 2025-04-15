/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej5;

import java.util.Scanner;

/**
 *
 * @author aldia
 */
public class TP2_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estudiante lista[] = new Estudiante[100];
        int n = 0,i; 
        char opc;
        do{
            lista[n] = Estudiante.nuevoConDatos();
            n+= 1;
            System.out.println("Ingresar otro estudiante? S=N");
            opc = teclado.next().charAt(0);
        }while(opc != 'N' && opc != 'n' );
        
        System.out.println("Alumnos regulares");
        for(i=0;i<n;i++){
            if(lista[i].regular())
                System.out.println(lista[i]);
        }
        
        // TODO code application logic here
    }
    
}
