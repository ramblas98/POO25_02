package tp2_ej5;

import java.util.Scanner;

public class TP2_Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estudiante lista[] = new Estudiante[100];
        int n=0,opc,i;
        do{
            lista[n] = Estudiante.nuevo();
            lista[n].incAsistencias(21);
            n++;
            System.out.println("Quiere seguir agregando alumnos? 0 = NO / 1 = SI");
            opc = teclado.nextInt();
        }while(opc!=0);
        for(i=0;i<n;i++){
            if(Estudiante.regular(lista[i])) System.out.println(lista[i].getNombres() +" "+ lista[i].getApellidos()+" "+ "estado: Regular");
            else System.out.println(lista[i].getNombres() +" "+ lista[i].getApellidos()+" "+ "estado: Libre");
        }
    }
}