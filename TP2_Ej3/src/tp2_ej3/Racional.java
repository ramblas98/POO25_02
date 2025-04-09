package tp2_ej3;

public class Racional implements Comparable<Racional>{
    private int numerador;
    private int denominador;

    public Racional() {
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
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
    
    void mostrar(){
        System.out.println(this.numerador + "/" + this.denominador);
    }
    
    public void sumarOtro(Racional otro){
        int dr;
        int nr;
        dr = mcd(this.denominador,otro.denominador);
        nr = (this.numerador * (dr / this.denominador) + otro.numerador * (dr / otro.denominador));
        this.numerador = nr;
        this.denominador = dr;
    }
    
    public void restarOtro(Racional otro){
        int dr;
        int nr;
        dr = mcd(this.denominador,otro.denominador);
        nr = (this.numerador * (dr / this.denominador) - otro.numerador * (dr / otro.denominador));
        this.numerador = nr;
        this.denominador = dr;
    }
    
    public void multiplicarOtro(Racional otro){
        this.numerador = this.numerador * otro.numerador;
        this.denominador = this.denominador * otro.denominador;
    }
    
    public void dividirOtro(Racional otro){
        this.numerador = this.numerador * otro.denominador;
        this.denominador = this.denominador * otro.numerador;
    }
    
    public Racional simplificar(){
        Racional a = new Racional();
        while(this.denominador!=0){
            if(this.numerador%2==0&&this.denominador%2==0){
                this.numerador = this.numerador/2;
                this.denominador = this.denominador/2;
            }
            else{
                if(this.numerador%3==0&&this.denominador%3==0){
                    this.numerador = this.numerador/3;
                    this.denominador = this.denominador/3;
                }
                else{
                    if(this.numerador%5==0&&this.denominador%5==0){
                        this.numerador = this.numerador/5;
                        this.denominador = this.denominador/5;
                    }
                    else{
                        if(this.numerador%7==0&&this.denominador%7==0){
                           this.numerador = this.numerador/7;
                           this.denominador = this.denominador/7; 
                        }
                        else break;
                    }
                }
            }
        }
        a.denominador = this.denominador;
        a.numerador = this.numerador;
        return a;
    }
    
    public float aDecimal(){
        return (float) this.numerador/this.denominador;
    }
    
    @Override
    public String toString(){
        String a = "";
        a = a + this.numerador + "/" + this.denominador;
        return a;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Racional otro = (Racional) obj;
        return this.numerador == otro.numerador && this.denominador == otro.denominador;
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.numerador;
        hash = 59 * hash + this.denominador;
        return hash;
    }
    
    @Override
    public int compareTo(Racional otro){
        int a = (int) this.numerador * otro.denominador;
        int b = (int) otro.numerador * this.denominador;
        if(a<b) return -1;
        else{
            if(a>b) return 1;
            else return 0;
        }
    }
    
    public boolean esEquivalente(Racional otro){
        return this.numerador == otro.numerador || this.numerador % otro.numerador == 0 || otro.numerador % this.numerador == 0 && this.denominador == otro.denominador || this.denominador % otro.denominador == 0 || otro.denominador % this.denominador ==0;
    }
    
    public Racional inverso(){
        return new Racional(this.denominador,this.numerador);
    }
    
    public static Racional sumar(Racional a,Racional b){
        a.sumarOtro(b);
        return a;
    }
    
    public static Racional restar(Racional a,Racional b){
        a.restarOtro(b);
        return a;
    }
    
    public static Racional multiplicar(Racional a,Racional b){
        a.multiplicarOtro(b);
        return a;
    }
    
    public static Racional dividir(Racional a,Racional b){
        a.dividirOtro(b);
        return a;
    }
    
    private static int mcd(int a,int b){
        if(a % b == 0) return a;
        else if(b % a == 0) return b;
             else return a*b;
    }

}