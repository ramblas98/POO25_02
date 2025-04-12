
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.real) ^ (Double.doubleToLongBits(this.real) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.imaginaria) ^ (Double.doubleToLongBits(this.imaginaria) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (Double.doubleToLongBits(this.real) != Double.doubleToLongBits(other.real)) {
            return false;
        }
        return Double.doubleToLongBits(this.imaginaria) == Double.doubleToLongBits(other.imaginaria);
    }
    @Override
    public String toString() {
        if(imaginaria>=0){
            return real + "+" + imaginaria + "i" ;
        }else{
            return real + "" + imaginaria + "i" ;
        }
    }
    
    public static Complejo sumar(Complejo c1, Complejo c2){
        Complejo x = new Complejo();
        x.real = c1.real+c2.real;
        x.imaginaria = c1.imaginaria+c2.imaginaria;
        return x;
    }
    
    public static Complejo restar(Complejo c1, Complejo c2){
        Complejo x = new Complejo();
        x.real = c1.real - c2.real;
        x.imaginaria = c1.imaginaria - c2.imaginaria;
        return x;
    }
    
    public static Complejo multiplicar(Complejo c1, Complejo c2){
        Complejo x = new Complejo();
        x.real = c2.real*c1.real-c2.imaginaria*c1.imaginaria;
        x.imaginaria = c2.real*c1.imaginaria+c2.imaginaria*c1.real;
        return x;
    }
    
    public static Complejo division(Complejo c1, Complejo c2){
        double denominador = Math.pow(c2.real, 2)+Math.pow(c2.imaginaria, 2);
        Complejo x = new Complejo();
        x.real = c2.real/denominador;
        x.imaginaria = -c2.imaginaria/denominador;
        return x.multiplicar(c1);
    }
}