package tp2_ej1;

public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha() {
    
    }
    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    

    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAnio() {
        return anio;
    }
    

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    

    
    public void reiniciar(int dia, int mes, int anio) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        normalizar();
    }
    
    public void adelantar(int d) {
        this.dia += d;
        normalizar();
    }
    
    public void imprimir() {
        System.out.println(this.toString());
    }
    
    public boolean valida() {
        
        if (mes < 1 || mes > 12) return false;
        return !(dia < 1 || dia > dias(mes));
        
    }
    
    private void normalizar() {
        while (dia > dias(mes)) {
            dia -= dias(mes);
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }
    
    private int dias(int mes) {
        switch (mes) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return esBisiesto(anio) ? 29 : 28;
            default:
                return 31;
        }
    }
    
    public int diferenciaEnDias(Fecha f) {
        return Math.abs(this.toDias() - f.toDias());
    }
    
    private int toDias() {
        int total = anio * 365 + dia;
        for (int m = 1; m < mes; m++) {
            total += dias(m);
        }

        for (int a = 1; a <= anio; a++) {
            if (esBisiesto(a)) total++;
        }
        return total;
    }
    
    public int comparar(Fecha f) {
        if (anio != f.anio) return anio - f.anio;
        if (mes != f.mes) return mes - f.mes;
        return dia - f.dia;
    }
    
    public Fecha clonar() {
        return new Fecha(dia, mes, anio);
    }
    
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
    
    public String formatear(String fmt) {

        return fmt.replace("dd", String.format("%02d", dia))
                 .replace("mm", String.format("%02d", mes))
                 .replace("yyyy", String.format("%04d", anio));
    }
    
    public static boolean esBisiesto(int anio) {
        return (anio % 400 == 0) || (anio % 100 != 0 && anio % 4 == 0);
    }
    
    public static Fecha hoy() {

        return new Fecha(java.time.LocalDate.now().getDayOfMonth(),
                        java.time.LocalDate.now().getMonthValue(),
                        java.time.LocalDate.now().getYear());
    }
}