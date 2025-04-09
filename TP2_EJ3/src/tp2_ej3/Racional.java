/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej3;

/**
 *
 * @author leona
 */
public class Racional {
  private int numerador;
  private int denominador;

    public Racional() {
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
   
    public Racional sumar(Racional r){
      Racional n;
      n.denominador=this.denominador+r.denominador;
      n.numerador=this.numerador+r.numerador;
        
      //  return this.numerador+r.numerador
          return n;
    }
  public Racional restar(Racional r){
      Racional n;
      n.denominador=(this.denominador)-(r.denominador);
      n.numerador=(this.numerador)-(r.numerador);
      return n;     
  }

  public Racional multiplicar(Racional r ){
      Racional n;
      n.numerador=(this.numerador)*(r.numerador);
      n.denominador=(this.denominador)*(r.denominador);
      return n;
  }
  
  public Racional dividir(Racional r){
      
      return
  }
  public Racional simplificar(Racional r){
      
      return
  }
  public Racional adecimal(Racional r){
      
      return
  }
}