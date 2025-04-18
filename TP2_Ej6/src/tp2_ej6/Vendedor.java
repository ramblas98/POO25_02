package tp2_ej6;

public class Vendedor extends Persona{
    private Persona datosPersonales;
    private int legajo;
    private String zonaDeVenta;
    private float ventasMensuales[];

    public Vendedor() {
    }

    public Vendedor(Persona datosPersonales, int legajo, String zonaDeVenta) {
        this.datosPersonales = datosPersonales;
        this.legajo = legajo;
        this.zonaDeVenta = zonaDeVenta;
        for(int i=0;i<12;i++) this.ventasMensuales[i] = 0;
    }
    
    
}

