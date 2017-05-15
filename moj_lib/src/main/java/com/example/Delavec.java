package com.example;

/**
 * Created by Jurij on 27. 02. 2017.
 */
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Delavec {
    private User oseba;
    private List<Termin> seznam_terminov = new ArrayList<>();

    public Delavec(User Nova_oseba){
        this.oseba=Nova_oseba;
    }

    public void setOseba(User Nova_oseba){
        this.oseba=Nova_oseba;
    }
    public User getOseba(){
        return this.oseba;
    }
    public void setPacienti( ArrayList<Termin> Nov_seznam){
        this.seznam_terminov= Nov_seznam;
    }
    public List<Termin> getPacienti(){
        if(!seznam_terminov.isEmpty()){
            return this.seznam_terminov;
        }
        //ArrayList<Pacient> dummy;
        //dummy.add(0,temp);
        return this.seznam_terminov;
    }
    public void dodajTermin(Termin a)
    {
        seznam_terminov.add(a);
    }
    @Override
    public String toString(){
        return oseba.toString()+"\nSt terminov:"+seznam_terminov.size();
    }
}
