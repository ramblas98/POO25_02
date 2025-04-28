package tp2_ej7;


public class TP2_Ej7 {

    public static void main(String[] args) {
        Medico m1 = new Medico("Nortes",5677,2);
        Medico m2 = new Medico("Gutierrez",4568,0);
        Medico m3 = new Medico("Mayor",7890,0);
        Medico m4 = new Medico("Guillen",4567,1);
        Medico m5 = new Medico("Mateo",8976,1);
        
        CuadroMedico equipoMedico = new CuadroMedico();
        equipoMedico.insertarMedico(m1);
        equipoMedico.insertarMedico(m2);
        equipoMedico.insertarMedico(m3);
        equipoMedico.insertarMedico(m4);
        equipoMedico.insertarMedico(m5);
        
        Historia listaPacientes[] = new Historia[5];
        listaPacientes[0] = new Historia("Rocio",0,2);
        listaPacientes[1] = new Historia("Andres",2,1);
        listaPacientes[2] = new Historia("Juan",1,1);
        listaPacientes[3] = new Historia("Marieta",0,0);
        listaPacientes[4] = new Historia("Alfonso",1,0);
        
        
        for(int i=0;i<5;i++){
            if(equipoMedico.asignar(listaPacientes[i])){
                System.out.println("Medico: " + listaPacientes[i].getMedicoAsignado().getNombre());
                System.out.println("Paciente: " + listaPacientes[i].getCodigopaciente());
                System.out.println("Numero de historia: " + listaPacientes[i].getId() + "\n------------");
            }
        }
        
    }
    
}
