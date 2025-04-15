package tp2_ej5;
import java.util.Scanner;

public class Estudiante {
    private String apellidos;
    private String nombres;
    private int lu;
    private String email;
    // static public boolean regular = true;
    static private int cantClases = 35;
    private int notaP1;
    private int notaP2;
    private int notaR;
    private int asistencia;
    
    public Estudiante(){}

    public  Estudiante(String apellidos, String nombres, int lu, String email,int notaP1,int notaP2,int notaR,int asistencia){
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.lu = lu;
        this.email = email;
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.notaR = notaR;
        this.asistencia = asistencia;
    }

    public String getNombre(){
        return nombres;
    }

    public String getApellido(){
        return apellidos;
    }

    public int getLu(){
        return lu;
    }

    public String getEmail(){
        return email;
    }

    public boolean regular(){
        int total = Estudiante.cantClases;
        float porcentajeAsistencia = ((float)asistencia / total )*100;
        if (porcentajeAsistencia >= 80) {
            if((notaP1 >= 60 && notaP2 < 60) || (notaP2 >= 60 && notaP1 < 60)){
                if(notaR >= 60){
                   return true;
                }else{
                    return false;
                }
            }else if (notaP1 >= 60 && notaP2 >= 60) {

                return true;
                
            }else{
                return false;
            }
        } else {
            return false;
        }
    }
    public int getNotaP1(){
        return notaP1;
    }

    public int getNotaP2(){
        return notaP2;
    }

    public int getNotaR(){
        return notaR;
    }

    public int getAsistencia(){
        return asistencia;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
   
    public void setNotaP1(int notaP1) {
        this.notaP1 = notaP1;
    }

    public void setNotaP2(int notaP2) {
        this.notaP2 = notaP2;
    }

    public void setNotaR(int notaR) {
        this.notaR = notaR;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Estudiante [apellidos=" + apellidos + ", nombres=" + nombres + ", lu=" + lu + ", email=" + email
              + ", notaP1=" + notaP1 + ", notaP2=" + notaP2 + ", notaR=" + notaR
                + ", asistencia=" + asistencia + "]";
    }

    public static Estudiante ingresarDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar tus datos: ");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("LU: ");
        int lu = scanner.nextInt();
        System.out.println("Nota del parcial 1:");
        int notaP1 = scanner.nextInt();
        System.out.println("Nota del parcial 2: ");
        int notaP2 = scanner.nextInt();
        int notaR = 0;
         if((notaP1 >= 60 && notaP2 < 60)  || (notaP2>=60 && notaP1 <60)){
            System.out.println("Nota del recuperatorio");
            notaR = scanner.nextInt();
        }
        
        System.out.println("Asistencia: ");
        int asistencia = scanner.nextInt();
        
        Estudiante estudiante = new Estudiante(apellido,nombre,lu,email,notaP1,notaP2,notaR,asistencia);
        return estudiante;
        
    }

    public int incAsistencia(){
        return asistencia + 1;
    }

    public int incAsistencia(int n){
        return asistencia+n;
    }
}
