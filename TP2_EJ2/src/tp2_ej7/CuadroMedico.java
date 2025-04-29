package tp2_ej7;
import java.util.List;
import java.util.ArrayList;
public class CuadroMedico {
   private List <Medico> medicos = new ArrayList<>();

   public void insertar(Medico m){
    medicos.add(m);
   }

   public void eliminar(Medico m){
    medicos.remove(m);
   }

   /*
    * 
    */
   //public boolean asignarMedicoHistoria(Historia h, Medico m){
    /*
     if( ( h.getEspecialidad() == m.getEspecialidad() ) && m.disponibilidad()){
        m.agregarHistoria(h);
        h.setMedicoAsignado(m);
        return true;
    }else{
        return false;
    }
     */
    /*
     *  if(h.getEspecialidad().equals(m.getEspecialidad()) && m.disponibilidad()){
        m.agregarHistoria(h);
        h.setMedicoAsignado(m);
        return true;
    }else{
        return false;
    }
     */
   
   //}

   public Medico obtenerMedicoMasDisponible(Especialidad e){
          int i = 0;
          int pmay = -1;
          int n = medicos.size();
          boolean b = false;
          while (i<n && b == false) {
            if(medicos.get(i).getEspecialidad() == e && medicos.get(i).disponibilidad()){
                if(pmay >= 0 && ( medicos.get(i).cantTurnosLibres() > medicos.get(pmay).cantTurnosLibres() ) ){
                    pmay = i;
                }else{
                    if(pmay < 0){
                        pmay = i;
                    }
                }
            }else{
                i++;
            }
          }
          if(pmay >= 0){
            return medicos.get(pmay);
          }else{
            return null;
          }
   }
}
