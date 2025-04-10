/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package racional;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Racional x = new Racional();
        x.setNumerador(12);
        x.setDenominador(5);
        System.out.println(x);
        Racional y = new Racional();
        y.setNumerador(3);
        y.setDenominador(4);
        System.out.println(y);
        Racional z ;
        z = x.multiplicar(y);
        if(z!=null){
            System.out.println(z);
        }
        z = x.sumar(y);
        if(z!=null){
            System.out.println(z);
        }
        z = x.restar(y);
        if(z!=null){
            System.out.println(z);
        }
        System.out.println("Simplificar: "+x.simplificar());
        System.out.println(x.division(y));
    }

}
