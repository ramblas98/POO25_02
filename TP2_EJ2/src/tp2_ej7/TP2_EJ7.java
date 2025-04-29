package tp2_ej7;
import java.util.ArrayList;
import java.util.List;

public class TP2_EJ7 {
    public static boolean asignarMedicoHistoria(Historia h, Medico m){
        if( ( h.getEspecialidad() == m.getEspecialidad() ) && m.disponibilidad()){
            m.agregarHistoria(h);
            h.setMedicoAsignado(m);
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        List <Historia> misPacientes = new ArrayList<>();
    
        CuadroMedico misDoc = new CuadroMedico();
        for (int i = 0; i < misPacientes.size(); i++) {

            Medico m = misDoc.obtenerMedicoMasDisponible(misPacientes.get(i).getEspecialidad());
            if(m != null){
                boolean b = asignarMedicoHistoria(misPacientes.get(i), m);
                if(b){
                    System.out.println(  m.getNombre() + "-" +"-" + "");
                }
            }
        }
        for (int i = 0; i < misPacientes.size(); i++) {
            Medico m = misPacientes.get(i).getMedico();
            if(misPacientes.get(i).getMedico() != null){
              
                  misPacientes.get(i).setAlta(true);
                  m.darAlta(misPacientes.get(i).getId());
                 
                
                 

            }
        }
    }
}
