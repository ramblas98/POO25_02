package tp2_ej3;
public class TP2_EJ3 {
    public static void main(String[] args) {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(3, 4);

        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);

        Racional suma = Racional.sumar(r1, r2);
        System.out.println("Suma: " + suma);

        Racional resta = Racional.restar(r1, r2);
        System.out.println("Resta: " + resta);

        Racional producto = Racional.multiplicar(r1, r2);
        System.out.println("Producto: " + producto);

        Racional cociente = Racional.dividir(r1, r2);
        System.out.println("Cociente: " + cociente);

        System.out.println("R1 en decimal: " + r1.aDecimal());
        System.out.println("Comparación R1 vs R2: " + r1.comparar(r2)); 
    }
}
