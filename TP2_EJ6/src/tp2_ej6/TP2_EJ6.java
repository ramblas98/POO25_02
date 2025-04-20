
package tp2_ej6;

import java.util.Scanner;
import java.util.Random;

public class TP2_EJ6 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        
        Vendedor[] ven = new Vendedor[100]; 
        Persona[] per = new Persona[100];
        
        int opcion;
        int n = 0;
        int i;
        
        do {
            
            System.out.println("\n=============================Menu=============================\n");
            System.out.println("1. Ingresar Nuevo Vendedor.\n");
            System.out.println("2. Ingresar Nueva Venta para Un Vendedor.\n");
            System.out.println("3. Calcular el Total Anual de Un Vendedor.\n");
            System.out.println("4. Calcular Comision de Un Vendedor.\n");
            System.out.println("5. Mostrar Comisiones de Los Vendedores.\n");
            System.out.println("0. Salir.\n");
            System.out.println("\n==============================================================\n");
            
            System.out.println(">");
            opcion = teclado.nextInt();
            
            switch (opcion) {
                
                case 1:
                    
                    System.out.println("Ingresando Datos del Vendedor [" + n + "]:\n");
                    
                    System.out.println("Ingrese El Numero de Legajo: ");
                    int legajo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese La Zona de Venta: ");
                    String zona = teclado.nextLine();
                    
                    System.out.println("Ingrese El DNI de La Persona: ");
                    Long dNi = teclado.nextLong();
                    teclado.nextLine();
                    System.out.println("Ingrese El Apellido de La Persona: ");
                    String apellido = teclado.nextLine();
                    System.out.println("Ingrese El Nombre de La Persona: ");
                    String nombre = teclado.nextLine();
                    
                    per[n] = new Persona(apellido, nombre, dNi);

                    float[] ventas = new float[12];
                    
                    ven[n] = new Vendedor(legajo, zona, ventas, per[n]);
                    
                    n++;
                    
                    break;
                    
                case 2:
                   
                    System.out.println("Ingrese El Numero de Vendedor al que Desea Registrar Una Venta:\n");
                    int num = teclado.nextInt();
                    
                    for (i=0; i<12; i++) {
                        
                        float venta = rand.nextFloat() * 150000;
                    
                        ven[num].AgregarVenta(i, venta);
                    
                        System.out.println("Mes = " + i);
                        System.out.println("Venta = " + venta);
                    
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Ingrese El Numero de Vendedor al que Desea Calcular El Total Anual:\n");
                    num = teclado.nextInt();
                    
                    System.out.println("Total Anual del Vendedor [" + num + "]: " + ven[num].TotalAnual());
                    
                    break;
                    
                case 4:
                    
                    System.out.println("Ingrese El Numero de Vendedor al que Desea Calcular La Comision:\n");
                    num = teclado.nextInt();
                    
                    System.out.println("Comision Total del Vendedor [" + num + "]: " + ven[num].Comision());
                    
                    break;
                    
                case 5: 
                    
                    System.out.println("Comisiones de Todos Los Vendedores:\n");
                    
                    for (i=0; i<n; i++) {
                        
                        System.out.println("Comision Total del Vendedor [" + i + "]: " + ven[i].Comision());
                        
                    }
                    
                    break;
                    
                case 0:
                    
                    System.out.println("Saliendo....\n");
                    
                    break;
                    
            }
            
        } while (opcion != 0);
        
        
    }
    
}
