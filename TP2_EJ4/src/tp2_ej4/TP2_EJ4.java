// Declaramos el paquete en el que se encuentra este archivo.
// Los paquetes son una forma de organizar las clases en Java, como si fueran carpetas.
// Es una buena práctica usarlos para mantener el proyecto ordenado.
package tp2_ej4;

// Declaramos la clase principal TP2_EJ4.
// Por convención, el nombre del archivo debe coincidir con el nombre de esta clase.
// Esta clase contiene el método "main", que es el punto de entrada del programa.
public class TP2_EJ4 {

    // Método principal del programa. Java comienza la ejecución aquí.
    // public: accesible desde cualquier parte.
    // static: no necesita que se cree un objeto de la clase para ejecutarse.
    // void: no devuelve ningún valor.
    // main: nombre obligatorio para que Java lo reconozca como punto de inicio.
    // String[] args: permite recibir argumentos desde la consola (aunque no lo usamos aquí).
    public static void main(String[] args) {
        
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
