package tp2_ej6;
import java.util.Scanner;
public class TP2_EJ6 {
    public static void main(String[] args) {
        Vendedor vendedores[] = new Vendedor[3];
        Scanner scanner = new Scanner(System.in);
        /*
         * INGRESO DE DATOS
         */
        for (int i = 0; i < vendedores.length; i++) {
            vendedores[i] = new Vendedor();
        }
        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Ingresa los datos del vendedor " + (i+1));

            System.out.println("Nombre del vendedor: " + (i+1));

            String nombreVendedor = scanner.nextLine();
            System.out.println("Apellido del vendedor: " + (i+1));
            String apellidoVendedor = scanner.nextLine();
            System.out.println("DNI del vendedor: " + (i+1));
            int dniVendedor = scanner.nextInt();
            
            System.out.println("Ingresa el legajo del vendedor " + (i+1));
            int legajo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingresa la zona de la venta");
            String zona = scanner.nextLine();

            double ventasMensuales [ ] = new double[12];
            for (int k = 0; k < ventasMensuales.length; k++) {
                ventasMensuales[k] = 0;
            }
            Persona datosPersonales = new Persona();
            datosPersonales.setNombres(nombreVendedor);
            datosPersonales.setApellidos(apellidoVendedor);
            datosPersonales.setDni(dniVendedor);
            vendedores[i].setDatosPersonales(datosPersonales);
    
            vendedores[i].setLegajo(legajo);
            vendedores[i].setZonaVenta(zona);
            vendedores[i].setVentasMensuales(ventasMensuales);
            
        }

        /*
         * Agregar las ventas de un mes para cada vendedor
         * for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Ingresar el mes y el monto de la venta del vendedor numero "+ i);
            System.out.println("MES DE LA VENTA: ");
            int mes = scanner.nextInt();
            System.out.println("MONTO TOTAL");
            double monto = scanner.nextDouble();
            vendedores[i].agregarVenta(mes, monto);
        }
         */
        
        System.out.println("AGREGAR LAS VENTAS DEL AÑO: ");
        for (int i = 0; i < vendedores.length; i++) {
            double lista[] = vendedores[i].getVentasMensuales();
            int pos = lista.length;
            System.out.println("VENTAS DEL VENDEDOR " + (i+1));
            for (int j = 0; j < pos; j++) {
                System.out.println("VENTAS DEL MES: "+ (j+1));
                double venta = scanner.nextDouble();
                vendedores[i].agregarVenta(j, venta);
            }
        }
         for (int i = 0; i < vendedores.length; i++) {
            System.out.println("TOTAL ANUAL DEL VENDEDOR " + (i+1) + " " + vendedores[i].totalAnual());
         }

        for (int i = 0; i < vendedores.length; i++) {
            double comision = vendedores[i].comision();
            if(comision == 0){
                System.out.println("no hay comision para el vendedor: " + (i+1));
            }else{
                System.out.println("comision del vendedor " + (i+1) + " " + comision);
            }
        }

        System.out.println("VENDEDORES: ");
        for (int i = 0; i < vendedores.length; i++) {
            vendedores[i].toString();
        }
        scanner.close();
    }
}
