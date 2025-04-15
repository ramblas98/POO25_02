package tp2_ej4;

public class TP2_EJ4 {

   public static void main(String[] args) {
        // Creamos un polinomio: 3x^2 + 2x + 1
        double[] coef1 = {1, 2, 3}; // índice = exponente: coef[0] = 1*x^0, coef[1] = 2*x^1, etc.
        Polinomio p1 = new Polinomio(coef1);

        // Creamos otro polinomio: x + 4
        double[] coef2 = {4, 1}; // 4 + 1x
        Polinomio p2 = new Polinomio(coef2);

        // Mostramos los polinomios
        System.out.println("Polinomio 1: " + p1);
        System.out.println("Polinomio 2: " + p2);

        // Sumamos p1 y p2 (forma estática)
        Polinomio suma = Polinomio.sumar(p1, p2);
        System.out.println("Suma: " + suma);

        // Derivamos p1
        Polinomio derivada = p1.derivar();
        System.out.println("Derivada de p1: " + derivada);

        // Evaluamos p1 en x = 2
        double valor = p1.evaluar(2);
        System.out.println("Evaluación de p1 en x=2: " + valor);
    } 
}
