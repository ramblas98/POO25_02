/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_ej4;

/**
 *
 * @author aldia
 */
public class Polinomio {
     // Atributo que guarda el grado del polinomio (por ejemplo: grado 2 → x²)
    private int grado;
    
    // Arreglo de números decimales (tipo double) que guarda los coeficientes del polinomio.
    // El índice del arreglo representa la potencia de x.
    // Por ejemplo: coeficientes[0] es el término independiente, coeficientes[1] es el coeficiente de x, etc.
    private double[] coeficientes;

    // Constructor que recibe un arreglo de coeficientes como parámetro.
    // Por ejemplo, si recibimos [3.0, 2.0, 1.0], representa el polinomio: 3 + 2x + 1x²
    public Polinomio(double[] coeficientes) {
        // El grado del polinomio es el tamaño del arreglo menos 1.
        this.grado = coeficientes.length - 1;
        
        // Clonamos el arreglo para evitar que se modifique desde fuera de la clase.
        this.coeficientes = coeficientes.clone();
    }

    // Segundo constructor: recibe el grado del polinomio como un número entero.
    // Crea un arreglo con todos los coeficientes en cero.
    public Polinomio(int grado) {
        // Guardamos el grado recibido
        this.grado = grado;
        
        // Creamos un arreglo de tamaño grado + 1 (porque también se incluye el término independiente)
        // Todos los valores son inicialmente cero por defecto.
        this.coeficientes = new double[grado + 1];
    }

    // Método de instancia: suma otro polinomio (p) al polinomio actual.
    // La palabra "public" significa que este método puede ser llamado desde fuera de la clase.
    // La palabra "void" indica que este método **no devuelve nada** (no tiene return).
    // "Polinomio p" es el parámetro que se recibe: otro objeto de tipo Polinomio que queremos sumar.
    public void sumar(Polinomio p) {
        
        // Calculamos el mayor grado entre el polinomio actual (this) y el que recibimos (p)
        // "Math.max(a, b)" es una función de Java que devuelve el mayor entre a y b
        int maxGrado = Math.max(this.grado, p.grado);

        // Creamos un nuevo arreglo de coeficientes del tamaño del mayor grado + 1 (para incluir x^0)
        double[] nuevoCoef = new double[maxGrado + 1];

        // Sumamos los coeficientes del polinomio actual al nuevo arreglo
        // "this" se usa para referirse a los atributos del objeto actual (el que llama al método)
        for (int i = 0; i <= this.grado; i++) {
            nuevoCoef[i] += this.coeficientes[i];
        }

        // Sumamos los coeficientes del polinomio recibido (p) al nuevo arreglo
        for (int i = 0; i <= p.grado; i++) {
            nuevoCoef[i] += p.coeficientes[i];
        }

        // Actualizamos el grado del polinomio actual (this) con el nuevo grado
        this.grado = maxGrado;

        // Reemplazamos los coeficientes del polinomio actual por los nuevos ya sumados
        this.coeficientes = nuevoCoef;
    }


    // Método de instancia: Restar otro polinomio al actual
    public void restar(Polinomio p) {
        int maxGrado = Math.max(this.grado, p.grado);
        double[] nuevoCoef = new double[maxGrado + 1];

        for (int i = 0; i <= this.grado; i++) nuevoCoef[i] += this.coeficientes[i];
        for (int i = 0; i <= p.grado; i++) nuevoCoef[i] -= p.coeficientes[i];

        this.grado = maxGrado;
        this.coeficientes = nuevoCoef;
    }

    // Método de instancia: Multiplicar por otro polinomio
    public void multiplicar(Polinomio p) {
        double[] resultado = new double[this.grado + p.grado + 1];

        for (int i = 0; i <= this.grado; i++) {
            for (int j = 0; j <= p.grado; j++) {
                resultado[i + j] += this.coeficientes[i] * p.coeficientes[j];
            }
        }

        this.grado = resultado.length - 1;
        this.coeficientes = resultado;
    }

    // Método de instancia: divide el polinomio actual entre otro (divisor)
    // Devuelve un arreglo con dos Polinomios: el cociente y el residuo
    public Polinomio[] dividir(Polinomio divisor) {
        
        // Verificamos si el divisor es un polinomio nulo (grado 0 y coeficiente 0)
        // Si es así, lanzamos una excepción de tipo ArithmeticException
        // En Java, "throw" se usa para lanzar errores manualmente
        if (divisor.grado == 0 && divisor.coeficientes[0] == 0)
            throw new ArithmeticException("División por polinomio cero");

        // Clonamos el arreglo de coeficientes del polinomio actual (para no modificar el original)
        double[] dividendoCoef = this.coeficientes.clone();

        // Creamos un arreglo para almacenar el cociente
        // Su tamaño es la diferencia de grados + 1 (o al menos 1 si el grado es menor)
        double[] cociente = new double[Math.max(0, this.grado - divisor.grado + 1)];

        // Variable que representa el grado del dividendo (se irá reduciendo en el bucle)
        int gradoDividendo = this.grado;

        // Bucle principal: mientras el grado del dividendo sea mayor o igual que el del divisor
        while (gradoDividendo >= divisor.grado) {

            // Calculamos el coeficiente del término principal del cociente
            // Es el coeficiente de mayor grado del dividendo dividido por el del divisor
            double coef = dividendoCoef[gradoDividendo] / divisor.coeficientes[divisor.grado];

            // Calculamos la posición en el arreglo de coeficientes del cociente
            int exp = gradoDividendo - divisor.grado;

            // Asignamos el coeficiente en la posición correcta
            cociente[exp] = coef;

            // Restamos el producto del divisor por este término del cociente al dividendo
            for (int i = 0; i <= divisor.grado; i++) {
                dividendoCoef[exp + i] -= coef * divisor.coeficientes[i];
            }

            // Bajamos el grado del dividendo y continuamos
            gradoDividendo--;
        }

        // Creamos objetos Polinomio para el cociente y el residuo
        Polinomio pCociente = new Polinomio(cociente);
        Polinomio pResiduo = new Polinomio(dividendoCoef);

        // Devolvemos ambos en un arreglo (de tipo Polinomio[])
        return new Polinomio[]{pCociente, pResiduo};
    }


    // Métodos estáticos
    
    // Métodos estáticos: NO necesitan una instancia del objeto para ser llamados.
    // Se pueden invocar directamente desde la clase, por ejemplo: Polinomio.sumar(p1, p2)

    // Método estático para sumar dos polinomios (p1 y p2)
    public static Polinomio sumar(Polinomio p1, Polinomio p2) {
        // Creamos una copia del primer polinomio
        Polinomio resultado = new Polinomio(p1.coeficientes);

        // Llamamos al método de instancia "sumar" para sumarle p2 al resultado
        resultado.sumar(p2);

        // Devolvemos el resultado final como nuevo objeto Polinomio
        return resultado;
    }
    /*
    Método de instancia -> Necesita un objeto creado con new para ser usado. -> objeto.metodo()
    Método estático -> No necesita un objeto, se llama desde la clase directamente. -> Clase.metodo()
    */


    public static Polinomio restar(Polinomio p1, Polinomio p2) {
        // Crea una copia de p1 y le resta p2 usando el método de instancia
        Polinomio resultado = new Polinomio(p1.coeficientes);
        resultado.restar(p2);
        return resultado;
    }

    public static Polinomio multiplicar(Polinomio p1, Polinomio p2) {
        // Crea una copia de p1 y lo multiplica por p2
        Polinomio resultado = new Polinomio(p1.coeficientes);
        resultado.multiplicar(p2);
        return resultado;
    }

    public static Polinomio[] dividir(Polinomio p1, Polinomio p2) {
        // Llama directamente al método de instancia dividir en p1
        return p1.dividir(p2);
    }
    /*
    Un método estático se usa sin crear un objeto, 
    y sirve cuando queremos trabajar con datos que 
    ya tenemos (como dos objetos Polinomio), 
    sin modificar ninguno directamente.
    Esto es parte de la programación orientada a objetos (POO),
    que separa la lógica de los objetos individuales 
    (instancias) y la lógica general (estática).
    */

    // Método para evaluar el valor del polinomio en un punto x usando el Algoritmo de Horner
    public double evaluar(double x) {
        // Creamos una variable para ir acumulando el resultado
        double resultado = 0;

        // Recorremos los coeficientes desde el término de mayor grado hasta el término constante (grado 0)
        for (int i = grado; i >= 0; i--) {
            // Aplicamos el paso de Horner: multiplicamos el resultado anterior por x y le sumamos el coeficiente actual
            resultado = resultado * x + coeficientes[i];
        }

        // Retornamos el valor del polinomio evaluado en x
        return resultado;
    }


    // Derivar el polinomio
    public Polinomio derivar() {
        if (grado == 0) return new Polinomio(new double[]{0});

        double[] derivada = new double[grado];
        for (int i = 1; i <= grado; i++) {
            derivada[i - 1] = i * coeficientes[i];
        }
        return new Polinomio(derivada);
    }

    // Integrar el polinomio (integral indefinida)
    public Polinomio integrar() {
        double[] integral = new double[grado + 2];
        for (int i = 0; i <= grado; i++) {
            integral[i + 1] = coeficientes[i] / (i + 1);
        }
        return new Polinomio(integral);
    }

// Método de instancia que calcula las raíces de un polinomio si su grado es 1 o 2
public double[] calcularRaices() {
    // Si el grado del polinomio es 1 (es decir, una recta como ax + b)
    if (grado == 1) {
        // Se aplica la fórmula x = -b / a
        // coeficientes[0] es el término independiente (b), coeficientes[1] es el coeficiente de x (a)
        return new double[]{ -coeficientes[0] / coeficientes[1] };
    }

    // Si el grado es 2 (cuadrático, es decir ax^2 + bx + c)
    else if (grado == 2) {
        // Se extraen los coeficientes del arreglo
        double a = coeficientes[2]; // Coeficiente de x^2
        double b = coeficientes[1]; // Coeficiente de x
        double c = coeficientes[0]; // Término independiente

        // Se calcula el discriminante: b² - 4ac
        double discriminante = b * b - 4 * a * c;

        // Si el discriminante es positivo, hay dos raíces reales distintas
        if (discriminante > 0) {
            return new double[]{
                (-b + Math.sqrt(discriminante)) / (2 * a), // Primera raíz
                (-b - Math.sqrt(discriminante)) / (2 * a)  // Segunda raíz
            };
        }

        // Si el discriminante es exactamente cero, hay una única raíz real
        else if (discriminante == 0) {
            return new double[]{ -b / (2 * a) }; // Raíz doble
        }

        // Si el discriminante es negativo, no hay raíces reales (serían complejas)
        else {
            return new double[]{}; // Se devuelve un arreglo vacío
        }
    }

    // Si el polinomio es de grado mayor a 2, no está soportado por este método
    else {
        // Se lanza una excepción para indicar que no se puede calcular
        throw new UnsupportedOperationException("Solo se soportan polinomios de grado <= 2");
    }
}

// Este método sirve para devolver una representación en forma de texto del objeto Polinomio

// @Override indica que este método está sobrescribiendo un método de la clase base (en este caso, Object)
@Override
public String toString() {
    // StringBuilder es una clase especial de Java que se usa para construir cadenas de texto de forma eficiente
    // Es mejor que usar concatenación con "+" muchas veces, porque es más rápido y consume menos memoria
    StringBuilder sb = new StringBuilder();

    // Recorremos los coeficientes desde el término de mayor grado hasta el constante (de atrás para adelante)
    for (int i = grado; i >= 0; i--) {
        double coef = coeficientes[i]; // Obtenemos el coeficiente del término actual

        // Si el coeficiente es 0, se omite (porque no aporta nada al polinomio)
        if (coef == 0) continue;

        // Si ya hay algo en el StringBuilder y el coeficiente actual es positivo, agregamos un " + "
        if (sb.length() > 0 && coef > 0) sb.append(" + ");
        // Si el coeficiente es negativo, agregamos un " - "
        else if (coef < 0) sb.append(" - ");

        // Si el valor absoluto del coeficiente no es 1 (o si es el término independiente), lo mostramos
        // Esto evita que se muestre "1x^2", por ejemplo
        if (Math.abs(coef) != 1 || i == 0) sb.append(Math.abs(coef));

        // Si el exponente (i) es mayor que 0, agregamos la parte "x"
        if (i > 0) {
            sb.append("x");
            // Si el exponente es mayor que 1, agregamos el exponente como "x^i"
            if (i > 1) sb.append("^" + i);
        }
    }

    // Si no se agregó nada al StringBuilder (porque todos los coeficientes eran 0), devolvemos "0"
    return sb.length() == 0 ? "0" : sb.toString();
}
}
