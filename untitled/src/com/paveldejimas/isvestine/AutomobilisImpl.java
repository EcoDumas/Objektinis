package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis{
    private String marke;
    private int duruSk;
    private boolean varomElektra;

    public AutomobilisImpl (String tipas, boolean variklis, int pagaminimoMetai,
                            String marke, int duruSkaicius, boolean varomaElektra){
        super(tipas, variklis, pagaminimoMetai);
        this.marke = marke;
        this.duruSk = duruSkaicius;
        this.varomElektra = varomaElektra;
    }

    public String getMarke(){
        return marke;
    }

    public void setMarke(String marke){
        this.marke = marke;
    }

    public int getDuruSk(){
        return duruSk;
    }

    public void setDuruSk(int duruSk){
        this.duruSk = duruSk;
    }

    public boolean getVaromElektra(){
        return varomElektra;
    }

    public void setVaromElektra(boolean varomElektra){
        this.varomElektra = varomElektra;
    }

    @Override
    public String toString() {
        return getTipas() + ", " + getVariklis() + ", " + getPagaminMetai() + ", " + getMarke() + ", " + getDuruSk() + ", " + getVaromElektra();
    }
}
