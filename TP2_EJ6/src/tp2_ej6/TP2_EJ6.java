/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicor
 */
public class TP2_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        Vendedor v1, v2, v3;
        
        v1 = new Vendedor(); // insertar ventas mensuales (en el constructor)
        v1.setLegajo(1000);
        v1.setZona("Oran");
        v1.setVentasMensuales(new float[12]); //inicializar el array
        v1.agregarVenta();
        v1.setDatosPersonales(new Persona("Coronel", "Nicolas", 11111111));
        
        
        v2 = new Vendedor();
        v2.setLegajo(2000);
        v2.setZona("Yrigoyen");
        v2.setVentasMensuales(new float[12]); //inicializar el array
        v2.agregarVenta();
        v2.setDatosPersonales(new Persona("Donat", "Antonella", 22222222));

        
        v3 = new Vendedor();
        v3.setLegajo(2000);
        v3.setZona("Yrigoyen");
        v3.setVentasMensuales(new float[12]); //inicializar el array
        v3.agregarVenta();
        v3.setDatosPersonales(new Persona("Montero", "Ramiro", 33333333));
        
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());

        //---------------------------------------------------------------------------------------
        
        Vendedor lista[] = new Vendedor[100];
        
        int i, n;
        
        System.out.println("Ingrese la cantidad de vendedores que desea cargar: ");
        n = teclado.nextInt();
        
        for(i=0; i<n; i++){
            lista[i] = Vendedor.nuevo();
        }
        
        for(i=0; i<n; i++){
            System.out.println(lista[i].toString());
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    } //cierra el main
    
}
