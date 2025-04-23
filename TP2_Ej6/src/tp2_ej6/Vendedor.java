package tp2_ej6;

import java.util.Random;
import java.util.Scanner;

public class Vendedor extends Persona{
    private Persona datosPersonales;
    private int legajo;
    private String zonaDeVenta;
    private float ventasMensuales[];
    
    Scanner teclado = new Scanner(System.in);

    public Vendedor() {
    }

    public Vendedor(Persona datosPersonales, int legajo, String zonaDeVenta) {
        this.datosPersonales = datosPersonales;
        this.legajo = legajo;
        this.zonaDeVenta = zonaDeVenta;
        this.ventasMensuales = new float[12];
        for(int i=0;i<12;i++) this.ventasMensuales[i] = 0;
    }

    public Vendedor(String apellido, String nombre, int dni, int legajo, String zonaDeVenta) {
        this.datosPersonales = new Persona(apellido,nombre,dni);
        this.legajo = legajo;
        this.zonaDeVenta = zonaDeVenta;
        this.ventasMensuales = new float[12];
        for(int i=0;i<12;i++) this.ventasMensuales[i] = 0;
    }
    

    public Persona getDatosPersonales() {
        return datosPersonales;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getZonaDeVenta() {
        return zonaDeVenta;
    }

    public void setDatosPersonales(Persona datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setZonaDeVenta(String zonaDeVenta) {
        this.zonaDeVenta = zonaDeVenta;
    }
    
    
    public void generarVentas(){
        Random random = new Random();
        for(int i=0;i<12;i++) this.ventasMensuales[i] = (float) (random.nextInt(10000 - 2000) + 2000);
    }
    
    public float totalAnual(){
        float total = 0;
        for(int i=0;i<12;i++) total += this.ventasMensuales[i];
        return total;
    }
    
    public float comision(){
        float total = this.totalAnual();
        if(total>=50000){
            if(total<=75000) return (float) total/100 * 15;
            else{
                if(total<=100000) return (float) total/100 * 20;
                else return (float) total/100 * 30;
            }
        }
        else return 0;
    }
    
    public void agregarVenta(int mes,float venta){
        this.ventasMensuales[mes-1] = venta;
    }
    
    public Vendedor cargarDatos(){
        Persona datos = new Persona();
        System.out.println("Ingrese los datos del Vendedor\n");
        System.out.println("Ingrese nombre: ");
        datos.setNombre(teclado.next());
        System.out.println("Ingrese apellido: ");
        datos.setApellido(teclado.next());
        System.out.println("Ingrese dni: ");
        datos.setDni(teclado.nextInt());
        System.out.println("Ingrese legajo: ");
        int leg = teclado.nextInt();
        System.out.println("Ingrese zona de venta: ");
        String zv = teclado.next();
        
        return new Vendedor(datos,leg,zv);
    }
}

