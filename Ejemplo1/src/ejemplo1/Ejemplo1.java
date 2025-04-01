/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author nicor
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        String n;
        String[] notas={"do", "do#", "re", "re#", "mi", "fa", "fa#", "sol", "sol#", "la", "la#", "si"};
        int s, i, pos=-1;
        
        s = teclado.nextInt();
        teclado.nextLine();
        n = teclado.nextLine();
        
        n = n.toLowerCase();
        
        for(i=0; i<notas.length; i++){
            if(notas[i].equals(n)){
                pos = i;
            }
        }
        
        if(s>=1 && s<=3){       
          if(pos >= s){
              System.out.println(notas[pos-s]);
          }else{
              System.out.println(notas[notas.length+(pos-s)]);
          }
        }       
    }
    
}
