
package tp2_ej5;

import java.util.Scanner;

public class Estudiante {
    
    private String apellidos;
    private String nombres;
    private int lu;
    private String gmail;
    //public boolean regular; Depende de otros Atributos por lo tanto es un Metodo
    private int notaP1;
    private int notaP2;
    private int notaR;
    private int asistencia;
    
    public Estudiante() {
    
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

    public String getGmail() {
        
        return gmail;

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

    public void setGmail(String gmail) {
        
        this.gmail = gmail;

    }

    public void setNotaP1(int p1) {
        
        this.notaP1 = p1;

    }

    public void setNotaP2(int p2) {
        
        this.notaP2 = p2;
    
    }
    
    public void setNotaR(int r) {
        
        this.notaR = r;

    }
    
    public void setAsistencia(int asis) {
        
        this.asistencia = asis;

    }

    @Override
    public String toString() {
        
        return "Estudiante{" + "Apellidos = " + apellidos + ", Nombres = " + nombres + ", LU = " + lu + ", Gmail ="  + gmail + ", NotaP1 = " + notaP1 + ", notaP2 = " + notaP2 + ", notaR = " + notaR + ", asistencia = " + asistencia + '}';
        
    }
    
    

    public void IngresarDatos() {
    
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese El Apellido/s: ");
        String apellido = teclado.nextLine();
        setApellidos(apellido);
    
        System.out.println("Ingrese El Nombre/s: ");
        String nombre = teclado.nextLine();
        setNombres(nombre);

        System.out.println("Ingrese El DNI: ");
        int dni = teclado.nextInt();
        setLu(dni);

        System.out.println("Ingrese El Gmail: ");
        String gmails = teclado.nextLine();
        setGmail(gmails);
    
        System.out.println("Ingrese El Resultado del Parcial N1: ");
        int p1 = teclado.nextInt();
        setNotaP1(p1);
    
        System.out.println("Ingrese El Resultado del Parcial N2: ");
        int p2 = teclado.nextInt();
        setNotaP2(p2);
    
        System.out.println("Ingrese El Resultado del Recuperatorio: ");
        int r = teclado.nextInt();
        setNotaR(r);
    
        System.out.println("Ingrese El Numero de Asistencias: ");
        int asis = teclado.nextInt();
        setAsistencia(asis);

    }

    public boolean Regular(Estudiante otro) {
        
        int total = Total(otro);
        
        if (otro.notaP1 >= 6 && otro.notaP2 >= 6 && total >= 80) {

            return true;

        } else if (otro.notaR >= 6 && total >= 80) {
        
            return true;
        
        } else {
            
            return false;
            
        }

    }
    
    private static int Total(Estudiante otro) {
        
        int porcentaje = otro.asistencia * 100 / 24;
        
        return porcentaje;
        
    }
    
} //Llave Final