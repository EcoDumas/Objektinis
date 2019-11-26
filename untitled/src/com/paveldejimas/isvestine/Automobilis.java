package com.paveldejimas.isvestine;

public interface Automobilis {

    //Get
    public String getMarke();
    public int getDuruSk();
    public boolean getVaromElektra();

    //Set
    public void setMarke(String marke);
    public void setDuruSk(int duruSk);
    public void setVaromElektra(boolean varomElektra);
}
