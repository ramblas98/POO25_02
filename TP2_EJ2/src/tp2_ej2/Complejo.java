
package tp2_ej2;

public class Complejo {
    private double real;
    private double imaginario;

    public Complejo() {
    }
    
    public Complejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }
    
    public double getImaginario(){
        return imaginario;
    }

    public void setReal(double real) {
        this.real = real;
    }
    
    public void setImaginario(double imaginario){
        this.imaginario = imaginario;
    }
    
}
