package com.paveldejimas.bazine;

public interface Transportas {

    //Get
    public String getTipas();
    public boolean getVariklis();
    public int getPagaminMetai();

    //Set
    public void setTipas(String tipas);
    public void setVariklis(boolean variklis);
}
