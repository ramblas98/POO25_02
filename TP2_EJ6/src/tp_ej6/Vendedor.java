/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_ej6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aldia
 */
public class Vendedor {
    private int legajo;
    private String ZonaVenta;
    private float VentasMensuales[];
    private Persona datosPersonales;

    public Vendedor() {
    }

    public Vendedor(int legajo, String ZonaVenta, float[] VentasMensuales, Persona datosPersonales) {
        this.legajo = legajo;
        this.ZonaVenta = ZonaVenta;
        this.VentasMensuales = VentasMensuales;
        this.datosPersonales = datosPersonales;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getZonaVenta() {
        return ZonaVenta;
    }

    public float[] getVentasMensuales() {
        return VentasMensuales;
    }

    public Persona getDatosPersonales() {
        return datosPersonales;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setZonaVenta(String ZonaVenta) {
        this.ZonaVenta = ZonaVenta;
    }

    public void setVentasMensuales(float[] VentasMensuales) {
        this.VentasMensuales = VentasMensuales;
    }

    public void setDatosPersonales(Persona datosPersonales) {
        this.datosPersonales = datosPersonales;
    }
    
    static Vendedor nuevo(){
        Scanner teclado = new Scanner(System.in);
        
        Vendedor v2 = new Vendedor();
        
        System.out.println("Legajo: ");
        v2.legajo = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Zona: ");
        v2.ZonaVenta= teclado.nextLine();
        
        v2.VentasMensuales = new float[12]; //inicializar el array
        v2.agregarVenta();
        
        System.out.println("Datos persona: ");
        v2.datosPersonales = Persona.nuevo();
        
        return v2;
    }
    
    public void agregarVenta(){
        Random random = new Random(); //crea una instancia de Random
        
        float gana; 
        int i;
        
        for(i=0; i<12; i++){
        gana = random.nextFloat() * 100000; 
        //genera un numero random aleatorio entre 0 y un limite (ejemplo 100000)
        VentasMensuales[i] = gana;
        }
    }
    
    public void agregarVenta2(){
        Scanner teclado = new Scanner(System.in);
        
        int i;
        float vendio;
        
        for(i=0; i<12; i++){
            
            System.out.println("Total vendido del mes " + (i+1) + ": ");
            vendio = teclado.nextFloat();
            
            //vendio = random.nextFloat() * 100000; 
            //genera un numero random aleatorio entre 0 y un limite (ejemplo 100000)
            
            VentasMensuales[i] = vendio;
        }
    }
    
     public float totalAnual(){
        int i;
        float total=0;
        
        for(i=0; i<12; i++){
            total = total + VentasMensuales[i];
        }
        
        return total;
    }
    
    public float comision(){
        float comision;
        float t = this.totalAnual();
        
        if(t >= 100000){
            comision = (float) (t * 0.30);
        }
        else if(t > 75000 && t < 100000){
            comision = (float) (t * 0.20);
        }
        else if( t > 50000 && t < 75000){
            comision = (float) (t * 0.15);
        }
        else comision = 0;
        
        return comision;
       
    }
    public void mostrarVentasMensuales() {
    for (int i = 0; i < VentasMensuales.length; i++) {
        System.out.printf("Mes %2d: $%.2f\n", i + 1, VentasMensuales[i]);
    }
}
    
    public String toString() {
        return  datosPersonales.getApellido() + " " + datosPersonales.getNombre() + " (DNI: " + datosPersonales.getDni() + ")" + " comision = " + comision();
    }
    
    
    
}
