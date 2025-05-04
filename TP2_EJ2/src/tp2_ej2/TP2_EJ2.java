/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej2;

/**
 *
 * @author aldia
 */
public class TP2_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complejo c1 = new Complejo();
        c1.setRe(1);
        c1.setIm(2);
        Complejo c2 = new Complejo();
        c2.setRe(2);
        c2.setIm(3);
        Complejo res = new Complejo();
        
        //System.out.println(c1.getRe() + " + "  + c1.getIm() + " i ");
        
        //System.out.println(c1);
        
        res = Complejo.suma(c1, c2);
        System.out.println("suma " + res);
        res = Complejo.resta(c1, c2);
        System.out.println("resta " + res);
        res =  Complejo.multiplicacion(c1, c2);
        System.out.println("multiplicacion " + res);
        res = Complejo.dividir(c1, c2);
        System.out.println("divicion " + res);
        //System.out.println();
        System.out.println(c1.conjugado());
        System.out.println(c1.argumento());
        System.out.println(c1.modulo());
        System.out.println(c1.potencia(2));
        System.out.println(c1.opuesto());
        System.out.println(c1.equals(res));
    }
}
