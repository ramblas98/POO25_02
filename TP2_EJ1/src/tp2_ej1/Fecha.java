/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej1;

import java.util.Calendar;

/**
 *
 * @author aldia
 */
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
        normalizar();
    }

    public void setMes(int mes) {
        this.mes = mes;
        normalizar();
    }

    public void setAnio(int anio) {
        this.anio = anio;
        normalizar();
    }

    @Override
    public String toString() {
        return  dia + "/" + mes + "/" + anio;
    }
    
    public static boolean esBisiesto(int anio){
        if((anio % 4 == 0 || anio % 400 == 0 ) ) return true;
        else return false;
    }
    
    public static boolean esFinDeAnio(int dia, int mes){
        if ( dia == 31 && mes == 12) return true;
        else return false;
    }
    
    // reiniciar
    public void reiniciar(int d, int m, int a) {
        dia = d;
        mes = m;
        anio = a;
        normalizar();
    }
    
    //adelantar
    public void adelantar(int d){
        this.dia += dia;
        normalizar();
    }
    
    // imprimir la fecha
    public void imprimir() {
        System.out.println(toString());
    }
    
    // valida si la fecha es correcta
    public boolean valida() {
        if (mes < 1 || mes > 12) return false;
        if (dia < 1 || dia > diasDelMes(mes, anio)) return false;
        return true;
    }
    
    public void normalizar() { // por si se pasa del numero de dias del mes
        while (dia > diasDelMes(mes, anio)) {
            dia -= diasDelMes(mes, anio);
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
    }
    
    public int diasDelMes(int m, int a) {
         if (m == 2) {
            return esBisiesto(a) ? 29 : 28;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    
    public Fecha clonar() {
       return new Fecha(dia, mes, anio);
    }
    
    public int comparar(Fecha otra) {
        if (anio < otra.anio) return -1;
        if (anio > otra.anio) return 1;

        if (mes < otra.mes) return -1;
        if (mes > otra.mes) return 1;

        if (dia < otra.dia) return -1;
        if (dia > otra.dia) return 1;

        return 0; // Son iguales
    }
    
    public int diferenciaEnDias(Fecha otra) {
       int total1 = anio * 360 + mes * 30 + dia;
       int total2 = otra.anio * 360 + otra.mes * 30 + otra.dia;
       return Math.abs(total1 - total2);
    }
    
    public String formatear(String formato) {
      String resultado = formato;
      resultado = resultado.replace("DD", String.format("%02d", dia));
      resultado = resultado.replace("MM", String.format("%02d", mes));
      resultado = resultado.replace("AAAA", String.valueOf(anio));
      return resultado;
    }
    
    public static Fecha hoy() {
      Calendar cal = Calendar.getInstance();
      int d = cal.get(Calendar.DAY_OF_MONTH);
      int m = cal.get(Calendar.MONTH) + 1;
      int a = cal.get(Calendar.YEAR);
       return new Fecha(d, m, a);
    }
 
}
