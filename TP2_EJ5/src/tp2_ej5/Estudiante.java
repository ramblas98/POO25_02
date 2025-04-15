/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej5;

import java.util.Scanner;

/**
 *
 * @author aldia
 */
public class Estudiante {

    private static String nextLine() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static int nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String apellido;
    private String nombre;
    private int lu;
    private String email;
    public boolean regular;
    private int notP1;
    private int notP2;
    private int notR;
    private int asistencia;
    static int totalClases = 28;
            
            

    public Estudiante() {
    }

    public Estudiante(String apellido, String nombre, int lu, String email) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.lu = lu;
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
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

    public int getNotP1() {
        return notP1;
    }

    public int getNotP2() {
        return notP2;
    }

    public int getNotR() {
        return notR;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public static int getTotalClases() {
        return totalClases;
    }
    

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setNotP1(int notP1) {
        this.notP1 = notP1;
    }

    public void setNotP2(int notP2) {
        this.notP2 = notP2;
    }

    public void setNotR(int notR) {
        this.notR = notR;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public static void setTotalClases(int totalClases) {
        Estudiante.totalClases = totalClases;
    }
    
    public void IncAsistencia(){
        this.asistencia += 1;    
    }
    
    public void IncAsitencia(int cantidad){
        this.asistencia +=cantidad;     
    }
    
    public String toString(){
    return "Estudiante: " + nombre + " " + apellido +
           "\nLU: " + lu +
           "\nEmail: " + email +
           "\nNotas: P1=" + notP1 + ", P2=" + notP2 + ", Recuperatorio=" + notR;
    }

    
    public static Estudiante nuevoConDatos(){
        Estudiante nuevo = new Estudiante();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese apellido ");
        nuevo.apellido = teclado.nextLine();
        System.out.println("Ingrese nombre ");
        nuevo.nombre = teclado.nextLine();
        System.out.println("Ingrese lu ");
        nuevo.lu = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese email ");
        nuevo.email = teclado.nextLine();
        System.out.println("Ingresse notaP1 ");
        nuevo.notP1 = teclado.nextInt();
        System.out.println("Ingresse notaP2 ");
        nuevo.notP2 = teclado.nextInt();
        System.out.println("Ingresse notR ");
        nuevo.notR = teclado.nextInt();
        System.out.println("Ingrese numero de asistencia: ");
        nuevo.asistencia = teclado.nextInt(); 
        
        //nuevo.regular = regular(nuevo.notR, nuevo.notP1, nuevo.notP2, nuevo.asistencia);
        
        return nuevo;
    }
    
    public boolean regular(){
    double porcentajeAsistencia = (asistencia * 100) / totalClases;

    if((notP1 >= 60 && notP2 >= 60 || notR >= 60 && (notP1 >= 60 || notP2 >= 60)) 
        && porcentajeAsistencia >= 80)
        return true;
    return false;
    }

   
}
