/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej5;

import java.util.Scanner;

/**
 *
 * @author nicor
 */
public class TP2_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante lista[] = new Estudiante[100];
        int opc, i, n;
        
        Scanner teclado = new Scanner(System.in);
        
        n = 0;
        opc = 1;
        
        while(opc!=0){
            lista[n] = Estudiante.nuevoConDato();
            n++;
            
            System.out.println("1- Ingreasr otro estudiante");
            System.out.println("0- Salir");
            
            opc = teclado.nextInt();
        }
        
        System.out.println("Estudiantes regulares:");
        for(i=0; i<n; i++){
          if(lista[i].regular(lista[i].getNotaP1(), lista[i].getNotaP2(), lista[i].getNotaR(), lista[i].getAsistencia())){
              System.out.println(lista[i].getApellido() + lista[i].getNombre());
          }
        }
    }
    
}
