package tp2_ej5;
import java.util.Scanner;
public class TP2_EJ5 {
    public static void main(String[] args) {
        
        Estudiante lista [] = new Estudiante[100];
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        char opc;
        do{
            lista[n] = Estudiante.ingresarDatos();
            System.out.println("Ingresar otro estudiante? si = 1; no = 0");
            opc = scanner.next().charAt(0);
            n++;
        }while(opc!='N');
        scanner.close();

       System.out.println("REGULARES: ");

       for (int i = 0; i < n; i++) {
        if(lista[i].regular()){
            System.out.println(lista[i]);
        }
       }
    }
}
