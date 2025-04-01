package ejemplo1;
import java.util.*;
public class EJEMPLO1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        String n = scanner.next();
        n = n.toUpperCase();
        String tonos[] = {"DO","DO#","RE","RE#","MI","FA","FA#","SOL","SOL#","LA","LA#","SI"};
        int tamanio = tonos.length;
        /*
        Se busca el indice de la nota en el array
        */
        int index = -1;
        boolean bandera = false;
        int i = 0;
        while(i<tamanio && bandera == false){
            if(tonos[i].equals(n)){
                index = i;
                bandera = true;
            }else{
                i++;
            }
        }
        /*
        Se hace el siguiente calculo: restando el indice por el entero de entrada
        luego se suma el resultado de la resta por el tamaño del array
        para evitar numeros negativos, por ultimo se toma el resultado de esa operacion 
        y se lo divide con el tamaño del array mediante mod, para asi se mantenga
        en el rango de 0 a 11
        */
        int indexAux = (index - s  +tamanio) % tamanio;
        System.out.println(tonos[indexAux]);
    }
}
