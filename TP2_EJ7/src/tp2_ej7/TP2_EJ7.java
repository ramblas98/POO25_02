/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ej7;

/**
 *
 * @author aldia
 */
import static tp2_ej7.Especialidad.FAMILIA;
import static tp2_ej7.Especialidad.PEDIATRIA;
import static tp2_ej7.Especialidad.TRAUMATOLOGIA;
import static tp2_ej7.Estado.GRAVE;
import static tp2_ej7.Estado.LEVE;
import static tp2_ej7.Estado.MEDIO;

public class TP2_EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Medico m1 = new Medico("Nortes", 5677, PEDIATRIA);
         Medico m2 = new Medico("Gutierrez", 4568, FAMILIA);
         Medico m3 = new Medico("Mayor", 7890, FAMILIA);
         Medico m4 = new Medico("Guillen", 4567, TRAUMATOLOGIA);
         Medico m5 = new Medico("Mateo", 8976, TRAUMATOLOGIA);
 
         CuadroMedico cMedico = new CuadroMedico();
         cMedico.InsertarMedico(m1);
         cMedico.InsertarMedico(m2);
         cMedico.InsertarMedico(m3);
         cMedico.InsertarMedico(m4);
         cMedico.InsertarMedico(m5);
 
         Historia historias[] = new Historia[5];
         historias[0] = new Historia("Rocio", "A1223", LEVE, PEDIATRIA);
         historias[1] = new Historia("Andres", "A12234", GRAVE, TRAUMATOLOGIA);
         historias[2] = new Historia("Juan", "A1225", MEDIO, TRAUMATOLOGIA);
         historias[3] = new Historia("Marieta", "A1226", LEVE, FAMILIA);
         historias[4] = new Historia("Alfonso", "A1227", MEDIO, FAMILIA);
 
         for (Historia h : historias) {
             
             Especialidad especialidad = h.getEspecialidadMed();
             Medico medico = cMedico.ObtenerMedicoDis(especialidad);
         
             if (medico != null) {
                 
                 medico.AgregarHistoria(h);
                 h.setMedicoAsig(medico);
                 System.out.println(medico.getNombre() + " - " + h.getNombre() + " - " + h.getIdentificador());
                 
             } else {
                 
                 System.out.println("No Hay Médico Disponible para " + h.getCodPaciente() + " (" + especialidad + ")");
                 
             }
         }
    }
    
}
