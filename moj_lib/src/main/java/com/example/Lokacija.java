package com.example;

//import java.util.Date;
import java.util.UUID;

/**
 * Created by Jurij on 27. 02. 2017.
 */

public class Lokacija {
    private String lokacija_ID;
    private String lokacija_kraj;
    private String lokacija_naslov;
    private double lokacija_x;
    private double lokacija_y;

    public Lokacija(String ID, String Kraj, String Naslov, double X, double Y) {
        this.lokacija_y=Y;
        this.lokacija_x=X;
        this.lokacija_kraj=Kraj;
        this.lokacija_naslov=Naslov;
        this.lokacija_ID=UUID.randomUUID().toString().replaceAll("-", "");
    }
    public void setLokacija_ID (String ID){
        this.lokacija_ID=ID;
    }
    public void setLokacija_kraj (String Kraj){
        this.lokacija_kraj=Kraj;
    }
    public void setLokacija_naslov (String naslov){
        this.lokacija_naslov=naslov;
    }
    public void setLokacija_x(long X){
        this.lokacija_x=X;
    }
    public void setLokacija_y (long Y){
        this.lokacija_y=Y;
    }

    public String getLokacija_ID(){
        return this.lokacija_ID;
    }
    public String getLokacija_kraj(){
        return this.lokacija_kraj;
    }
    public String getLokacija_naslov(){
        return this.lokacija_naslov;
    }
    public double getLokacija_x(){
        return this.lokacija_x;
    }
    public double getLokacija_y(){
        return this.lokacija_y;
    }

    @Override
    public String toString()
    {
        return "Lokacija: "+this.lokacija_ID+" - "+this.lokacija_kraj+", "+this.lokacija_naslov+" ("+this.lokacija_x+","+this.lokacija_y+")";
    }
}
