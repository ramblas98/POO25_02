package ejemplo1;

import java.util.Scanner;

public class EJEMPLO1 {

    public static void main(String[] args) {
      
    Scanner teclado = new Scanner(System.in);
    
    String[] notas = {"DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI"};
    
    System.out.println ("Ingrese Un Numero: ");
    int S = teclado.nextInt ();
    teclado.nextLine();
    
    System.out.println ("Ingrese La Nota: ");
    String N = teclado.nextLine ();
    
    int index = -1;
    
    for (int i = 0; i < notas.length; i++) {
            
        if (notas[i].equals(N)) {
                
            index = i;
            break;
                
        }
    }

    int realIndex = (index - S + 12) % 12;
    
    System.out.println("Nota: ");
    
    System.out.println(notas[realIndex]);
    
    }
    
}
