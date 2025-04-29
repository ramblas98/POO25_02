package tp2_ej3;
public class Racional {
    private int numerador;
    private int denominador;

    // Constructores
    public Racional() {
        
        this.numerador = 0;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Getters
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    // Setters
    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplificar();
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.denominador = denominador;
        simplificar();
    }

    // Operaciones básicas (métodos de instancia)
    public void sumar(Racional r) {
        this.numerador = this.numerador * r.denominador + r.numerador * this.denominador;
        this.denominador = this.denominador * r.denominador;
        simplificar();
    }

    public void restar(Racional r) {
        this.numerador = this.numerador * r.denominador - r.numerador * this.denominador;
        this.denominador = this.denominador * r.denominador;
        simplificar();
    }

    public void multiplicar(Racional r) {
        this.numerador *= r.numerador;
        this.denominador *= r.denominador;
        simplificar();
    }

    public void dividir(Racional r) {
        if (r.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        this.numerador *= r.denominador;
        this.denominador *= r.numerador;
        simplificar();
    }

    // Conversión a decimal
    public double aDecimal() {
        return (double) numerador / denominador;
    }

    // Comparación
    public int comparar(Racional r) {
        int a = this.numerador * r.denominador;
        int b = r.numerador * this.denominador;
        return Integer.compare(a, b);
    }

    public String toString() {
        if (denominador == 1) return String.valueOf(numerador);
        return numerador + "/" + denominador;
    }

    // Métodos estáticos
    public static Racional sumar(Racional r1, Racional r2) {
        int num = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
        int den = r1.denominador * r2.denominador;
        return new Racional(num, den);
    }

    public static Racional restar(Racional r1, Racional r2) {
        int num = r1.numerador * r2.denominador - r2.numerador * r1.denominador;
        int den = r1.denominador * r2.denominador;
        return new Racional(num, den);
    }

    public static Racional multiplicar(Racional r1, Racional r2) {
        return new Racional(r1.numerador * r2.numerador, r1.denominador * r2.denominador);
    }

    public static Racional dividir(Racional r1, Racional r2) {
        if (r2.numerador == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return new Racional(r1.numerador * r2.denominador, r1.denominador * r2.numerador);
    }

    // mcd para simplificar
    public static int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    // Simplificar fracción
    private void simplificar() {
        int divisor = mcd(numerador, denominador);
        numerador /= divisor;
        denominador /= divisor;

        // Mantener el signo en el numerador
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    // Obtener copia del objeto
    public static Racional obtener(Racional r) {
        return new Racional(r.numerador, r.denominador);
    }
}
