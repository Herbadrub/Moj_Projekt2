package com.example;

/**
 * Created by Jurij on 2. 06. 2017.
 */

public class Oseba {
    private String oseba_ID;
    private String oseba_ime;
    private String oseba_priimek;

    public Oseba(){
        this.oseba_ID="null";
        this.oseba_ime="null";
        this.oseba_priimek="null";
    }
    public Oseba(String idOseba, String Ime, String priimek){
        this.oseba_ID=idOseba;
        this.oseba_ime=Ime;
        this.oseba_priimek=priimek;
    }

    public String getOseba_ID() {
        return oseba_ID;
    }

    public void setOseba_ID(String oseba_ID) {
        this.oseba_ID = oseba_ID;
    }

    public String getOseba_ime() {
        return oseba_ime;
    }

    public void setOseba_ime(String oseba_ime) {
        this.oseba_ime = oseba_ime;
    }

    public String getOseba_priimek() {
        return oseba_priimek;
    }

    public void setOseba_priimek(String oseba_priimek) {
        this.oseba_priimek = oseba_priimek;
    }

    @Override
    public String toString(){
        return "\nOseba: "+this.oseba_ID+" - "+this.oseba_ime+" "+this.oseba_priimek;
    }
}
