package tp2_ej5;

import java.util.Scanner;

public class Estudiante {
    private String apellidos;
    private String nombres;
    private int lu;
    private String email;
    public boolean regular;
    private int notaP1;
    private int notaP2;
    private int notaR;
    private int asistencia;
    private static int totalclases = 28;
    public Estudiante() {
    }

    public Estudiante(String apellidos, String nombres, int lu, String email) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.lu = lu;
        this.email = email;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public int getLu() {
        return lu;
    }

    public String getEmail() {
        return email;
    }

    public boolean isRegular() {
        return regular;
    }

    public int getNotaP1() {
        return notaP1;
    }

    public int getNotaP2() {
        return notaP2;
    }

    public int getNotaR() {
        return notaR;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public void setNotaP1(int notaP1) {
        this.notaP1 = notaP1;
    }

    public void setNotaP2(int notaP2) {
        this.notaP2 = notaP2;
    }

    public void setNotaR(int notaR) {
        this.notaR = notaR;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
    
    public void incAsistencias(){
        this.asistencia++;
    }
    
    public void incAsistencias(int c){
        this.asistencia+=c;
    }
    
    public static Estudiante nuevo(){
        Scanner teclado = new Scanner(System.in);
        String cad1,cad2,cad3;
        int a,o;
        System.out.println("Ingrese los datos\n");
        System.out.println("Ingrese Nombres: ");
        cad1 = teclado.next();
        System.out.println("Ingrese Apellidos: ");
        cad2 = teclado.next();
        System.out.println("Ingrese Numero de LU: ");
        a = teclado.nextInt();
        System.out.println("Ingrese Email: ");
        cad3 = teclado.next();
        Estudiante estudiante = new Estudiante(cad1,cad2,a,cad3);
        System.out.println("Ingrese Nota primer parcial: ");
        estudiante.setNotaP1(teclado.nextInt());
        System.out.println("Ingrese Nota segundo parcial: ");
        estudiante.setNotaP2(teclado.nextInt());
        System.out.println("Recupero? 0 = NO / 1 = SI");
        o = teclado.nextInt();
        if(o==1){
            System.out.println("Ingrese Nota del recuperatorio: ");
            estudiante.setNotaR(teclado.nextInt());
        }
        estudiante.setAsistencia(0);
        return estudiante;
    }
    
    public static boolean regular(Estudiante a){
        if(a.notaP1>=60 && a.notaP2>=60 || a.notaP1>=60 && a.notaR>=60 || a.notaP2>=60 && a.notaR>=60) return a.asistencia>=(Estudiante.totalclases/100)*80;
        else return false;
    }
}





