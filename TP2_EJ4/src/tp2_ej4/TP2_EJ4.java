/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej4;

/**
 *
 * @author aldia
 */
public class TP2_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // -------------------------
        // CREACIÓN DE POLINOMIOS
        // -------------------------

        // Creamos un arreglo de coeficientes para representar el polinomio 3x^2 + 2x + 1.
        // El índice representa el exponente: coef[0] = 1*x^0, coef[1] = 2*x^1, coef[2] = 3*x^2
        double[] coef1 = {1, 2, 3};

        // Creamos un objeto de la clase Polinomio utilizando el constructor con coeficientes.
        // p1 es una instancia (objeto) de la clase Polinomio. Aquí usamos orientación a objetos.
        Polinomio p1 = new Polinomio(coef1);

        // Creamos un segundo polinomio: x + 4
        // Representado como coef[0] = 4 (término independiente), coef[1] = 1 (término lineal)
        double[] coef2 = {4, 1};
        Polinomio p2 = new Polinomio(coef2);

        // -------------------------
        // VISUALIZACIÓN DE POLINOMIOS
        // -------------------------

        // Mostramos los polinomios en consola.
        // Java llamará automáticamente al método toString() de la clase Polinomio.
        System.out.println("Polinomio 1: " + p1);
        System.out.println("Polinomio 2: " + p2);

        // -------------------------
        // SUMA DE POLINOMIOS
        // -------------------------

        // Sumamos los dos polinomios usando un método estático de la clase Polinomio.
        // Usamos la clase directamente sin necesidad de un objeto específico.
        Polinomio suma = Polinomio.sumar(p1, p2);

        // Mostramos el resultado de la suma.
        System.out.println("Suma: " + suma);

        // -------------------------
        // DERIVADA DE UN POLINOMIO
        // -------------------------

        // Calculamos la derivada del polinomio p1 utilizando un método de instancia.
        // Este método devuelve un nuevo objeto Polinomio con la derivada.
        Polinomio derivada = p1.derivar();

        // Mostramos la derivada en consola.
        System.out.println("Derivada de p1: " + derivada);

        // -------------------------
        // EVALUACIÓN DEL POLINOMIO
        // -------------------------

        // Evaluamos el polinomio p1 en el punto x = 2.
        // Esto devuelve un valor numérico (double) usando el algoritmo de Horner.
        double valor = p1.evaluar(2);

        // Mostramos el resultado de la evaluación.
        System.out.println("Evaluación de p1 en x=2: " + valor);
    }
}
