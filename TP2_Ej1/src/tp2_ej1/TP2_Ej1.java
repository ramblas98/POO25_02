package tp2_ej1;

public class TP2_Ej1 {

    public static void main(String[] args) {
    Fecha hoy = Fecha.hoy();
    Fecha nacimiento = new Fecha(15, 4, 2000);

    System.out.println("Fecha actual: " + hoy);
    System.out.println("Fecha de nacimiento: " + nacimiento);
    System.out.println("Edad (días): " + hoy.diferenciaEnDias(nacimiento));
    System.out.println("¿Nacimiento válida?: " + nacimiento.valida());
    System.out.println("Formato personalizado: " + nacimiento.formatear("dd-mm-aaaa"));

    Fecha copia = nacimiento.clonar();
    copia.adelantar(10);
    System.out.println("10 días después: " + copia);
   }
}