/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package racional;

/**
 *
 * @author HP ZBOOK G5
 */
public class Racional {

    private int numerador;
    private int denominador;

    public Racional() {
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public double getNumerador() {
        return numerador;
    }
    
    public double getDenominador() {
        return denominador;
    }


    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        if(denominador!=0){
            return numerador+"/"+denominador;
        }else{
            return "No existe el denominador";
        }
    }
    public Racional sumar(Racional r){
        if(r.denominador!=0 && this.denominador!=0){
            Racional x = new Racional();
            if(r.denominador==this.denominador){
                x.numerador = this.numerador+r.numerador;
                x.denominador = r.denominador;
            }else{
                int divisor = this.denominador*r.denominador;
                x.numerador = divisor/this.denominador*this.numerador+divisor/r.denominador*r.numerador;
                x.denominador = divisor;
            }
            return x.simplificar();
        }else{
            return null;
        }
    }
    
    public Racional restar(Racional r){
        if(r.denominador!=0 && this.denominador!=0){
            Racional x = new Racional();
            if(r.denominador==this.denominador){
                x.numerador = this.numerador-r.numerador;
                x.denominador = r.denominador;
            }else{
                int divisor = this.denominador*r.denominador;
                x.numerador = divisor/this.denominador*this.numerador-divisor/r.denominador*r.numerador;
                x.denominador = divisor;
            }
            return x.simplificar();
        }else{
            return null;
        }
    }
    
    public Racional multiplicar(Racional r){
        if(r.denominador!=0 && this.denominador!=0){
            Racional x = new Racional();
            x.numerador = r.numerador*this.numerador;
            x.denominador = r.denominador*this.denominador;
            return x.simplificar();
        }else{
            return null;
        }
    }

    public Racional division(Racional r) {
        return new Racional(this.numerador * r.denominador, this.denominador * r.numerador).simplificar();
    }
   
    public Racional simplificar(){
       return new Racional(numerador/mcd(numerador, denominador),denominador/mcd(numerador, denominador));
    }
    
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
