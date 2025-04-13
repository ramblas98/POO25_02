package tp2_ej2;

public class Complejo {
    private double real;
    private double imaginario;
    

    /*
     * Constructor
     */
    public Complejo() {
    }
    
    public Complejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    /*
     * GETTERS
     */
    public double getReal() {
        return real;
    }
    
    public double getImaginario(){
        return imaginario;
    }
    /*
     * SETTERS
     */
    public void setReal(double real) {
        this.real = real;
    }
    
    public void setImaginario(double imaginario){
        this.imaginario = imaginario;
    }


    /*
     * METODOS ESTATICOS
     */

     public static Complejo suma(Complejo z1, Complejo z2){
        double parteReal = z1.real + z2.real;
        double parteImaginaria = z1.imaginario + z2.imaginario;
        Complejo resultado = new Complejo();
        resultado.setImaginario(parteImaginaria);
        resultado.setReal(parteReal);
        return resultado;
    }

    public static Complejo resta(Complejo z1, Complejo z2){
        double parteReal = z1.real - z2.real;
        double parteImaginaria = z1.imaginario - z2.imaginario;
        Complejo resultado = new Complejo(parteReal,parteImaginaria);
        return resultado;
    }

    public static Complejo producto(Complejo z1, Complejo z2){
        double parteReal = (z1.real*z2.real) - (z1.imaginario*z2.imaginario);
        double parteImaginario = (z1.real * z2.imaginario) + (z1.imaginario * z2.real);
        Complejo resultado = new Complejo(parteReal,parteImaginario);
        return resultado;
    }

    public static Complejo division(Complejo z1, Complejo z2){
        double a = z1.real;
        double b = z1.imaginario;
        double c = z2.real;
        double d = z2.imaginario;
        double denominador = c*c + d*d;
        double parteReal = (a*c + b*d)/denominador;
        double parteImaginaria = (b*c - a*d)/denominador;
        return new Complejo(parteReal,parteImaginaria);
    }

    /*
     * METODOS
     */

    @Override
    public String toString() {
        return "(" + real + "," + imaginario + "i)";
    }
    
    public Complejo suma(Complejo otro){
        double parteReal = real + otro.real;
        double parteImaginaria = imaginario + otro.imaginario;
        return new Complejo(parteReal, parteImaginaria);
        
    }
    
    public Complejo resta(Complejo otro){
        double parteReal = otro.real - real;
        double parteImaginaria = otro.imaginario - imaginario;
        return new Complejo(parteReal,parteImaginaria);
    }
    
    public Complejo producto(Complejo otro){
        double parteReal = ((otro.real*real) - (otro.imaginario*imaginario));
        double parteImaginaria =  (otro.real * imaginario)  +  (otro.imaginario * real);
        return new Complejo(parteReal, parteImaginaria);
    }
    
    public Complejo dividir(Complejo otro) {
        double a = this.real;
        double b = this.imaginario;
        double c = otro.real;
        double d = otro.imaginario;

        double denominador = c * c + d * d;

        double parteReal = (a * c + b * d) / denominador;
        double parteImaginaria = (b * c - a * d) / denominador;

        return new Complejo(parteReal, parteImaginaria);
    }

    public Complejo Conjugado(){
        return new Complejo(real,-imaginario);
    }    
    public double Modulo(){
        double modulo = Math.sqrt(Math.pow(real, 2) + Math.pow(imaginario, 2));
        return modulo;
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
        if (this.real != other.real) {
            return false;
        }
        return Double.doubleToLongBits(this.imaginario) == Double.doubleToLongBits(other.imaginario);
    }
    
    public double argumento(){
        return Math.atan2(real, imaginario);
    }
}
