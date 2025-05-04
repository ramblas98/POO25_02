/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_ej6;

import java.util.Scanner;

/**
 *
 * @author aldia
 */
public class Persona {
    private String apellido;
    private String nombre;
    private long dni;

    public Persona() {
    }

    public Persona(String apellido, String nombre, long dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
     static Persona nuevo(){
        Scanner teclado = new Scanner(System.in);
        
        Persona p2 = new Persona();
        
        System.out.println("Apellido: ");
        p2.apellido = teclado.nextLine();
        
        System.out.println("Nombre: ");
        p2.nombre = teclado.nextLine();
        
        System.out.println("DNI: ");
        p2.dni = teclado.nextInt();
        
        return p2;
    }
    
}
