/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej1;

/**
 *
 * @author aldia
 */
public class TP2_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fecha f1 = new Fecha();
        f1.setDia(7);
        f1.setMes(4);
        f1.setAnio(2025);
        //System.out.println(f1.getDia() + "/" + f1.getMes() + "/" + f1.getAnio());
        System.out.println(f1);
        
        if(Fecha.esBisiesto(f1.getAnio() ))
            System.out.println(f1.getAnio() + " Es un anio bisiesto");
        else System.out.println(f1.getAnio() + " No es un anio bisiesto");
        
        if(Fecha.esFinDeAnio(f1.getDia() , f1.getMes()))
            System.out.println("Es fin de anio");
        else System.out.println("No es fin de anio");
        
        Fecha nacimiento = new Fecha(8, 7, 2003);
        Fecha hoy = Fecha.hoy();

        // Calcular edad
        int edad = hoy.getAnio() - nacimiento.getAnio();
        if (hoy.getMes() < nacimiento.getMes() || 
           (hoy.getMes() == nacimiento.getMes() && hoy.getDia() < nacimiento.getDia())) {
            edad--;  // Si aún no cumplió años este año
        }
        System.out.println("Edad aproximada: " + edad + " anios");

        //Comparar dos fechas
        //Fecha f2 = new Fecha(10, 4, 2025);
        //Fecha f3 = new Fecha(5, 4, 2025);
        int resultado = nacimiento.comparar(hoy);
        if (resultado > 0) {
            System.out.println(nacimiento.toString() + " es despues de " + hoy.toString());
        } else if (resultado < 0) {
            System.out.println(nacimiento.toString() + " es antes de " + hoy.toString());
        } else {
            System.out.println("Ambas fechas son iguales");
        }

        //Evento futuro (cumpleaños)
        Fecha proximoCumple = new Fecha(8, 7, hoy.getAnio());
        if (proximoCumple.comparar(hoy) < 0) {
            proximoCumple.setAnio(hoy.getAnio() + 1);  // Ya pasó este año, poner el próximo
        }

        int diasParaCumple = hoy.diferenciaEnDias(proximoCumple);
        System.out.println("Faltan " + diasParaCumple + " dias para tu cumpleanios");

        // Formatear fecha
        System.out.println("Hoy es: " + hoy.formatear("DD-MM-AAAA"));
        System.out.println("Hoy (formato largo): " + hoy.formatear("AAAA/MM/DD"));

        //Adelantar días
        Fecha viaje = hoy.clonar();
        viaje.adelantar(10);
        System.out.println("Tu viaje sera el: " + viaje.toString());

        //Validar fecha
        Fecha invalida = new Fecha(31, 2, 2025);
        System.out.println("La fecha 31/2/2025 es valida? " + invalida.valida());
        
        //normalizar
        Fecha f = new Fecha(35, 3, 2025); // 35 de marzo
        String fechaIngresada = f.toString();
        f.normalizar(); // Se corrige automáticamente
        System.out.println("Esta fecha " + fechaIngresada + " en realidad es: " + f.toString());
        
        //dias de un mes 
        int dias = f.diasDelMes(3, 2025);
        System.out.println("Dias del mes " + f.getMes() + ":" + dias);
    }
    
}
