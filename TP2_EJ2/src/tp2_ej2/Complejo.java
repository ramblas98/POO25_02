/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej2;

/**
 *
 * @author aldia
 */
public class Complejo {
    private double re;
    private double im;

    public Complejo() {
    }

    public Complejo(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
       if(im > 0) return re + "," + im + "i" ;
       else return re + "" + im + "i";
    }
 
    public static Complejo suma(Complejo c1 ,  Complejo c2){
        Complejo res = new Complejo();
        res.re = c1.re + c2.re;
        res.im = c1.im + c2.im;
        return res;
    }
    public static Complejo resta(Complejo c1, Complejo c2){
        Complejo res = new Complejo();
        res.re = c1.re - c2.re;
        res.im = c1.im - c2.im;
        return res;
    }
    
    public static Complejo multiplicacion(Complejo c1, Complejo c2){
        Complejo res = new Complejo();
        res.re = c1.re * c2.re - c1.im * c2.im; 
        res.im = c1.re * c2.im + c1.im * c2.re;
        return  res;
    }
    
    public static Complejo dividir(Complejo c1, Complejo c2){
        Complejo res1 = new Complejo();
        Complejo c3 = new Complejo();
        double denominador;
        c3.re = c2.re;
        c3.im = -c2.im;
        
        res1 = Complejo.multiplicacion(c1, c3);
        denominador = c2.re * c2.re + c2.im * c2.im;
        
        res1.re = res1.re / denominador;
        res1.im = res1.im / denominador;
       
        return res1;
    }
    
    public Complejo suma(Complejo otro){
        Complejo res = new Complejo();
        res.re = re + otro.re;
        res.im = im + otro.im;
        
        return res;
    }
    
    public Complejo resta(Complejo otro){
        Complejo res = new Complejo();
        res.re = re - otro.re;
        res.im = im - otro.im;
        
        return res;
    }
    
    public Complejo multiplicar(Complejo otro){
        Complejo res = new Complejo();
        res.re = (re * otro.re) - (im * otro.im);
        res.im = (im * otro.re) + (re * otro.im);
        return res;
    }
    
    public Complejo dividir(Complejo otro){
        Complejo res = new Complejo();
        double denominador;
        
        denominador = otro.re * otro.re + otro.im * otro.im;
        
        res.re = (re * otro.re + im * otro.im) / denominador;
        res.im = (im * otro.re - re * otro.im) / denominador;
        
        return res;
    }
    
    public Complejo conjugado(){
        return new Complejo(this.re,-this.im);
    }
    
    public double argumento(){
        return Math.atan2(this.im,this.re);
    }
            
    public double modulo(){
        return Math.sqrt(Math.pow(this.re, 2) + Math.pow(this.im,2));
    }
    
    public Complejo opuesto(){
        return new Complejo(-re,-im);
    }
    public Complejo potencia(int n){
        double r = modulo();
        double theta = argumento();

        // Fórmula De Moivre: z^n = r^n * (cos(nθ) + i sin(nθ))
        double rPotencia = Math.pow(r, n);
        double nuevoReal = rPotencia * Math.cos(n * theta);
        double nuevoImaginario = rPotencia * Math.sin(n * theta);
        return new Complejo(nuevoReal,nuevoImaginario);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        //pregunta si el objeto esta vacio
        if (obj == null) {
            return false;
        }
        // si la clase del complejo es distinta a la clase del objeto ingresado
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        
        if (this.re != other.re) {
            return false;
        }
        return (this.im) == (other.im);
    }
    
    
}

    

