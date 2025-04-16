
package tp2_ej3;

import java.util.Scanner;

public class TP2_EJ3 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Racional r1 = new Racional();
        Racional r2 = new Racional();
        int op;
        
        do{
            System.out.println("-------------- MENU --------------\n");
            System.out.println("1. Ingresar racionales\n2. Sumar\n3. Restar\n4. Multiplicar\n5. Dividir\n6. Operaciones con otro\n7. A decimal\n8. Comparar\n9. Cadena\n10. MCD\n\n\n0. SALIR\n");
            System.out.println("Selecciona Opcion: ");
            op = teclado.nextInt();
            switch(op) {
                
                case 1 -> {
                    System.out.println("Primer numerador: ");
                    r1.setNum(teclado.nextInt());
                    System.out.println("Primer denominador: ");
                    r1.setDen(teclado.nextInt());
                    System.out.println("Segundo numerador: ");
                    r2.setNum(teclado.nextInt());
                    System.out.println("Segundo denominador: ");
                    r2.setDen(teclado.nextInt());
                }
                case 2 -> System.out.println(Racional.Suma(r1, r2).Simplificar());
                case 3 -> System.out.println(Racional.Resta(r1, r2).Simplificar());
                case 4 -> System.out.println(Racional.Multiplicar(r1, r2).Simplificar());
                case 5 -> System.out.println(Racional.Dividir(r1, r2).Simplificar());
                case 6 -> System.out.println("Suma: " + r1.Suma(r2).Simplificar() + "\nResta: " + r1.Resta(r2).Simplificar() + "\nMultiplicacion: " + r1.Multiplicar(r2).Simplificar() + "\nDivision: " + r1.Dividir(r2).Simplificar());
                case 7 -> System.out.println("El Decimal de " + r1.getNum() + "/" + r1.getDen() + " es: " + r1.aDecimal() + "\nEl Decimal de " + r2.getNum() + "/" + r2.getDen() + " es: " + r2.aDecimal());
                case 8 -> {
                    if(r1.Simplificar().equals(r2.Simplificar())) System.out.println("Son iguales");
                    else System.out.println("Son distintos");
                }
                case 9 -> System.out.println("r1: " + r1.toString() + "\nr2: " + r2.toString());
                case 10 -> System.out.println("El mcd entre " + r1.toString() + " y " + r2.toString() + " es: " + Racional.ObtenerMCD(r1.getDen(),r1.getNum()));
            }
            new Scanner(System.in).nextLine();
        }while(op!=0);
  
    }
    
}