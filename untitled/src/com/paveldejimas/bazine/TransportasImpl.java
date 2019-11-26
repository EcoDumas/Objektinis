package com.paveldejimas.bazine;

public class TransportasImpl implements Transportas{

    private String tipas;
    private boolean variklis;
    private int pagaminMetai;

    public TransportasImpl (String tipas, boolean variklis, int pagaminimoMetai){
        this.tipas = tipas;
        this.variklis = variklis;
        this.pagaminMetai = pagaminimoMetai;
    }

    public String getTipas(){
        return tipas;
    }

    public void setTipas(String tipas){
        this.tipas = tipas;
    }

    public boolean getVariklis(){
        return variklis;
    }

    public void setVariklis(boolean variklis){
        this.variklis = variklis;
    }

    public int getPagaminMetai(){
        return pagaminMetai;
    }

}
