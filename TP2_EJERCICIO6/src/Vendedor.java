/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
import java.util.Arrays;

public class Vendedor {
    private int legajo;
    private String zonaVenta;
    private double VentasMensuales[];
    private Persona datosPersonales;
    
    public Vendedor() {
    }
    public Vendedor(int legajo, String zonaVenta, float[] ventasMensuales, Persona datosPersonales) {
        this.legajo = legajo;
        this.zonaVenta = zonaVenta;
        VentasMensuales = new double [12];
        this.datosPersonales = datosPersonales;
    }
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public String getZonaVenta() {
        return zonaVenta;
    }
    public void setZonaVenta(String zonaVenta) {
        this.zonaVenta = zonaVenta;
    }
    public double[] getVentasMensuales() {
        return VentasMensuales;
    }
    public void setVentasMensuales(double[] ventasMensuales) {
        VentasMensuales = ventasMensuales;
    }
    public Persona getDatosPersonales() {
        return datosPersonales;
    }
    public void setDatosPersonales(Persona datosPersonales) {
        this.datosPersonales = datosPersonales;
    }
    
    public double totalAnual(){
        double total = 0;
        for (int i = 0; i < VentasMensuales.length; i++) {
            total+=VentasMensuales[i];
        }
        return total;
    }
    
    public double comision(){
        double total = this.totalAnual();
        if(total >= 50000){
            if(total > 50000 && total<75000){
                return (double) (total * 0.15);
            }else{
                if(total > 75000 && total < 100000){
                    return (double) (total * 0.20);
                }else{
                 return (double)(total*0.30);
                }
                
            } 
        }else{
            return (double) 0;
        }
    }
    
    public void agregarVenta(int mes, double monto){
        if (VentasMensuales == null) {
            VentasMensuales = new double[12];
        }
    
        if (mes >= 0 && mes < 12) {
            VentasMensuales[mes] = monto;
            
        } else {
            System.out.println("Mes inválido (debe ser de 0 a 11).");
        }
    }
    
    @Override
    public String toString() {
        return "Vendedor [legajo=" + legajo + ", zonaVenta=" + zonaVenta + ", VentasMensuales="
                + Arrays.toString(VentasMensuales) + ", datosPersonales=" + ", Nombre: "+ datosPersonales.getNombres() +", Apellido: "+ datosPersonales.getApellidos() + ", DNI: "+ datosPersonales.getDni() + "]";
    }
}
