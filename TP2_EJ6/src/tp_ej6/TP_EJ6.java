/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_ej6;

import java.util.Scanner;

/**
 *
 * @author aldia
 */
public class TP_EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
       
        Vendedor v1, v2, v3;
        
        v1 = new Vendedor(); // insertar ventas mensuales (en el constructor)
        v1.setLegajo(1000);
        v1.setZonaVenta("Oran");
        v1.setVentasMensuales(new float[12]); //inicializar el array
        v1.agregarVenta();
        v1.setDatosPersonales(new Persona("Aricuri", "Aldana", 11111111));
        
        
        v2 = new Vendedor();
        v2.setLegajo(2000);
        v2.setZonaVenta("Yrigoyen");
        v2.setVentasMensuales(new float[12]); //inicializar el array
        v2.agregarVenta();
        v2.setDatosPersonales(new Persona("Alvarez", "Emilio", 22222222));

        
        v3 = new Vendedor();
        v3.setLegajo(2000);
        v3.setZonaVenta("Yrigoyen");
        v3.setVentasMensuales(new float[12]); //inicializar el array
        v3.agregarVenta();
        v3.setDatosPersonales(new Persona("Alvarado", "Lujan", 33333333));
        
        System.out.println(v1.toString());
        v1.mostrarVentasMensuales();
        System.out.printf("Total anual vendido: $%.2f\n", v1.totalAnual());

        System.out.println(v2.toString());
        v2.mostrarVentasMensuales();
        System.out.printf("Total anual vendido: $%.2f\n", v2.totalAnual());

        System.out.println(v3.toString());
        v3.mostrarVentasMensuales();
        System.out.printf("Total anual vendido: $%.2f\n", v3.totalAnual());

        //---------------------------------------------------------------------------------------
        
        Vendedor lista[] = new Vendedor[100];
        
        int i, n;
        
        System.out.println("Ingrese la cantidad de vendedores que desea cargar: ");
        n = teclado.nextInt();
        
        for(i=0; i<n; i++){
            lista[i] = Vendedor.nuevo();
        }
        
        for(i = 0; i < n; i++) {
           System.out.println(lista[i].toString());
           lista[i].mostrarVentasMensuales();
         }
    }
    
}
