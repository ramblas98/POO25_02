
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
        
        System.out.println("Resultado de La Resta: " + resta);
        
        System.out.println("\n===========================================================\n");
        
        System.out.println("Prueba de Los Puntos 7 y 8 (+Multiplicar ; +Dividir): \n");
        
        System.out.println("Ingrese Un Numerador: ");
        n = teclado.nextInt();
        
        System.out.println("\nIngrese Un Denominador: ");
        d = teclado.nextInt();
               
        temp.setNum(n);
        temp.setDen(d);
        
        Racional multiplicacion = R1.Multiplicar(temp);
        
        System.out.println("Resultado de La Multipliacacion: " + multiplicacion);
        
        Racional division = R1.Dividir(temp);
        
        System.out.println("Resultado de La Division: " + division);
        
        System.out.println("\n===========================================================\n");
        
        System.out.println("Prueba de Los Puntos 9 y 10 (+Simplificar ; +Decimal)");
        
        Racional simplificacion = R1.Simplificar();
        
        System.out.println("Resultado de La Simplificacion: " + simplificacion);
        
        double decimal = R1.aDecimal();
        
        System.out.println("Resultado de La Comversion a Decimal: " + decimal);
        
        System.out.println("\n===========================================================\n");
        
        System.out.println("Prueba de Los Puntos 12 y 13 (+Equals ; +CompareTo)");
        
        System.out.println("Ingrese Un Numerador: ");
        n = teclado.nextInt();
        
        System.out.println("\nIngrese Un Denominador: ");
        d = teclado.nextInt();
               
        temp.setNum(n);
        temp.setDen(d);
        
        System.out.println("Resultado del Equals: ");
        
        if (R1.equals(temp) == true) {
            
            System.out.println("Son Iguales");
            
        } else {
            
            System.out.println("Son Distintos");
            
        }
        
        System.out.println("\n===========================================================\n");
        
        System.out.println("Prueba de Los Puntos 14 y 15 (+Static Sumar ; +Static Restar)");
        
        System.out.println("Ingrese Un Numerador: ");
        n = teclado.nextInt();
        
        System.out.println("\nIngrese Un Denominador: ");
        d = teclado.nextInt();
               
        temp.setNum(n);
        temp.setDen(d);
        
        suma = Racional.Suma(R1, temp);
        
        System.out.println("Resultado de La Suma: " + suma);
        
        resta = Racional.Resta(R1, temp);
        
        System.out.println("Resultado de La Resta: " + resta);
        
        System.out.println("\n===========================================================\n");
        
        System.out.println("Prueba de Los Puntos 16 y 17 (+Static Multiplicar ; +Static Dividir)");
        
        System.out.println("Ingrese Un Numerador: ");
        n = teclado.nextInt();
        
        System.out.println("\nIngrese Un Denominador: ");
        d = teclado.nextInt();
               
        temp.setNum(n);
        temp.setDen(d);
        
        multiplicacion = Racional.Multiplicar(R1, temp);
        
        System.out.println("Resultado de La Multiplicacion: " + multiplicacion);
        
        division = Racional.Dividir(R1, temp);
        
        System.out.println("Resultado de La Division: " + division);
        
        System.out.println("\n===========================================================\n");
        
        System.out.println("Prueba Del Punto 18 (-Static MCD)");
        
        System.out.println("Ingrese Un Numerador: ");
        n = teclado.nextInt();
        
        System.out.println("\nIngrese Un Denominador: ");
        d = teclado.nextInt();
               
        int mcd = Racional.ObtenerMCD(n, d);
        
        System.out.println("Resultado de MCD: " + mcd);
        
        System.out.println("\n===========================================================\n");
        
    }
    
}
