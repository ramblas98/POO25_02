/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicor
 */
public class Vendedor {
    private int legajo;
    private String zona;
    private float ventasMensuales[];
    private Persona datosPersonales;
    
    public Vendedor(){
        
    }
    
    //CONTRUCTORE
    public Vendedor(int legajo, String zona, float[] ventasMensuales, Persona datosPersonales) {
        this.legajo = legajo;
        this.zona = zona;
        this.ventasMensuales = ventasMensuales;
        this.datosPersonales = datosPersonales;
    }
    
    //GETTERS
    public int getLegajo() { 
        return legajo;
    }

    public String getZona() {
        return zona;
    }

    public float[] getVentasMensuales() {
        return ventasMensuales;
    }

    public Persona getDatosPersonales() {    
        return datosPersonales;
    }

    //SETTERS
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public void setVentasMensuales(float[] ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public void setDatosPersonales(Persona datosPersonales) {
        this.datosPersonales = datosPersonales;
    }
    
    //--------------------------------------------------------------------------------------------
    
    static Vendedor nuevo(){
        Scanner teclado = new Scanner(System.in);
        
        Vendedor v2 = new Vendedor();
        
        System.out.println("Legajo: ");
        v2.legajo = teclado.nextInt();
        teclado.nextInt();
        
        System.out.println("Zona: ");
        v2.zona = teclado.nextLine();
        
        v2.ventasMensuales = new float[12]; //inicializar el array
        v2.agregarVenta2();
        
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
        ventasMensuales[i] = gana;
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
            
            ventasMensuales[i] = vendio;
        }
    }
    
    public float totalAnual(){
        int i;
        float total=0;
        
        for(i=0; i<12; i++){
            total = total + ventasMensuales[i];
        }
        
        return total;
    }
    
    public float comision(){
        float comi;
        if(totalAnual() < 50000){
            return 0;
        }else if(totalAnual() < 75000){
            comi = (totalAnual() * 15) / 100;
            return comi;
        }else if(totalAnual() < 100000){
            comi = (totalAnual() * 20) / 100;
            return comi;
        }else{
            comi = (totalAnual() * 20) / 100;
            return comi;
        }
    }
    
    public String toString() {
        return  datosPersonales.getApellido() + " " + datosPersonales.getNombre() + " (DNI: " + datosPersonales.getDni() + ")" + " = " + comision();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} //public class vendedor



