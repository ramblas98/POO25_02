package tp2_ej1;
import java.util.Calendar;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructores
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 2000;
    }

    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.año = a;
        normalizar(); 
    }

    // Getters
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAño() { return año; }

    // Setters
    public void setDia(int d) { this.dia = d; normalizar(); }
    public void setMes(int m) { this.mes = m; normalizar(); }
    public void setAño(int a) { this.año = a; }

    // Reiniciar
    public void reiniciar(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.año = a;
        normalizar();
    }

    // Adelantar n días
    public void adelantar(int d) {
        for (int i = 0; i < d; i++) {
            this.dia++;
            normalizar();
        }
    }

    // Imprimir
    public void imprimir() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, año);
    }

    // Validar fecha
    public boolean valida() {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > dias(mes)) return false;
        return true;
    }

    // Normalizar fecha
    public void normalizar() {
        // Normalizar meses
        if (mes < 1) mes = 1;
        if (mes > 12) mes = 12;

        int maxDia = dias(mes);
        if (dia < 1) dia = 1;
        if (dia > maxDia) dia = maxDia;
    }

    // Días en un mes
    public int dias(int m) {
        switch (m) {
            case 2:
                return esBisiesto(año) ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return 31;
        }
    }

    // ¿Año bisiesto?
    public static boolean esBisiesto(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    // Diferencia en días
    public int diferenciaEnDias(Fecha f) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.set(año, mes - 1, dia);
        c2.set(f.getAño(), f.getMes() - 1, f.getDia());

        long diff = Math.abs(c1.getTimeInMillis() - c2.getTimeInMillis());
        return (int)(diff / (1000 * 60 * 60 * 24));
    }

    // Comparar fechas
    public int comparar(Fecha f) {
        if (año != f.año) return Integer.compare(año, f.año);
        if (mes != f.mes) return Integer.compare(mes, f.mes);
        return Integer.compare(dia, f.dia);
    }

    // Clonar
    public Fecha clonar() {
        return new Fecha(dia, mes, año);
    }

    // toString
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, año);
    }

    // Formatear
    public String formatear(String formato) {
        return formato.replace("dd", String.format("%02d", dia))
                      .replace("mm", String.format("%02d", mes))
                      .replace("aaaa", String.format("%04d", año));
    }

    // Fecha actual
    public static Fecha hoy() {
        Calendar c = Calendar.getInstance();
        return new Fecha(c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH) + 1, c.get(Calendar.YEAR));
    }
}