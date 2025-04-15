/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej5;
import java.util.Scanner;
/**
 *
 * @author nicor
 */
public class Estudiante {

    private static String nextLine;
    private static int nextInt;
    private String apellido;
    private String nombre;
    private int lu;
    private String email;
    public boolean regular;
    private int notaP1;
    private int notaP2;
    private int notaR;
    private int asistencia;
    private static int clases = 28;
    
    public Estudiante(){
    }
    
    //CONSTRUCTOR
    public Estudiante(String apellido, String nombre, int lu, String email, boolean regular, int notaP1, int notaP2, int notaR, int asistencia) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.lu = lu;
        this.email = email;
        this.regular = regular;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaR = notaR;
        this.asistencia = asistencia;
    }
    
    //GETTERS
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
    
    //SETTERS
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
    //-------------------------------------------------------------------------------------------------
    
    static float porAsistencia(int asistencia, int clases){
        float por;
        por = asistencia / clases;
        return por;
    }
    
    static boolean regular(int P1, int P2, int R, int asiste){
        if(asiste >= 80){
            if(P1 >= 60 && P2 >= 60){
                return true;
            }else if(R >= 60 && (P1>=60 || P2>=60)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    static Estudiante nuevoConDato(){
        Estudiante e2 = new Estudiante();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Apellido:");
        e2.apellido = teclado.nextLine();
        
        System.out.println("Nombre:");
        e2.nombre = teclado.nextLine();
        
        System.out.println("Libreta Universitaria:");
        e2.lu = teclado.nextInt();
        
        System.out.println("Email:");
        e2.email = teclado.nextLine();
        
        System.out.println("Nota Parcial 1:");
        e2.notaP1 = teclado.nextInt();
        
        System.out.println("Nota Parcial 2:");
        e2.notaP2 = teclado.nextInt();
        
        System.out.println("Nota Recuperatorio:");
        e2.notaR = teclado.nextInt();
        
        System.out.println("Asistencia:");
        e2.asistencia = teclado.nextInt();
        
        return e2;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
