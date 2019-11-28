package com.laboras.isvestine;

import com.laboras.bazine.MoketojasImpl;

public class SildymasImpl extends MoketojasImpl implements Sildymas {

    double kubai;

    public SildymasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, double kubai){
        super( moketojoKodas,  vardas,  pavarde,  adresas,  suma);
        this.kubai = kubai;
    }

    public double getKubai(){
        return kubai;
    }
    public void setKubai(double kubai){
        this.kubai = kubai;
    }
}
