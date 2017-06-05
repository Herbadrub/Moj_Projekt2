package com.example;

/**
 * Created by Jurij on 27. 02. 2017.
 */

public class Pacient {
    private Oseba oseba;
    private String problem;
    private Lokacija dom;

    public Pacient(Oseba Nova_oseba, String opis, Lokacija Dom){
        this.dom=Dom;
        this.problem=opis;
        this.oseba=Nova_oseba;
    }
    public void setOseba(Oseba Nova_oseba){
        this.oseba=Nova_oseba;
    }
    public void setProblem(String opis){
        this.problem=opis;
    }
    public void setDom(Lokacija lokacija){
        this.dom=lokacija;
    }
    public Oseba getOseba(){
        return this.oseba;
    }
    public String getProblem(){
        return this.problem;
    }
    public Lokacija getDom(){
        return this.dom;
    }

    @Override
    public String toString()
    {
        return oseba.toString()+"\n"+this.problem+"\n"+this.dom.toString();
    }
}
