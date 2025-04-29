
package tp2_ej2;

public class TP2_EJ2 {

    public static void main(String[] args) {
        
        Complejo c1 = new Complejo();
      c1.setReal(3);
      c1.setImaginario(5);
      /*
       * IMPRIMIR NUMERO COMPLEJO
       */
      System.out.print("C1: " + "(" + c1.getReal() + "," + c1.getImaginario() + "i)");
     

      Complejo c2 = new Complejo(3,2);
      System.out.print("C2: " + "(" + c2.getReal() + "," + c2.getImaginario() + "i)");
      /*
       * OPERACIONES BASICAS (SUMA,RESTA,PRODUCTO,DIVISION)
       */
      System.err.println();
       System.out.println("SUMA: " + c1.suma(c2));
       System.out.println("RESTA: " + c2.resta(c1));
       System.out.println("PRODUCTO: " + c1.producto(c2));
       System.out.println("DIVISION: " + c1.dividir(c2));

       /*
        * CONJUGADO, ARGUMENTO, POTENCIA, OPUESTO, MODULO
        */
        System.out.println("CONJUGADO DE C1: " +  c1.Conjugado());
        System.out.println("OPUESTO DE C1: " + c1.opuesto());
        System.out.println("ARGUMENTO DE C1: " + c1.argumento());
        System.out.println("POTENCIA DE 8 DE C1: " + c1.potencia(8));

        System.out.println("MODULO DE C2: "  + c1.Modulo());

        /*
         * EQUALS
         */
        if (c1.equals(c2)) {
            System.out.println("C1 y C2 son iguales.");
        } else {
            System.out.println("C1 y C2 son diferentes.");
        }

    }
    
}