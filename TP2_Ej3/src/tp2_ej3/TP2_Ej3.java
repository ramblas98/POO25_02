package tp2_ej3;

import java.util.Scanner;

public class TP2_Ej3 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int a = teclado.nextInt();
       int b = teclado.nextInt();
       int c = teclado.nextInt();
       int d = teclado.nextInt();
       Racional ab = new Racional(a,b);
       Racional cd = new Racional(c,d);
       
       ab.mostrar();
       cd.mostrar();
       
       cd = ab.simplificar();
       cd.mostrar();
       System.out.println(cd.aDecimal());
    }
}