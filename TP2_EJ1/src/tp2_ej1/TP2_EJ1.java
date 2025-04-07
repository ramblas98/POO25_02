/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author profeblas
 */
public class TP2_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fecha f1 = new Fecha();
        f1.setDia(7);
        f1.setMes(4);
        f1.setAnio(2025);
        System.out.println(f1.getDia() + " / " +
                           f1.getMes() + " / " +
                           f1.getAnio());
        System.out.println(f1);
        
        if (Fecha.esBisiesto( f1.getAnio() ))
            System.out.println(f1 + " perteneces a un año bisiesto");
        
    }
    
}
