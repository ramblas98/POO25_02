
package tp2_ej6;

public class Vendedor {

    private int legajo;
    private String zonaVenta;
    private float[] ventasMensuales;
    private Persona datosPersonales;

    public Vendedor(int legajo, String zonaVenta, float[] ventasMensuales, Persona datosPersonales) {
        
        this.legajo = legajo;
        this.zonaVenta = zonaVenta;
    
        if (ventasMensuales == null) {
            this.ventasMensuales = new float[12];
        } else {
            this.ventasMensuales = ventasMensuales;
        }
    
        this.datosPersonales = datosPersonales;
        
}
    
    public int getLegajo() {
        return legajo;
    }

    public String getZonaVenta() {
        return zonaVenta;
    }

    public float[] getVentasMensuales() {
        return ventasMensuales;
    }

    public Persona getDatosPersonales() {
        return datosPersonales;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setZonaVenta(String zonaVenta) {
        this.zonaVenta = zonaVenta;
    }

    public void setVentasMensuales(float[] ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public void setDatosPersonales(Persona datosPersonales) {
        this.datosPersonales = datosPersonales;
    }
    
    public float TotalAnual () {
        
        int i = 0;
        float suma = 0;
        
        while (i < 12) {
            
            suma = suma + this.ventasMensuales[i];
            i++;
            
        }
        
        return suma;
        
    }
    
    public float Comision () {
        
        if (this.TotalAnual() < 50000) {
            
            return 0;
            
        } else if (this.TotalAnual() >= 50000 && this.TotalAnual() <= 75000) {
            
            return this.TotalAnual() * 15 / 100;
            
        } else if (this.TotalAnual() >= 75000 && this.TotalAnual() <= 100000) {
            
            return this.TotalAnual() * 20 / 100;
            
        } else {
            
            return this.TotalAnual() * 30 / 100;
            
        }
        
    }
    
    public void AgregarVenta (int mes, float venta) {
        
        this.ventasMensuales[mes] = venta;
        
    }
    
}
