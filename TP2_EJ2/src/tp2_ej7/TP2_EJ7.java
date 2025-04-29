package tp2_ej7;

import java.util.ArrayList;
import java.util.List;

public class TP2_EJ7 {

    public static boolean asignarMedicoHistoria(Historia h, Medico m) {
        if (h.getEspecialidad().equals(m.getEspecialidad()) && m.disponibilidad()) {
            m.agregarHistoria(h);
            h.setMedicoAsignado(m);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Historia> misPacientes = new ArrayList<>();
        
        // Crear el cuadro médico
        CuadroMedico misDoc = new CuadroMedico();

        // Crear médicos
        Medico m1 = new Medico("Nortes", 5677, Especialidad.PEDIATRIA, 10);
        Medico m2 = new Medico("Gutiérrez", 4568, Especialidad.FAMILIA, 10);
        Medico m3 = new Medico("Mayor", 7890, Especialidad.FAMILIA, 10);
        Medico m4 = new Medico("Guillén", 4567, Especialidad.TRAUMATOLOGIA, 10);
        Medico m5 = new Medico("Mateo", 8976, Especialidad.TRAUMATOLOGIA, 10);

        // Insertar médicos en el cuadro médico
        misDoc.insertar(m1);
        misDoc.insertar(m2);
        misDoc.insertar(m3);
        misDoc.insertar(m4);
        misDoc.insertar(m5);

        // Crear historias de los pacientes
        misPacientes.add(new Historia("Rocío", Estado.LEVE, Especialidad.PEDIATRIA));
        misPacientes.add(new Historia("Andrés", Estado.GRAVE, Especialidad.TRAUMATOLOGIA));
        misPacientes.add(new Historia("Juan", Estado.MEDIO, Especialidad.TRAUMATOLOGIA));
        misPacientes.add(new Historia("Marieta", Estado.LEVE, Especialidad.FAMILIA));
        misPacientes.add(new Historia("Alfonso", Estado.MEDIO, Especialidad.FAMILIA));

        // Asignar médicos disponibles a las historias
        for (int i = 0; i < misPacientes.size(); i++) {
            Historia h = misPacientes.get(i);
            Medico m = misDoc.obtenerMedicoMasDisponible(h.getEspecialidad());
            if (m != null) {
                boolean asignado = asignarMedicoHistoria(h, m);
                if (asignado) {
                    System.out.println(m.getNombre() + " - " + h.getCodigo() + " - " + h.getId());
                }
            }
        }

        // Dar de alta a los pacientes
        for (int i = 0; i < misPacientes.size(); i++) {
            Historia h = misPacientes.get(i);
            Medico m = h.getMedico();
            if (m != null) {
                h.setAlta(true);
                m.darAlta(h.getId());
            }
        }
    }
}
