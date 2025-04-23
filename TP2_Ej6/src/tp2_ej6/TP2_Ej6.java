package tp2_ej6;

public class TP2_Ej6 {

    public static void main(String[] args) {
        //Carga por constructor
        Vendedor v1 = new Vendedor("Lopez","Blas",22222222,1,"Oran");
        Vendedor v2 = new Vendedor("Reiman","Leo",11111111,2,"Pichanal");
        Vendedor v3 = new Vendedor("Torres","Juan",33333333,3,"Urundel");
        
        //Carga por teclado
      /*Vendedor v1 = new Vendedor();
        Vendedor v2 = new Vendedor();
        Vendedor v3 = new Vendedor();
        
        v1 = v1.cargarDatos();
        v2 = v2.cargarDatos();
        v3 = v3.cargarDatos();*/
        
        v1.generarVentas();
        v2.generarVentas();
        v3.generarVentas();
        
        System.out.println("Comisiones \n\nVendedor 1: " + v1.comision() + "\nVendedor 2: " + v2.comision() + "\nVendedor 3: " + v3.comision());
    }
    
}
