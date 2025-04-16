
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
        
        return this.num + "/" + this.den;
        
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

    public Racional Multiplicar(Racional otro) {
        
        int nuevoDen = this.den * otro.den;
        int nuevoNum = this.num * otro.num;
        
        return new Racional(nuevoNum, nuevoDen);
        
    }
    
    public Racional Dividir(Racional otro) {
        
        int nuevoNum = this.num * otro.num;
        int nuevoDen = this.den * otro.den;
        
        return new Racional(nuevoNum, nuevoDen);
        
    }
    
    public Racional Simplificar() {
        
        int i = 2;
        int nuevoNum = this.num;
        int nuevoDen= this.den;
        
        while (i <= Math.min(nuevoNum, nuevoDen)) {
            
            if (nuevoNum % i == 0 && nuevoDen % i == 0) {
                
                nuevoNum = nuevoNum / i;
                nuevoDen = nuevoDen / i;
                i = 2;
                
            } else {
                
                i++;
                
            }
            
        }

    return new Racional(nuevoNum, nuevoDen);
        
    }
    
    public double aDecimal() {
        
        double dec = this.num / this.den;
        
        return dec;
        
    } 

    @Override
    public int hashCode() {
        
        int hash = 3;
        hash = 31 * hash + this.num;
        hash = 31 * hash + this.den;
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
        final Racional other = (Racional) obj;
        if (this.num != other.num) {
            return false;
        }
        return this.den == other.den;
        
    }
    
    public static Racional Suma(Racional R1, Racional R2) {
        
        int nuevoNum = R1.getNum() * R2.getDen() + R2.getNum() * R1.getDen();
        int nuevoDen = R1.getDen() * R2.getDen();
        
        return new Racional(nuevoNum, nuevoDen);
        
    }
    
    public static Racional Resta(Racional R1, Racional R2) {
        
        int nuevoNum = R1.getNum() * R2.getDen() - R2.getNum() * R1.getDen();
        int nuevoDen = R1.getDen() * R2.getDen();
        
        return new Racional(nuevoNum, nuevoDen);
        
    }
    
    public static Racional Multiplicar(Racional R1, Racional R2) {
        
        int nuevoNum = R1.getNum() * R2.getNum();
        int nuevoDen = R1.getDen() * R2.getDen();
        
        return new Racional(nuevoNum, nuevoDen);
        
    }
    
    public static Racional Dividir(Racional R1, Racional R2) {
        
        int nuevoNum = R1.getNum() * R2.getDen();
        int nuevoDen = R1.getDen() + R2.getNum();
        
        return new Racional(nuevoNum, nuevoDen);
        
    }
    
    private static int MCD(int a, int b) {
        
        int[] divA = new int[a];
        int[] divB = new int[b];
        
        int i = 1;
        int j = 1;
        int k = 0;
        
        while (i <= a) {
            
            if (a % i == 0) {
                
                divA[k] = i;
                k++;
                
            }
            
            i++;
            
        }
        
        int cantA = k;
        
        k = 0;
        
        while (j <=b) {
            
            if (b % j == 0) {
                
                divB[k] = j;
                k++;
                
            }
            
            j++;
            
        }
        
        int cantB = k;
        
        for (i=cantA-1; i>=0; i--) {
            
            for (j=cantB-1; j>=0; j--) {
                
                if (divA[i] == divB[j]) {
                    
                    return divA[i];
                    
                }
                
            }
            
        }
        
        return 1;
        
    }

    public static int ObtenerMCD(int a, int b) {

        return MCD(a, b);

    }
    
}
