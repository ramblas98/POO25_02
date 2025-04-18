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
            if(anio%400 == 0 && anio%100 == 0){
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
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        
        normalizar();
             
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
    
    void adelantar1(int num){
        if(this.mes < 12){
            if(this.mes == 4 || this.mes==6 || this.mes==9 || this.mes==11){
                if(this.dia+num <= 30){
                    this.dia = this.dia+num;
                }else{
                    this.dia = num - (30 - this.dia);
                    this.mes++;
                }
            }else if(this.mes == 2){
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
            }else{                
                if(this.dia+num <= 31){
                    this.dia = this.dia+num;
                }else{
                    this.dia = num - (31 - this.dia);
                    this.mes++;
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
        
        normalizar();
    }
    
    void adelantar2(int num){
        dia = dia + num;
        normalizar();
    }

    public String toString() {
        return  dia + "/" + mes + "/" + anio;
    }
    
    public void normalizar(){
        while(dia > diaDelMes(mes, anio)){
            dia = dia - diaDelMes(mes, anio);
            mes++;
            if(mes > 12){
                mes = mes - 12;
                anio++;
            }
        }
    }
    
    public int diaDelMes(int m, int a){
        if(m==2){
            if(esBiciesto(a) == true){
                return 29;
            }else{
                return 28;
            }
        }else if(m==4 || m==6 || m==9 || m==11){
            return 30;
        }else{
            return 31;
        }
    }
    
    public Fecha clonar(){
        return new Fecha(dia, mes, anio);
    }
    
    public int comparar(Fecha f2){
        if(anio == f2.anio){
            if(mes == f2.mes){
                if(dia == f2.dia){
                    return 0;
                }else{
                    if(dia > f2.dia){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }else{
                if(mes > f2.mes){
                    return 1;
                }else{
                    return -1;
                }
            }
        }else{
            if(anio > f2.anio){
                return 1;
            }else{
                return -1;
            }
        }
    }
    
    public int diferenciaEnDias(Fecha f2){
        return Math.abs(cantidadDeDias(this) - cantidadDeDias(f2));
    }
    
    public int cantidadDeDias(Fecha f){
        int total;
        total = f.anio * 365 + f.dia;
        for(int mes=0; mes<f.mes; mes++){
            if(f.mes==4 || f.mes==6 || f.mes==9 || f.mes==11){
                total = total + 30;
            }else if(f.mes==2){
                if(esBiciesto(f.anio) == true){
                    total = total + 29;
                }else{
                    total = total +28;
                }
            }else{
                total = total + 31;
            }
        }
        return total;
    }
    
    
    
    
}//public class fecha