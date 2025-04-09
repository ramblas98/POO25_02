package tp2_ej3;

import java.util.ArrayList;
import java.util.List;

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
        int max;
        if(this.numerador>this.denominador) max = this.numerador;
        else max = this.denominador;
        List <Integer> pri = gPrimos(max);
        while(this.numerador>1){
            for(int i=0;i<pri.size();i++){
                if(this.numerador%pri.get(i)==0&&this.denominador%pri.get(i)==0){
                this.numerador = this.numerador/pri.get(i);
                this.denominador = this.denominador/pri.get(i);
                }
            }
        }
        a.denominador = this.denominador;
        a.numerador = this.numerador;
        return a;
    }
    
    public static List<Integer> gPrimos(int l){
        List<Integer> primos = new ArrayList<>();
        
        for(int i= 2; i<l; i++){
            if(esPrimo(i)) primos.add(i);
        }
        return primos;
    }
    
    private static boolean esPrimo(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        
        for(int i=3; i*i <= n; i+=2){
            if(n%i == 0) return false;
        }
        return true;
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