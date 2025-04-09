
package tp2_ej3;

public class Complejo {
    private double real;
    private double imaginaria;

    public Complejo() {
    }

    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }
    
    public double getReal() {
        return real;
    }
    
    public double getImaginaria() {
        return imaginaria;
    }


    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    @Override
    public String toString() {
        if(imaginaria>=0){
            return real + "+" + imaginaria + "i" ;
        }else{
            return real + "" + imaginaria + "i" ;
        }
    }
    
    public Complejo sumar(Complejo otro){
        Complejo x = new Complejo();
        x.real = this.real+otro.real;
        x.imaginaria = this.imaginaria+otro.imaginaria;
        return x;
    }
    
    public Complejo restar(Complejo otro){
        Complejo x = new Complejo();
        x.real = this.real - otro.real;
        x.imaginaria = this.imaginaria - otro.imaginaria;
        return x;
    }
    
    public Complejo multiplicar(Complejo otro){
        Complejo x = new Complejo();
        x.real = otro.real*this.real-otro.imaginaria*this.imaginaria;
        x.imaginaria = otro.real*this.imaginaria+otro.imaginaria*this.real;
        return x;
    }
    
    public Complejo division(Complejo otro){
        double denominador = Math.pow(otro.real, 2)+Math.pow(otro.imaginaria, 2);
        Complejo x = new Complejo();
        x.real = otro.real/denominador;
        x.imaginaria = -otro.imaginaria/denominador;
        return this.multiplicar(x);
    }
    
    public double modulo() {
        return Math.sqrt(Math.pow(this.real, 2)+Math.pow(this.imaginaria, 2));
    }
    
    public double argumento() {
        return Math.atan2(this.imaginaria, this.real);
    }
    
     public Complejo conjugado(){
        return new Complejo(this.real,-this.imaginaria);
    }
     
     public boolean equals(){
         
     }
}