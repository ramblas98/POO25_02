/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej6;

import java.util.Scanner;

/**
 *
 * @author nicor
 */
public class Persona {
    private String apellido;
    private String nombre;
    private int dni;
    
    public Persona(){
        
    }

    //CONTRUCTOR
    public Persona(String apellido, String nombre, int dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //GETTERS
    public String getApellido() {
        return apellido;
    }
    
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    
    //SETTERS
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    //-------------------------------------------------------------------------------------
    
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
} //public class persona
