package com.laboras.bazine;

public class MoketojasImpl implements Moketojas{

    int moketojoKodas;
    String vardas;
    String pavarde;
    String adresas;
    double suma;

    public MoketojasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma){

        this.moketojoKodas = moketojoKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.adresas = adresas;
        this.suma = suma;
    }

    public int getMoketojoKodas(){
        return moketojoKodas;
    }
    public String getVardas(){
        return vardas;
    }
    public void setVardas(String vardas){
        this.vardas = vardas;
    }
    public String getPavarde(){
        return pavarde;
    }
    public void setPavarde(String pavarde){
        this.pavarde = pavarde;
    }
    public String getAdresas(){
        return adresas;
    }
    public void setAdresas(String adresas){
        this.adresas = adresas;
    }
    public double getSuma(){
        return suma;
    }
    public void setSuma(double suma){
        this.suma = suma;
    }
}
