package fecha;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nicor
 */
public class Fecha {
    static boolean esFindeAnio;
    static boolean reiniciar;
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(){
    }
    
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    //GETTERS
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAnio(){
        return anio;
    }
    
    //SETTERS
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //-------------------------------------------------------------
    
    static boolean esBiciesto(int anio){
        if(anio%4 == 0){
            return true;
        }else{
            if(anio%400 == 0){
                return true;
            }else{
                return false;
            }
        }
    }
    
    static boolean esFindeAnio(int dia, int mes){
        if(dia==31 && mes==12){
            return true;
        }else{
            return false;
        }
    }
    
    void reiniciar(int dia, int mes, int anio){
        
    }
    
    static boolean valida(Fecha f2){
        if(f2.mes == 1 || f2.mes==3 || f2.mes==5 || f2.mes==7 || f2.mes==8 || f2.mes==10 || f2.mes==12){
            if(f2.dia <= 31){
                return true;
            }else{
                return false;
            }
        }else if(f2.mes == 4 || f2.mes==6 || f2.mes==9 || f2.mes==11){
            if(f2.dia<=30){
                return true;
            }else{
                return false;
            }
        }else{
            if(esBiciesto(f2.anio) == true){
                if(f2.dia<=29){
                    return true;
                }else{
                    return false;
                }
            }else{
                if(f2.dia<=28){
                    return true;
                }else{
                    return false;
                }
            }
        }
    }
    
    void adelantar(int num){
        if(this.mes < 12){
            if(this.mes == 1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10){
                if(this.dia+num <= 31){
                    this.dia = this.dia+num;
                }else{
                    this.dia = num - (31 - this.dia);
                    this.mes++;
                }
            }else if(this.mes == 4 || this.mes==6 || this.mes==9 || this.mes==11){
                if(this.dia+num <= 30){
                    this.dia = this.dia+num;
                }else{
                    this.dia = num - (31 - this.dia);
                    this.mes++;
                }
            }else{
                if(esBiciesto(this.anio) == true){
                    if(this.dia+num <=29){
                        this.dia = this.dia+num;
                    }else{
                        this.dia = num - (29 - this.dia);
                        this.mes++;
                    }
                }else{
                    if(this.dia+num <=28){
                        this.dia = this.dia+num;
                    }else{
                        this.dia = num - (28 - this.dia);
                        this.mes++;
                    }
                }
            }
        }else{
            if(this.dia+num <= 31){
                this.dia = this.dia+num;
            }else{
                this.dia = num - (31 - this.dia);
                this.mes = 1;
                this.anio++;
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//public class fecha