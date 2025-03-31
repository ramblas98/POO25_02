
package ejemplo1;

import java.util.Scanner;

public class EJEMPLO1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int s = teclado.nextInt();
        String n = teclado.next();
        String[] notas = {"DO","DO#","RE","RE#","MI","FA","FA#","SOL","SOL#","LA","LA#","SI"};
        int aux=0;
        for(int i = 0; i < 12 ;i++){
            if(n.equals(notas[i])){
                aux = i - s;
                if(aux<0){
                    aux = 12 + aux;
                    break;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(notas[aux]);
    }
    
}
