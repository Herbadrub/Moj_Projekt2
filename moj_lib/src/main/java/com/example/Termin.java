package com.example;

/**
 * Created by Jurij on 28. 02. 2017.
 */

public class Termin {
    private Pacient pacient;
    private String opis;
    private String datum;

    public Termin(Pacient pacient, String opis, String datum) {
        this.pacient = pacient;
        this.opis = opis;
        this.datum = datum;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public String toString(){
        return "OB: "+this.datum+"\nOpis: "+this.opis+"\n"+pacient.toString();
    }
}
