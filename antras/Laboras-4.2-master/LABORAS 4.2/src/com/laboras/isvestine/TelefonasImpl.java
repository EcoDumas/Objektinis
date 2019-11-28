package com.laboras.isvestine;

import com.laboras.bazine.MoketojasImpl;

public class TelefonasImpl extends MoketojasImpl implements  Telefonas {

    int telNumeris;

    public TelefonasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, int telNumeris){

        super( moketojoKodas,  vardas,  pavarde,  adresas,  suma);
        this.telNumeris = telNumeris;
    }

    public int getTelNumeris(){
        return telNumeris;
    }
    public void setTelNumeris(int telNumeris){
        this.telNumeris = telNumeris;
    }
}
