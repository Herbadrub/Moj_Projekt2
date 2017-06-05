package com.example;

/**
 * Created by Jurij on 28. 02. 2017.
 */

public class Termin {
    private Pacient pacient;
    private String opis;
    private String datum;
    private String id_delavca;

    public Termin(Pacient pacient, String opis, String datum,String delavec) {
        this.pacient = pacient;
        this.opis = opis;
        this.datum = datum;
        this.id_delavca=delavec;
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

    public String getId_delavca() {
        return id_delavca;
    }

    public void setId_delavca(String id_delavca) {
        this.id_delavca = id_delavca;
    }

    @Override
    public String toString(){
        return "OB: "+this.datum+"\nOpis: "+this.opis+"\n"+pacient.toString();
    }
}
