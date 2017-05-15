package com.example;

/**
 * Created by Jurij on 14. 03. 2017.
 */
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.xml.crypto.Data;

public class DataAll {
    private User userMe;
    private ArrayList<Termin> mojiTermini;
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public DataAll(){
        userMe = new User("0","empty","empty");
        mojiTermini = new ArrayList<>();
        flag =0;
    }
    //to je test
    public User getUserMe() {
        return userMe;
    }

    public ArrayList<Termin> getMojiTermini() {
        return mojiTermini;
    }

    public void setUserMe(User userMe) {
        this.userMe = userMe;
    }

    public void setMojiTermini(ArrayList<Termin> mojiTermini) {
        this.mojiTermini = mojiTermini;
    }

    public void addTermin(Termin novi){
        mojiTermini.add(novi);
    }
    public int getSteviloTerminov(){
        return mojiTermini.size();
    }
    public static DataAll scenarijA()
    {
        DataAll da = new DataAll();
        User delavec = new User("0","Jurij","Konovsek");
        da.setUserMe(delavec);

        Lokacija l1= new Lokacija("35z5eg", "Maribor", "Ljulbljanska ulica 1", 46.560004,15.6298197);
        Lokacija l2= new Lokacija("35z5eg", "Maribor", "Ljulbljanska ulica 2", 46.560004,15.6298197);

        User a1= new User("1", "Janez", "janeznik");
        User a2= new User("2", "Janez", "janeznik");
        User a3= new User("3", "Janez", "janeznik");
        User a4= new User("4", "Janez", "janeznik");
        User a5= new User("5", "Janez", "janeznik");
        User a6= new User("6", "Janez", "janeznik");
        User a7= new User("7", "Janez", "janeznik");
        User a8= new User("8", "Janez", "janeznik");
        User a9= new User("9", "Janez", "janeznik");
        User a10= new User("10", "Janez", "janeznik");
        User a11= new User("11", "Janez", "janeznik");
        User a12= new User("12", "Janez", "janeznik");

        Pacient p1= new Pacient(a1, "Bolan1", l1);
        Pacient p2= new Pacient(a2, "Bolan2", l2);
        Pacient p3= new Pacient(a3, "Bolan3", l2);
        Pacient p4= new Pacient(a4, "Bolan4", l2);
        Pacient p5= new Pacient(a5, "Bolan5", l2);
        Pacient p6= new Pacient(a6, "Bolan6", l2);
        Pacient p7= new Pacient(a7, "Bolan7", l2);
        Pacient p8= new Pacient(a8, "Bolan8", l2);
        Pacient p9= new Pacient(a9, "Bolan9", l2);
        Pacient p10= new Pacient(a10, "Bolan10", l2);
        Pacient p11= new Pacient(a11, "Bolan11", l2);
        Pacient p12= new Pacient(a12, "Bolan12", l2);


        Termin t1= new Termin(p1,"Nujni poseg","1.1.1001");
        Termin t2= new Termin(p2,"Nujni poseg","1.1.2020");
        Termin t3= new Termin(p3,"Nujni poseg","1.1.2020");
        Termin t4= new Termin(p4,"Nujni poseg","1.1.2020");
        Termin t5= new Termin(p5,"Nujni poseg","1.1.2020");
        Termin t6= new Termin(p6,"Nujni poseg","1.1.2020");
        Termin t7= new Termin(p7,"Nujni poseg","1.1.2020");
        Termin t8= new Termin(p8,"Nujni poseg","1.1.2020");
        Termin t9= new Termin(p9,"Nujni poseg","1.1.2020");
        Termin t10= new Termin(p10,"Nujni poseg","1.1.2020");
        Termin t11= new Termin(p11,"Nujni poseg","1.1.2020");
        Termin t12= new Termin(p12,"Nujni poseg","1.1.2020");

        da.addTermin(t1);
        da.addTermin(t2);
        da.addTermin(t3);
        da.addTermin(t4);
        da.addTermin(t5);
        da.addTermin(t6);
        da.addTermin(t7);
        da.addTermin(t8);
        da.addTermin(t9);
        da.addTermin(t10);
        da.addTermin(t11);
        da.addTermin(t12);

        return da;
    }
}
