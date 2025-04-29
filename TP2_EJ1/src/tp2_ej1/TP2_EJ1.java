package tp2_ej1;

public class TP2_EJ1 {

    public static void main(String[] args) {
        
        Fecha f1 = new Fecha();
         f1.setDia(20);
         f1.setMes(12);
         f1.setAnio(2080);
         
        System.out.println(f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        
        if(Fecha.esBisiesto(f1.getAnio())){
            System.out.println(f1.getAnio() + " es un anio bisiesto");
        }else{
            System.out.println(f1.getAnio() + " no es un anio bisiesto");
        }
        
        if(esFinDeAnio(f1.getDia(), f1.getMes())){
            System.out.println("Es fin de anio");
        }else{
            System.out.println("No es fin de anio");
        }
        
        if(f1.valida()){
            System.out.println("La fecha es valida");
        }else{
            System.out.println("La fecha no es valida");
        }
        
        f1.reiniciar(1, 3, 2024);
        System.out.println(f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        
        f1.adelantar(61);
        System.out.println(f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        
        Fecha otra = new Fecha();
         otra.setDia(1);
         otra.setMes(1);
         otra.setAnio(2025);
        if (f1.comparar(otra) == 0) {
            System.out.println(f1.toString() + " es igual a " + otra.toString());
        }else if(f1.comparar(otra) > 0){
            System.out.println(f1.toString() + " es mayor que " + otra.toString());
        }else{
            System.out.println(f1.toString() + " es menor que " + otra.toString());
        }
        
        System.out.println("La diferencia en dias entre las fechas " + f1.toString() + " y " + otra.toString() + " es de: " + f1.diferenciaEnDias(otra));
        
    }
    
    private static boolean esFinDeAnio(int dia, int mes) {
        return dia == 31 && mes == 12;
    }
    
}