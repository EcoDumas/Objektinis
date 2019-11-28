package com.laboras.isvestine;

import com.laboras.bazine.MoketojasImpl;

public class InternetasImpl extends MoketojasImpl implements Internetas {

    String ip;

    public InternetasImpl(int moketojoKodas, String vardas, String pavarde, String adresas, double suma, String ip){
        super( moketojoKodas,  vardas,  pavarde,  adresas,  suma);
        this.ip = ip;
    }

    public String getIp(){
        return ip;
    }
    public void setIp(String ip){
        this.ip = ip;
    }
}
