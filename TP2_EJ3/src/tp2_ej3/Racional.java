
package tp2_ej3;

public class Racional {
    
    private int num;
    private int den;

    public Racional() {  
        
    }

    public Racional(int num, int den) {
        
        this.num = num;
        this.den = den;
        
    }

    public int getNum() {
        
        return num;
        
    }

    public int getDen() {
        
        return den;
        
    }

    public void setNum(int num) {
        
        this.num = num;
        
    }

    public void setDen(int den) {
        
        this.den = den;
        
    }

    @Override
    public String toString() {
        
        return "Numerador = " + num + ", Denominador = " + den;
        
    }
    
    public Racional Suma(Racional otro) {
        
        int nuevoDen = this.den * otro.den;
        int nuevoNum = this.num * otro.den + otro.num * this.den;

        return new Racional(nuevoNum, nuevoDen);
    
}
    
    public Racional Resta(Racional otro) {
        
        int nuevoDen = this.den * otro.den;
        int nuevoNum = this.num * otro.den - otro.num * this.den;

        return new Racional(nuevoNum, nuevoDen);
    
}

    
    static Racional Suma2(Racional R1, Racional R2) {
        
        int sumaNum = R1.num + R2.num;
        int sumaDen = R1.den + R2.den;
        
        Racional nuevoSuma = new Racional(sumaNum, sumaDen);
        
        return nuevoSuma;
        
    }
    
    
    
}
