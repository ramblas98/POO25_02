package tp2_ejercicio5;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Estudiante {

    private static String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int notaP1;
    private int notaP2;
    private int notaR;
    private String apellidos;
    private String nombres;
    private int lu;
    private String email;
    private int asistencia;
    
    public Estudiante () {
    }

    public Estudiante(int notaP1, int notaP2, int notaR, String apellidos, String nombres, int lu, String email, int asistencia) {
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaR = notaR;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.lu = lu;
        this.email = email;
        this.asistencia = asistencia;
    }
    
    //GETTERS

    public int getNotaP1() {
        return notaP1;
    }

    public int getNotaP2() {
        return notaP2;
    }

    public int getNotaR() {
        return notaR;
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

    public int getAsistencia() {
        return asistencia;
    }
    //SETTERS

    public void setNotaP1(int notaP1) {
        this.notaP1 = notaP1;
    }

    public void setNotaP2(int notaP2) {
        this.notaP2 = notaP2;
    }

    public void setNotaR(int notaR) {
        this.notaR = notaR;
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

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
    
    static boolean regular(int p1, int p2, int nr, int asis){
       if (asis >= 80 ){
           if(p1 >= 60 && p2 >= 60){
               return true;
           }else if(nr >= 60 && (p1>=60 || p2>=60) ){
               return true;
           }else return false;
       }else return false;
    }
    
    static Estudiante nuevoConDato(){
        Estudiante f1 = new Estudiante();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese El nombre: ");
        f1.nombres = teclado.nextLine();
        System.out.println("Ingrese Apellido: ");
        f1.apellidos = teclado.nextLine();
        System.out.println("Ingrese Libreta universitaria: ");
        f1.lu = teclado.nextInt();
        System.out.println("Ingrese Email: ");
        f1.email = teclado.nextLine();
        System.out.println("Ingrese Nota de Parcial 1: ");
        f1.notaP1 = teclado.nextInt();
        System.out.println("Ingrese Nota de Parcial 2: ");
        f1.notaP2 = teclado.nextInt();
        System.out.println("Ingrese Nota de Recuperatorio: ");
        f1.notaR = teclado.nextInt();
        
        return f1;
        
    }
    
}
