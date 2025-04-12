/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej3;

/**
 *
 * @author HP ZBOOK G5
 */
public class TP2_EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Complejo x = new Complejo();
        x.setReal(3);
        x.setImaginaria(2);
        System.out.println(x);
        Complejo y = new Complejo();
        y.setReal(1);
        y.setImaginaria(-4);
        System.out.println(y);
        
        Complejo z;
        z = x.sumar(y);
        System.out.println("La suma de dos complejos es: "+z);
        
        z = x.restar(y);
        System.out.println("La resta de dos complejos es: "+z);
        
        z = x.multiplicar(y);
        System.out.println("El producto de dos complejos es: "+z);
        
        z = x.division(y);
        System.out.println("La division de dos complejos es: "+z);
        
        System.out.println("El modulo de dos complejos es: "+x.modulo());
        
        System.out.println("El argumento de x: "+x.argumento());
        
        z = x.conjugado();
        System.out.println("El producto de dos complejos es: "+z);
        
        System.out.println(x.equals(y));
        
        System.out.println("La suma de dos complejos es: "+Complejo.sumar(x, y));
        System.out.println("La resta de dos complejos es: "+Complejo.restar(x, y));
        System.out.println("El producto de dos complejos es: "+Complejo.multiplicar(x, y));
        System.out.println("La division de dos complejos es: "+Complejo.division(x, y));
    }
    
}
