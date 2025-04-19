package tp2_ej7;
public class TP2_EJ7 {
    public static void main(String[] args) {
        Medico m1 = new Medico("Nortes",5677,"pediatria",5);
        Medico m2 = new Medico("Gutierrez", 4568);
        Medico m3 = new Medico("Mayor", 7890);
        Medico m4 = new Medico("Guillen", 4567, "traumatologia", 5);
        Medico m5 = new Medico("Mateo", 8976, "traumatologia", 5);

        CuadroMedico cMedico = new CuadroMedico();
        cMedico.insertarMedico(m1);
        cMedico.insertarMedico(m2);
        cMedico.insertarMedico(m3);
        cMedico.insertarMedico(m4);
        cMedico.insertarMedico(m5);

        Historia historias[] = new Historia[5];
        historias[0] = new Historia("Rocio", "Leve", "pediatria");
        historias[1] = new Historia("Andres", "grave", "traumatologia");
        historias[2] = new Historia("Juan", "medio", "traumatologia");
        historias[3] = new Historia("Marieta", "leve", "familia");
        historias[4] = new Historia("Alfonso", "medio", "familia");

        for (Historia h : historias) {
            String especialidad = h.getEspecialidad();
            Medico medico = cMedico.obtenerMedicoDisponible(especialidad);
        
            if (medico != null) {
                medico.agregarHistoria(h);
                h.setMedicoAsignado(medico);
                System.out.println(medico.getNombre() + " - " + h.getCP() + " - " + h.getId());
            } else {
                System.out.println("No hay médico disponible para " + h.getCP() + " (" + especialidad + ")");
            }
        }
        
    }
}
