package tp2_ej2;
public class TP2_EJ2 {
    public static void main(String[] args) {
      // Complejo c1 = new Complejo();
      // c1.setReal(2);
      // c1.setImaginario(1);
      // System.out.print("(" + c1.getReal() + "," + c1.getImaginario() + "i)");
      //Complejo z1 = new Complejo(3,4);
      // System.out.println(z1.Modulo());

      //System.out.print(z1.Conjugado());

      Complejo z = new Complejo(1, 2);
      //System.out.println("Número complejo: " + z);
      //System.out.println("Argumento en radianes: " + z.argumento());

      Complejo y = new Complejo(2,3);

      // System.out.print(z.equals(y));

      System.out.println(z.dividir(y));

    }
    
}
